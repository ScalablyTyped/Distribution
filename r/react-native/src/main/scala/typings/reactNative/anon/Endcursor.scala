package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endcursor extends js.Object {
  var end_cursor: String = js.native
  var has_next_page: Boolean = js.native
}

object Endcursor {
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): Endcursor = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endcursor]
  }
  @scala.inline
  implicit class EndcursorOps[Self <: Endcursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd_cursor(value: String): Self = this.set("end_cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas_next_page(value: Boolean): Self = this.set("has_next_page", value.asInstanceOf[js.Any])
  }
  
}

