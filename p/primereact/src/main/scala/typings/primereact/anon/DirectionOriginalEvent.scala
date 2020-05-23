package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionOriginalEvent extends js.Object {
  var direction: String
  var originalEvent: typings.std.Event
  var source: js.Array[_]
  var target: js.Array[_]
}

object DirectionOriginalEvent {
  @scala.inline
  def apply(direction: String, originalEvent: typings.std.Event, source: js.Array[_], target: js.Array[_]): DirectionOriginalEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionOriginalEvent]
  }
}

