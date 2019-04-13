package typings
package promptDashSyncLib.promptDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var ask: js.UndefOr[java.lang.String] = js.undefined
  var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
  var echo: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    ask: java.lang.String = null,
    autocomplete: AutoCompleteFunction = null,
    echo: java.lang.String = null,
    value: java.lang.String = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (ask != null) __obj.updateDynamic("ask")(ask)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (echo != null) __obj.updateDynamic("echo")(echo)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Option]
  }
}

