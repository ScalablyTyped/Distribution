package typings.rcPicker.timeUnitColumnMod

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends js.Object {
  var disabled: Boolean
  var label: ReactText
  var value: Double
}

object Unit {
  @scala.inline
  def apply(disabled: Boolean, label: ReactText, value: Double): Unit = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

