package typings.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
  var history: js.UndefOr[History] = js.undefined
  var sigint: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autocomplete: /* input */ String => js.Array[String] = null,
    history: History = null,
    sigint: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(js.Any.fromFunction1(autocomplete))
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(sigint)) __obj.updateDynamic("sigint")(sigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

