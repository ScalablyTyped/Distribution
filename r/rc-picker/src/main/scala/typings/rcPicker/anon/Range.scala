package typings.rcPicker.anon

import typings.rcPicker.rcPickerStrings.end
import typings.rcPicker.rcPickerStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var range: start | end
}

object Range {
  @scala.inline
  def apply(range: start | end): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

