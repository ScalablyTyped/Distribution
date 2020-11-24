package typings.reactEasyCrop.mod

import typings.reactEasyCrop.typesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var cropSize: Size | Null = js.native
  
  var hasWheelJustStarted: Boolean = js.native
}
object State {
  
  @scala.inline
  def apply(hasWheelJustStarted: Boolean): State = {
    val __obj = js.Dynamic.literal(hasWheelJustStarted = hasWheelJustStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setHasWheelJustStarted(value: Boolean): Self = this.set("hasWheelJustStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropSize(value: Size): Self = this.set("cropSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropSizeNull: Self = this.set("cropSize", null)
  }
}
