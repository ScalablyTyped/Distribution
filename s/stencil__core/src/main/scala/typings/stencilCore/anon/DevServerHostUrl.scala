package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevServerHostUrl extends StObject {
  
  var devServerHostUrl: String
  
  var window: Any
}
object DevServerHostUrl {
  
  inline def apply(devServerHostUrl: String, window: Any): DevServerHostUrl = {
    val __obj = js.Dynamic.literal(devServerHostUrl = devServerHostUrl.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevServerHostUrl]
  }
  
  extension [Self <: DevServerHostUrl](x: Self) {
    
    inline def setDevServerHostUrl(value: String): Self = StObject.set(x, "devServerHostUrl", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
