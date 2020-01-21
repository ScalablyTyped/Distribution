package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndcursorHasnextpage extends js.Object {
  var end_cursor: js.UndefOr[String] = js.undefined
  var has_next_page: Boolean
  var start_cursor: js.UndefOr[String] = js.undefined
}

object AnonEndcursorHasnextpage {
  @scala.inline
  def apply(has_next_page: Boolean, end_cursor: String = null, start_cursor: String = null): AnonEndcursorHasnextpage = {
    val __obj = js.Dynamic.literal(has_next_page = has_next_page.asInstanceOf[js.Any])
    if (end_cursor != null) __obj.updateDynamic("end_cursor")(end_cursor.asInstanceOf[js.Any])
    if (start_cursor != null) __obj.updateDynamic("start_cursor")(start_cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndcursorHasnextpage]
  }
}

