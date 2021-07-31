package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connection options.
  *
  * See: https://rethinkdb.com/api/javascript/connect/
  */
trait ConnectionOptions extends StObject {
  
  /** The default database (default `test`) */
  var db: js.UndefOr[String] = js.undefined
  
  /** The host to connect to (default `localhost`) */
  var host: js.UndefOr[String] = js.undefined
  
  /** The password for the user account to connect as (default `''`, empty) */
  var password: js.UndefOr[String] = js.undefined
  
  /** The port to connect on (default `28015`) */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * A hash of options to support SSL connections (default `null`). Currently,
    * there is only one option available, and if the `ssl` option is specified,
    * this key is required.
    */
  var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
  
  /** Timeout period in seconds for the connection to be opened (default `20`) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** The user account to connect as (default `admin`) */
  var user: js.UndefOr[String] = js.undefined
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setSsl(value: typings.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
