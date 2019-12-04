package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectionOriginalEvent extends js.Object {
  var direction: String
  var originalEvent: Event
  var source: js.Array[_]
  var target: js.Array[_]
}

object Anon_DirectionOriginalEvent {
  @scala.inline
  def apply(direction: String, originalEvent: Event, source: js.Array[_], target: js.Array[_]): Anon_DirectionOriginalEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DirectionOriginalEvent]
  }
}

