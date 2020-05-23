package typings.slickgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnId extends js.Object {
  var columnId: String
  var sortAsc: Boolean
}

object ColumnId {
  @scala.inline
  def apply(columnId: String, sortAsc: Boolean): ColumnId = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnId]
  }
}

