package typings.reactIntl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: js.UndefOr[String | Double | Date] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(value: String | Double | Date = null): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

