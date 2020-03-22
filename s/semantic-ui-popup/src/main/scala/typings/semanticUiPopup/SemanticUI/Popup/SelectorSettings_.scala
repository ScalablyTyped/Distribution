package typings.semanticUiPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-popup.SemanticUI.Popup.SelectorSettings.Param */
trait SelectorSettings_ extends js.Object {
  var popup: js.UndefOr[String] = js.undefined
}

object SelectorSettings_ {
  @scala.inline
  def apply(popup: String = null): SelectorSettings_ = {
    val __obj = js.Dynamic.literal()
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSettings_]
  }
}

