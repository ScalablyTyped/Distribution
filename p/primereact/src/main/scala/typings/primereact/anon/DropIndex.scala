package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndex extends js.Object {
  var columns: js.Any
  var dragIndex: Double
  var dropIndex: Double
}

object DropIndex {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double): DropIndex = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndex]
  }
}

