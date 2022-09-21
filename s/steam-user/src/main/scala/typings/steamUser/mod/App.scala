package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var access_token: String
  
  var appid: Double
}
object App {
  
  inline def apply(access_token: String, appid: Double): App = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], appid = appid.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
  }
}
