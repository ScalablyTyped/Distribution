package typings.semanticUiNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-nag.SemanticUI.Nag.SelectorSettings.Param */
trait SelectorSettings_ extends js.Object {
  var close: js.UndefOr[String] = js.undefined
}

object SelectorSettings_ {
  @scala.inline
  def apply(close: String = null): SelectorSettings_ = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSettings_]
  }
}

