package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEvent extends js.Object {
  var originalEvent: typings.std.Event
  var query: String
}

object OriginalEvent {
  @scala.inline
  def apply(originalEvent: typings.std.Event, query: String): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
}

