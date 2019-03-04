package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndcursorHasnextpage extends js.Object {
  var end_cursor: js.UndefOr[java.lang.String] = js.undefined
  var has_next_page: scala.Boolean
  var start_cursor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EndcursorHasnextpage {
  @scala.inline
  def apply(
    has_next_page: scala.Boolean,
    end_cursor: java.lang.String = null,
    start_cursor: java.lang.String = null
  ): Anon_EndcursorHasnextpage = {
    val __obj = js.Dynamic.literal(has_next_page = has_next_page)
    if (end_cursor != null) __obj.updateDynamic("end_cursor")(end_cursor)
    if (start_cursor != null) __obj.updateDynamic("start_cursor")(start_cursor)
    __obj.asInstanceOf[Anon_EndcursorHasnextpage]
  }
}

