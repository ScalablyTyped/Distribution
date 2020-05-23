package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.Any
  var dragIndex: Double
  var dropIndex: Double
  var originalEvent: typings.std.Event
}

object Columns {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double, originalEvent: typings.std.Event): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

