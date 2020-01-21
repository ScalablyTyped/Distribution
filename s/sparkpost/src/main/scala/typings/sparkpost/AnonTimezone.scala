package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimezone extends js.Object {
  var timezone: js.UndefOr[String] = js.undefined
}

object AnonTimezone {
  @scala.inline
  def apply(timezone: String = null): AnonTimezone = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimezone]
  }
}

