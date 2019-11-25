package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragIndex extends js.Object {
  var dragIndex: Double
  var dropIndex: Double
  var originalEvent: Event
  var value: js.Any
}

object Anon_DragIndex {
  @scala.inline
  def apply(dragIndex: Double, dropIndex: Double, originalEvent: Event, value: js.Any): Anon_DragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DragIndex]
  }
}

