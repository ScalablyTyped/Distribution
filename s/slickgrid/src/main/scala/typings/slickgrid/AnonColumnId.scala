package typings.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnId extends js.Object {
  var columnId: String
  var sortAsc: Boolean
}

object AnonColumnId {
  @scala.inline
  def apply(columnId: String, sortAsc: Boolean): AnonColumnId = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnId]
  }
}

