package typings.reactDaterangePicker.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSelectCallbackParam extends js.Object {
  var end: Moment = js.native
  var start: Moment = js.native
}

object OnSelectCallbackParam {
  @scala.inline
  def apply(end: Moment, start: Moment): OnSelectCallbackParam = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectCallbackParam]
  }
  @scala.inline
  implicit class OnSelectCallbackParamOps[Self <: OnSelectCallbackParam] (val x: Self) extends AnyVal {
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
    def setEnd(value: Moment): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Moment): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

