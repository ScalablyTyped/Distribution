package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Start extends js.Object {
  var end: stringOrDate = js.native
  var start: stringOrDate = js.native
}

object Start {
  @scala.inline
  def apply(end: stringOrDate, start: stringOrDate): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setEnd(value: stringOrDate): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: stringOrDate): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

