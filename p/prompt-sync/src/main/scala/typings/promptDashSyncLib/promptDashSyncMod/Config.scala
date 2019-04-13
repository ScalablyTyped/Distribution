package typings
package promptDashSyncLib.promptDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
  var history: js.UndefOr[History] = js.undefined
  var sigint: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autocomplete: AutoCompleteFunction = null,
    history: History = null,
    sigint: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (history != null) __obj.updateDynamic("history")(history)
    if (!js.isUndefined(sigint)) __obj.updateDynamic("sigint")(sigint)
    __obj.asInstanceOf[Config]
  }
}

