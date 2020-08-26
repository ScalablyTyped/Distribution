package typings.qtip2.anon

import typings.qtip2.QTip2.Api
import typings.qtip2.QTip2.Title
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  var text: Title = js.native
}

object Text {
  @scala.inline
  def apply(text: Title): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
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
    def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("text", js.Any.fromFunction2(value))
    @scala.inline
    def setText(value: Title): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

