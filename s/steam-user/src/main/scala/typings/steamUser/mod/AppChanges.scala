package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppChanges extends StObject {
  
  var appid: Double
  
  var change_number: Double
  
  var needs_token: Boolean
}
object AppChanges {
  
  inline def apply(appid: Double, change_number: Double, needs_token: Boolean): AppChanges = {
    val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], change_number = change_number.asInstanceOf[js.Any], needs_token = needs_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppChanges]
  }
  
  extension [Self <: AppChanges](x: Self) {
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setChange_number(value: Double): Self = StObject.set(x, "change_number", value.asInstanceOf[js.Any])
    
    inline def setNeeds_token(value: Boolean): Self = StObject.set(x, "needs_token", value.asInstanceOf[js.Any])
  }
}
