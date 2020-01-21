package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragIndex extends js.Object {
  var dragIndex: Double
  var dropIndex: Double
  var originalEvent: Event_
  var value: js.Any
}

object AnonDragIndex {
  @scala.inline
  def apply(dragIndex: Double, dropIndex: Double, originalEvent: Event_, value: js.Any): AnonDragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDragIndex]
  }
}

