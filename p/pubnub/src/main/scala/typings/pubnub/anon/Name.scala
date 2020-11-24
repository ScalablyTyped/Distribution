package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
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
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupancy(value: Double): Self = this.set("occupancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupantsVarargs(value: State*): Self = this.set("occupants", js.Array(value :_*))
    
    @scala.inline
    def setOccupants(value: js.Array[State]): Self = this.set("occupants", value.asInstanceOf[js.Any])
  }
}
