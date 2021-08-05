package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppConfig extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var identity: js.UndefOr[String] = js.undefined
  
  var isSecure: js.UndefOr[Boolean] = js.undefined
  
  var openWithoutData: js.UndefOr[Boolean] = js.undefined
  
  var port: String | Double
  
  var prefix: js.UndefOr[String] = js.undefined
}
object GetAppConfig {
  
  inline def apply(port: String | Double): GetAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppConfig]
  }
  
  extension [Self <: GetAppConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    inline def setOpenWithoutData(value: Boolean): Self = StObject.set(x, "openWithoutData", value.asInstanceOf[js.Any])
    
    inline def setOpenWithoutDataUndefined: Self = StObject.set(x, "openWithoutData", js.undefined)
    
    inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
