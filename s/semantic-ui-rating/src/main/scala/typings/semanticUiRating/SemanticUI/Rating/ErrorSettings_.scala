package typings.semanticUiRating.SemanticUI.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-rating.SemanticUI.Rating.ErrorSettings.Param */
trait ErrorSettings_ extends js.Object {
  var action: js.UndefOr[String] = js.undefined
}

object ErrorSettings_ {
  @scala.inline
  def apply(action: String = null): ErrorSettings_ = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSettings_]
  }
}

