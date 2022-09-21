package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInfo extends StObject {
  
  var appinfo: Any
  
  var changenumber: Double
  
  var missingToken: Boolean
}
object AppInfo {
  
  inline def apply(appinfo: Any, changenumber: Double, missingToken: Boolean): AppInfo = {
    val __obj = js.Dynamic.literal(appinfo = appinfo.asInstanceOf[js.Any], changenumber = changenumber.asInstanceOf[js.Any], missingToken = missingToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfo]
  }
  
  extension [Self <: AppInfo](x: Self) {
    
    inline def setAppinfo(value: Any): Self = StObject.set(x, "appinfo", value.asInstanceOf[js.Any])
    
    inline def setChangenumber(value: Double): Self = StObject.set(x, "changenumber", value.asInstanceOf[js.Any])
    
    inline def setMissingToken(value: Boolean): Self = StObject.set(x, "missingToken", value.asInstanceOf[js.Any])
  }
}
