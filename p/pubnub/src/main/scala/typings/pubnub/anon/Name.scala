package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var name: String = js.native
  
  var occupancy: Double = js.native
  
  var occupants: js.Array[State] = js.native
}
object Name {
  
  @scala.inline
  def apply(name: String, occupancy: Double, occupants: js.Array[State]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupancy(value: Double): Self = StObject.set(x, "occupancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupants(value: js.Array[State]): Self = StObject.set(x, "occupants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupantsVarargs(value: State*): Self = StObject.set(x, "occupants", js.Array(value :_*))
  }
}
