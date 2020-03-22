package typings.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplLoading extends js.Object {
  var loading: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var popupVisible: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplLoading {
  @scala.inline
  def apply(
    loading: String = null,
    popup: String = null,
    popupVisible: String = null,
    position: String = null,
    visible: String = null
  ): PartialPickImplkeyofImplLoading = {
    val __obj = js.Dynamic.literal()
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupVisible != null) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplLoading]
  }
}

