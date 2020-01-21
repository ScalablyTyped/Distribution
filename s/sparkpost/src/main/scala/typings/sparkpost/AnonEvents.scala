package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: js.UndefOr[String] = js.undefined
}

object AnonEvents {
  @scala.inline
  def apply(events: String = null): AnonEvents = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvents]
  }
}

