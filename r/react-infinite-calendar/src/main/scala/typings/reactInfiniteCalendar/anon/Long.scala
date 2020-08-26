package typings.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  var long: String = js.native
}

object Long {
  @scala.inline
  def apply(long: String): Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
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
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
  }
  
}

