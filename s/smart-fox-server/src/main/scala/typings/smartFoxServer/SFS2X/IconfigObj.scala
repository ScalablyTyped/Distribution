package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconfigObj extends StObject {
  
  /** @type {boolean} Indicates whether the client-server messages console debug should be enabled or not. */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** @type {string} The IP address or host name of the SmartFoxServer 2X instance to connect to. */
  var host: js.UndefOr[String] = js.undefined
  
  /** @type {number} The TCP port of the SmartFoxServer 2X instance to connect to. */
  var port: js.UndefOr[Double] = js.undefined
  
  /** @type {boolean} Use an encrypted SSL connection. */
  var useSSL: js.UndefOr[Boolean] = js.undefined
  
  /** @type {string} The Zone of the SmartFoxServer 2X instance to join during the login process. */
  var zone: js.UndefOr[String] = js.undefined
}
object IconfigObj {
  
  inline def apply(): IconfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconfigObj]
  }
  
  extension [Self <: IconfigObj](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
    
    inline def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
