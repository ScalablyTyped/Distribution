package typings.quicksettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownSelection[T] extends js.Object {
  var index: Double
  var label: String
  var value: T
}

object DropDownSelection {
  @scala.inline
  def apply[T](index: Double, label: String, value: T): DropDownSelection[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownSelection[T]]
  }
}

