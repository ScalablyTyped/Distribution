package typings.reactNavigationCore.anon

import typings.react.mod.ReactText
import typings.reactNavigationCore.reactNavigationCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: js.Array[ReactText]
  
  var reason: String
  
  var serializable: `false`
}
object Location {
  
  inline def apply(location: js.Array[ReactText], reason: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], serializable = false)
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLocation(value: js.Array[ReactText]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationVarargs(value: ReactText*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSerializable(value: `false`): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
  }
}
