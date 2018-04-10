/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A response that includes a user token.
 */
public class TokenResponse {
    /**
     * The connection name.
     */
    @JsonProperty(value = "connectionName")
    private String connectionName;

    /**
     * The user token.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Expiration for the token, in ISO 8601 format (e.g. "2007-04-05T14:30Z").
     */
    @JsonProperty(value = "expiration")
    private String expiration;

    /**
     * Get the connectionName value.
     *
     * @return the connectionName value
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Set the connectionName value.
     *
     * @param connectionName the connectionName value to set
     * @return the TokenResponse object itself.
     */
    public TokenResponse withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get the token value.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token value.
     *
     * @param token the token value to set
     * @return the TokenResponse object itself.
     */
    public TokenResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the expiration value.
     *
     * @return the expiration value
     */
    public String expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration value.
     *
     * @param expiration the expiration value to set
     * @return the TokenResponse object itself.
     */
    public TokenResponse withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

}
