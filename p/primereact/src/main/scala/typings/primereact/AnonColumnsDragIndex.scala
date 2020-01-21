package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnsDragIndex extends js.Object {
  var columns: js.Any
  var dragIndex: Double
  var dropIndex: Double
}

object AnonColumnsDragIndex {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double): AnonColumnsDragIndex = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnsDragIndex]
  }
}

