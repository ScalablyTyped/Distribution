package typings.semanticUiModal.SemanticUI.Modal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-modal.SemanticUI.Modal.ErrorSettings.Param */
trait ErrorSettings_ extends js.Object {
  var method: js.UndefOr[String] = js.undefined
}

object ErrorSettings_ {
  @scala.inline
  def apply(method: String = null): ErrorSettings_ = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSettings_]
  }
}

