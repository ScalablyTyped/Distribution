package typings.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl>> */
trait PartialPickImplkeyofImplHide extends js.Object {
  var hide: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImplHide {
  @scala.inline
  def apply(hide: Int | Double = null, show: Int | Double = null): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
}

