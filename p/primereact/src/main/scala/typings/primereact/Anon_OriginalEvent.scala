package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEvent extends js.Object {
  var originalEvent: Event
  var query: String
}

object Anon_OriginalEvent {
  @scala.inline
  def apply(originalEvent: Event, query: String): Anon_OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginalEvent]
  }
}

