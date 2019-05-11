package typings
package rmcDashInputDashNumberLib.esBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var inputValue: js.UndefOr[scala.Double] = js.undefined
  var value: scala.Double
}

object StateType {
  @scala.inline
  def apply(
    value: scala.Double,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    inputValue: scala.Int | scala.Double = null
  ): StateType = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
}

