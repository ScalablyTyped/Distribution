package typings.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationMod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursors extends js.Object {
  var after: String | Null
  var before: String | Null
  var hasNext: Boolean
  var hasPrevious: Boolean
}

object Cursors {
  @scala.inline
  def apply(hasNext: Boolean, hasPrevious: Boolean, after: String = null, before: String = null): Cursors = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursors]
  }
}

