package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursors extends js.Object {
  var after: java.lang.String | scala.Null
  var before: java.lang.String | scala.Null
  var hasNext: scala.Boolean
  var hasPrevious: scala.Boolean
}

object Cursors {
  @scala.inline
  def apply(
    hasNext: scala.Boolean,
    hasPrevious: scala.Boolean,
    after: java.lang.String = null,
    before: java.lang.String = null
  ): Cursors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNext")(hasNext)
    __obj.updateDynamic("hasPrevious")(hasPrevious)
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[Cursors]
  }
}

