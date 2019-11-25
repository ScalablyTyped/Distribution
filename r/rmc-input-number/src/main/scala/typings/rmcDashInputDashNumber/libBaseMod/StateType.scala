package typings.rmcDashInputDashNumber.libBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var inputValue: js.UndefOr[Double] = js.undefined
  var value: Double
}

object StateType {
  @scala.inline
  def apply(value: Double, focused: js.UndefOr[Boolean] = js.undefined, inputValue: Int | Double = null): StateType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
}

