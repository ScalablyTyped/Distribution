package typings.simplemde.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSaveOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var uniqueId: String
}

object AutoSaveOptions {
  @scala.inline
  def apply(uniqueId: String, delay: Int | Double = null, enabled: js.UndefOr[Boolean] = js.undefined): AutoSaveOptions = {
    val __obj = js.Dynamic.literal(uniqueId = uniqueId)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[AutoSaveOptions]
  }
}

