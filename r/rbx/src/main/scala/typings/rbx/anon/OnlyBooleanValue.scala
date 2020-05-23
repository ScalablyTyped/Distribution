package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyBooleanValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | typings.rbx.rbxNumbers.`7`
}

object OnlyBooleanValue {
  @scala.inline
  def apply(
    value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | typings.rbx.rbxNumbers.`7`,
    only: js.UndefOr[Boolean] = js.undefined
  ): OnlyBooleanValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBooleanValue]
  }
}

