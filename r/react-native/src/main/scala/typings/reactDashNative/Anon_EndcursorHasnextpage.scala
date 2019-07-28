package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndcursorHasnextpage extends js.Object {
  var end_cursor: js.UndefOr[String] = js.undefined
  var has_next_page: Boolean
  var start_cursor: js.UndefOr[String] = js.undefined
}

object Anon_EndcursorHasnextpage {
  @scala.inline
  def apply(has_next_page: Boolean, end_cursor: String = null, start_cursor: String = null): Anon_EndcursorHasnextpage = {
    val __obj = js.Dynamic.literal(has_next_page = has_next_page)
    if (end_cursor != null) __obj.updateDynamic("end_cursor")(end_cursor)
    if (start_cursor != null) __obj.updateDynamic("start_cursor")(start_cursor)
    __obj.asInstanceOf[Anon_EndcursorHasnextpage]
  }
}

