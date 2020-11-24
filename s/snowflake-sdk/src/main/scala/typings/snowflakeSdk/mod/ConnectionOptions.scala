package typings.snowflakeSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  /**
    * The full name of your account (provided by Snowflake). Note that your full account name might include additional segments
    * that identify the region and cloud platform where your account is hosted.
    */
  var account: String = js.native
  
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
  var clientSessionKeepAlive: js.UndefOr[Boolean] = js.native
  
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
  var clientSessionKeepAliveHeartbeatFrequency: js.UndefOr[Double] = js.native
  
  /**
    * The default database to use for the session after connecting.
    */
  var database: js.UndefOr[String] = js.native
  
  var jsTreatIntegerAsBigInt: js.UndefOr[Boolean] = js.native
  
  /**
    * Password for the user.
    */
  var password: String = js.native
  
  /**
    * @deprecated
    * The ID for the region where your account is located.
    *
    * This parameter is no longer used because the region information, if required, is included as part of the full account name.
    * It is documented here only for backward compatibility
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The default security role to use for the session after connecting.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * The default schema to use for the session after connecting.
    */
  var schema: js.UndefOr[String] = js.native
  
  /**
    * Snowflake user login name to connect with.
    */
  var username: String = js.native
  
  /**
    * The default virtual warehouse to use for the session after connecting. Used for performing queries, loading data, etc.
    */
  var warehouse: js.UndefOr[String] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(account: String, password: String, username: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSessionKeepAlive(value: Boolean): Self = this.set("clientSessionKeepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSessionKeepAlive: Self = this.set("clientSessionKeepAlive", js.undefined)
    
    @scala.inline
    def setClientSessionKeepAliveHeartbeatFrequency(value: Double): Self = this.set("clientSessionKeepAliveHeartbeatFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSessionKeepAliveHeartbeatFrequency: Self = this.set("clientSessionKeepAliveHeartbeatFrequency", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setJsTreatIntegerAsBigInt(value: Boolean): Self = this.set("jsTreatIntegerAsBigInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsTreatIntegerAsBigInt: Self = this.set("jsTreatIntegerAsBigInt", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setWarehouse(value: String): Self = this.set("warehouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarehouse: Self = this.set("warehouse", js.undefined)
  }
}
