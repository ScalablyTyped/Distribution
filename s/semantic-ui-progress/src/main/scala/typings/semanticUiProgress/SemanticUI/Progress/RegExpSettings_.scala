package typings.semanticUiProgress.SemanticUI.Progress

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-progress.SemanticUI.Progress.RegExpSettings.Param */
trait RegExpSettings_ extends js.Object {
  var variable: js.UndefOr[RegExp] = js.undefined
}

object RegExpSettings_ {
  @scala.inline
  def apply(variable: RegExp = null): RegExpSettings_ = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpSettings_]
  }
}

