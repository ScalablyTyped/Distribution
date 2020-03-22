package typings.rcPicker.timeUnitColumnMod

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: ReactText
  var value: Double
}

object Unit {
  @scala.inline
  def apply(label: ReactText, value: Double, disabled: js.UndefOr[Boolean] = js.undefined): Unit = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

