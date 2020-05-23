package typings.rcTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: js.Array[String]
  var halfChecked: js.Array[String]
}

object Checked {
  @scala.inline
  def apply(checked: js.Array[String], halfChecked: js.Array[String]): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

