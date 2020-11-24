package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'setFluidWidth'> */
@js.native
trait PickImplsetFluidWidth extends js.Object {
  
  var setFluidWidth: Boolean = js.native
}
object PickImplsetFluidWidth {
  
  @scala.inline
  def apply(setFluidWidth: Boolean): PickImplsetFluidWidth = {
    val __obj = js.Dynamic.literal(setFluidWidth = setFluidWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsetFluidWidth]
  }
  
  @scala.inline
  implicit class PickImplsetFluidWidthOps[Self <: PickImplsetFluidWidth] (val x: Self) extends AnyVal {
    
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
    def setSetFluidWidth(value: Boolean): Self = this.set("setFluidWidth", value.asInstanceOf[js.Any])
  }
}
