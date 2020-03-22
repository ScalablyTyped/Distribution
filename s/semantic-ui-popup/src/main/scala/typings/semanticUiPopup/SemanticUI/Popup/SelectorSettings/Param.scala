package typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, 'popup'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl>> */
trait Param extends js.Object {
  var popup: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(popup: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

