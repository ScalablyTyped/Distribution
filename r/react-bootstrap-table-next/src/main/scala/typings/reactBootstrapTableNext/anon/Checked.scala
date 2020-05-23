package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var mode: String
  var rowIndex: Double
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, mode: String, rowIndex: Double): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

