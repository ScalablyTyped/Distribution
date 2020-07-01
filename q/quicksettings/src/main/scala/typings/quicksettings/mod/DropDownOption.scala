package typings.quicksettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownOption[T] extends js.Object {
  var label: String | Double
  var value: T
}

object DropDownOption {
  @scala.inline
  def apply[T](label: String | Double, value: T): DropDownOption[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownOption[T]]
  }
}

