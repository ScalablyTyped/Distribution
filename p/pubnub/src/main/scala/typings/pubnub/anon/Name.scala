package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var occupancy: Double
  
  var occupants: js.Array[State]
}
object Name {
  
  inline def apply(name: String, occupancy: Double, occupants: js.Array[State]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOccupancy(value: Double): Self = StObject.set(x, "occupancy", value.asInstanceOf[js.Any])
    
    inline def setOccupants(value: js.Array[State]): Self = StObject.set(x, "occupants", value.asInstanceOf[js.Any])
    
    inline def setOccupantsVarargs(value: State*): Self = StObject.set(x, "occupants", js.Array(value :_*))
  }
}
