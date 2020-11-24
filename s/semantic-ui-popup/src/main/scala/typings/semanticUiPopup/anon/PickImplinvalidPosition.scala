package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'invalidPosition'> */
@js.native
trait PickImplinvalidPosition extends js.Object {
  
  var invalidPosition: String = js.native
}
object PickImplinvalidPosition {
  
  @scala.inline
  def apply(invalidPosition: String): PickImplinvalidPosition = {
    val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidPosition]
  }
  
  @scala.inline
  implicit class PickImplinvalidPositionOps[Self <: PickImplinvalidPosition] (val x: Self) extends AnyVal {
    
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
    def setInvalidPosition(value: String): Self = this.set("invalidPosition", value.asInstanceOf[js.Any])
  }
}
