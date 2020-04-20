package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: js.Any
  var dragIndex: Double
  var dropIndex: Double
  var originalEvent: Event_
}

object AnonColumns {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double, originalEvent: Event_): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

