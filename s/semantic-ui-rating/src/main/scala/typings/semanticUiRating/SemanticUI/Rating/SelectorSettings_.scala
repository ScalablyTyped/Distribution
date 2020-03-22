package typings.semanticUiRating.SemanticUI.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-rating.SemanticUI.Rating.SelectorSettings.Param */
trait SelectorSettings_ extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
}

object SelectorSettings_ {
  @scala.inline
  def apply(icon: String = null): SelectorSettings_ = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSettings_]
  }
}

