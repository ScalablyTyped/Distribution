package typings.snowflakeSdk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptions extends StObject {
  
  /**
    * The full name of your account (provided by Snowflake). Note that your full account name might include additional segments
    * that identify the region and cloud platform where your account is hosted.
    */
  var account: String
  
  /**
    * Specifies the name of the client application connecting to Snowflake.
    */
  var application: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the authenticator to use for verifying user login credentials. You can set this to one of the following values:
    *  - SNOWFLAKE: Use the internal Snowflake authenticator. You must also set the password option.
    *  - EXTERNALBROWSER: Use your web browser to authenticate with Okta, ADFS, or any other SAML 2.0-compliant identity provider
    *    (IdP) that has been defined for your account.
    *  - https://<okta_account_name>.okta.com: Use Native SSO through Okta.
    *  - OAUTH: Use OAuth for authentication. You must also set the token option to the OAuth token (see below).
    *  - SNOWFLAKE_JWT: Use key pair authentication. See Using Key Pair Authentication & Key Pair Rotation.
    * The default value is SNOWFLAKE.
    * For more information on authentication, see {@link https://docs.snowflake.com/en/user-guide/admin-security-fed-auth-use.html Managing/Using Federated Authentication}
    *  and {@link https://docs.snowflake.com/en/user-guide/admin-security-fed-auth-use.html OAuth with Clients, Drivers, and Connectors}.
    */
  var authenticator: js.UndefOr[String] = js.undefined
  
  /**
    * By default, client connections typically time out approximately 3-4 hours after the most recent query was executed.
    *
    * If the parameter clientSessionKeepAlive is set to true, the client’s connection to the server will be kept alive
    * indefinitely, even if no queries are executed.
    *
    * The default setting of this parameter is false.
    *
    * If you set this parameter to true, make sure that your program explicitly disconnects from the server when your program
    * has finished. Do not exit without disconnecting.
    */
  var clientSessionKeepAlive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Applies only when `clientSessionKeepAlive` is true)
    *
    * This parameter sets the frequency (interval in seconds) between heartbeat messages.
    *
    * You can loosely think of a connection heartbeat message as substituting for a query and restarting the timeout countdown
    * for the connection. In other words, if the connection would time out after at least 4 hours of inactivity, the heartbeat
    * resets the timer so that the timeout will not occur until at least 4 hours after the most recent heartbeat (or query).
    *
    * The default value is 3600 seconds (one hour). The valid range of values is 900 - 3600. Because timeouts usually occur after
    * at least 4 hours, a heartbeat every 1 hour is normally sufficient to keep the connection alive. Heartbeat intervals of less
    * than 3600 seconds are rarely necessary or useful.
    */
  var clientSessionKeepAliveHeartbeatFrequency: js.UndefOr[Double] = js.undefined
  
  /**
    * The default database to use for the session after connecting.
    */
  var database: js.UndefOr[String] = js.undefined
  
  var jsTreatIntegerAsBigInt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Password for the user. Set this option if you set the authenticator option to SNOWFLAKE or the Okta URL endpoint for your
    * Okta account (e.g. https://<okta_account_name>.okta.com) or if you left the authenticator option unset.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the private key (in PEM format) for key pair authentication.
    * For details, see {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#label-nodejs-key-pair-authentication Using Key Pair Authentication & Key Pair Rotation}.
    */
  var privateKey: js.UndefOr[String | Buffer] = js.undefined
  
  /**
    * Specifies the passcode to decrypt the private key file, if the file is encrypted.
    * For details, see {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#label-nodejs-key-pair-authentication Using Key Pair Authentication & Key Pair Rotation}.
    */
  var privateKeyPass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the local path to the private key file (e.g. rsa_key.p8).
    * For details, see {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#label-nodejs-key-pair-authentication Using Key Pair Authentication & Key Pair Rotation}.
    */
  var privateKeyPath: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    * The ID for the region where your account is located.
    *
    * This parameter is no longer used because the region information, if required, is included as part of the full account name.
    * It is documented here only for backward compatibility
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * The default security role to use for the session after connecting.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * The default schema to use for the session after connecting.
    */
  var schema: js.UndefOr[String] = js.undefined
  
  /**
    * Number of milliseconds to keep the connection alive with no response. Default: 60000 (1 minute).
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the OAuth token to use for authentication. Set this option if you set the authenticator option to OAUTH.
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * Snowflake user login name to connect with.
    */
  var username: String
  
  /**
    * The default virtual warehouse to use for the session after connecting. Used for performing queries, loading data, etc.
    */
  var warehouse: js.UndefOr[String] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(account: String, username: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setAuthenticator(value: String): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    inline def setClientSessionKeepAlive(value: Boolean): Self = StObject.set(x, "clientSessionKeepAlive", value.asInstanceOf[js.Any])
    
    inline def setClientSessionKeepAliveHeartbeatFrequency(value: Double): Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", value.asInstanceOf[js.Any])
    
    inline def setClientSessionKeepAliveHeartbeatFrequencyUndefined: Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", js.undefined)
    
    inline def setClientSessionKeepAliveUndefined: Self = StObject.set(x, "clientSessionKeepAlive", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setJsTreatIntegerAsBigInt(value: Boolean): Self = StObject.set(x, "jsTreatIntegerAsBigInt", value.asInstanceOf[js.Any])
    
    inline def setJsTreatIntegerAsBigIntUndefined: Self = StObject.set(x, "jsTreatIntegerAsBigInt", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPrivateKey(value: String | Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPass(value: String): Self = StObject.set(x, "privateKeyPass", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPassUndefined: Self = StObject.set(x, "privateKeyPass", js.undefined)
    
    inline def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setWarehouse(value: String): Self = StObject.set(x, "warehouse", value.asInstanceOf[js.Any])
    
    inline def setWarehouseUndefined: Self = StObject.set(x, "warehouse", js.undefined)
  }
}
