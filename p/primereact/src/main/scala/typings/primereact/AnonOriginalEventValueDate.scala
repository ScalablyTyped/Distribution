package typings.primereact

import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventValueDate extends js.Object {
  var originalEvent: Event_
  var value: Date
}

object AnonOriginalEventValueDate {
  @scala.inline
  def apply(originalEvent: Event_, value: Date): AnonOriginalEventValueDate = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventValueDate]
  }
}

