package typings.promptDashSync.promptDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var ask: js.UndefOr[String] = js.undefined
  var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
  var echo: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    ask: String = null,
    autocomplete: /* input */ String => js.Array[String] = null,
    echo: String = null,
    value: String = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (ask != null) __obj.updateDynamic("ask")(ask)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(js.Any.fromFunction1(autocomplete))
    if (echo != null) __obj.updateDynamic("echo")(echo)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Option]
  }
}

