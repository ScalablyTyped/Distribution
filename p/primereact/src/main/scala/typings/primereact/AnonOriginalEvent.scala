package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEvent extends js.Object {
  var originalEvent: Event_
  var query: String
}

object AnonOriginalEvent {
  @scala.inline
  def apply(originalEvent: Event_, query: String): AnonOriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEvent]
  }
}

