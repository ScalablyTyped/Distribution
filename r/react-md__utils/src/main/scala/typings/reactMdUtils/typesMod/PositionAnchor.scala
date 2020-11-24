package typings.reactMdUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionAnchor extends js.Object {
  
  var x: HorizontalPosition = js.native
  
  var y: VerticalPosition = js.native
}
object PositionAnchor {
  
  @scala.inline
  def apply(x: HorizontalPosition, y: VerticalPosition): PositionAnchor = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionAnchor]
  }
  
  @scala.inline
  implicit class PositionAnchorOps[Self <: PositionAnchor] (val x: Self) extends AnyVal {
    
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
    def setX(value: HorizontalPosition): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: VerticalPosition): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
