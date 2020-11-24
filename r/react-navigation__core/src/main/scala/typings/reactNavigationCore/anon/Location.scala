package typings.reactNavigationCore.anon

import typings.react.mod.ReactText
import typings.reactNavigationCore.reactNavigationCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  var location: js.Array[ReactText] = js.native
  
  var reason: String = js.native
  
  var serializable: `false` = js.native
}
object Location {
  
  @scala.inline
  def apply(location: js.Array[ReactText], reason: String, serializable: `false`): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], serializable = serializable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setLocationVarargs(value: ReactText*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[ReactText]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializable(value: `false`): Self = this.set("serializable", value.asInstanceOf[js.Any])
  }
}
