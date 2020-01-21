package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstOriginalEvent extends js.Object {
  var first: Double
  var originalEvent: Event_
  var rows: Double
}

object AnonFirstOriginalEvent {
  @scala.inline
  def apply(first: Double, originalEvent: Event_, rows: Double): AnonFirstOriginalEvent = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstOriginalEvent]
  }
}

