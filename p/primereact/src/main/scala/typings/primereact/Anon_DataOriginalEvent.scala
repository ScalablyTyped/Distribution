package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataOriginalEvent extends js.Object {
  var data: js.Any
  var originalEvent: Event
  var `type`: String
}

object Anon_DataOriginalEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: Event, `type`: String): Anon_DataOriginalEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataOriginalEvent]
  }
}

