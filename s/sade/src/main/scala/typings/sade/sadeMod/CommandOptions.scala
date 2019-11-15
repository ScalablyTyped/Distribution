package typings.sade.sadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[CommandOptions]
  }
}

