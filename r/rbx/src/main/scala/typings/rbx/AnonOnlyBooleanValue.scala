package typings.rbx

import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyBooleanValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: `1` | `2` | `3` | `4` | `5` | `6` | `7`
}

object AnonOnlyBooleanValue {
  @scala.inline
  def apply(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`, only: js.UndefOr[Boolean] = js.undefined): AnonOnlyBooleanValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyBooleanValue]
  }
}

