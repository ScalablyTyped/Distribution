package typings.semanticUiPopup

import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'prefer'> */
trait PickImplprefer extends js.Object {
  var prefer: adjacent | opposite
}

object PickImplprefer {
  @scala.inline
  def apply(prefer: adjacent | opposite): PickImplprefer = {
    val __obj = js.Dynamic.literal(prefer = prefer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplprefer]
  }
}

