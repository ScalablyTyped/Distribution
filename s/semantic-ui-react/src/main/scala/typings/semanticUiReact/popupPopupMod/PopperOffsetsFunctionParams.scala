package typings.semanticUiReact.popupPopupMod

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopperOffsetsFunctionParams extends js.Object {
  
  var placement: Placement = js.native
  
  var popper: Rect = js.native
  
  var reference: Rect = js.native
}
object PopperOffsetsFunctionParams {
  
  @scala.inline
  def apply(placement: Placement, popper: Rect, reference: Rect): PopperOffsetsFunctionParams = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOffsetsFunctionParams]
  }
  
  @scala.inline
  implicit class PopperOffsetsFunctionParamsOps[Self <: PopperOffsetsFunctionParams] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: Rect): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
