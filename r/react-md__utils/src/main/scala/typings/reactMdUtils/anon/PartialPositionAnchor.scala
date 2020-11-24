package typings.reactMdUtils.anon

import typings.reactMdUtils.typesMod.HorizontalPosition
import typings.reactMdUtils.typesMod.VerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-md/utils.@react-md/utils/types/positioning/types.PositionAnchor> */
@js.native
trait PartialPositionAnchor extends js.Object {
  
  var x: js.UndefOr[HorizontalPosition] = js.native
  
  var y: js.UndefOr[VerticalPosition] = js.native
}
object PartialPositionAnchor {
  
  @scala.inline
  def apply(): PartialPositionAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPositionAnchor]
  }
  
  @scala.inline
  implicit class PartialPositionAnchorOps[Self <: PartialPositionAnchor] (val x: Self) extends AnyVal {
    
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
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: VerticalPosition): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
