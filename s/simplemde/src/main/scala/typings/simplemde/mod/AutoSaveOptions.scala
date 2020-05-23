package typings.simplemde.mod

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
  def apply(
    uniqueId: String,
    delay: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AutoSaveOptions = {
    val __obj = js.Dynamic.literal(uniqueId = uniqueId.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSaveOptions]
  }
}

