package typings.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: js.Array[String]
  var halfChecked: js.Array[String]
}

object AnonChecked {
  @scala.inline
  def apply(checked: js.Array[String], halfChecked: js.Array[String]): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

