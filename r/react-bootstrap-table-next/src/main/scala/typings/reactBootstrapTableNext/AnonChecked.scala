package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var rowIndex: Double
  var rowKey: String
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, rowIndex: Double, rowKey: String): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

