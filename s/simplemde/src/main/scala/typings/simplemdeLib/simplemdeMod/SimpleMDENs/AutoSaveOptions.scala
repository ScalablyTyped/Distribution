package typings
package simplemdeLib.simplemdeMod.SimpleMDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSaveOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var uniqueId: java.lang.String
}

object AutoSaveOptions {
  @scala.inline
  def apply(
    uniqueId: java.lang.String,
    delay: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uniqueId")(uniqueId)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[AutoSaveOptions]
  }
}

