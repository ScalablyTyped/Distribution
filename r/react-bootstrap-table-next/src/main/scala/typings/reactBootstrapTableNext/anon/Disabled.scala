package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var rowIndex: Double
  var rowKey: String
}

object Disabled {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, rowIndex: Double, rowKey: String): Disabled = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

