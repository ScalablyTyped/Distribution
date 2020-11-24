package typings.reactOverlays.anon

import typings.popperjsCore.typesMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper extends js.Object {
  
  var placement: typings.reactOverlays.esmUsePopperMod.Placement = js.native
  
  var popper: Rect = js.native
  
  var reference: Rect = js.native
}
object Popper {
  
  @scala.inline
  def apply(placement: typings.reactOverlays.esmUsePopperMod.Placement, popper: Rect, reference: Rect): Popper = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperOps[Self <: Popper] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: typings.reactOverlays.esmUsePopperMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: Rect): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
