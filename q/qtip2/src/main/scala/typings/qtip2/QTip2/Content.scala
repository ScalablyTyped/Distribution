package typings.qtip2.QTip2

import typings.qtip2.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var attr: js.UndefOr[String] = js.native
  var button: js.UndefOr[String | JQuery | Boolean] = js.native
  var text: js.UndefOr[Text] = js.native
  var title: js.UndefOr[Title | typings.qtip2.anon.Text] = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
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
    def setAttr(value: String): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setButton(value: String | JQuery | Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("text", js.Any.fromFunction2(value))
    @scala.inline
    def setText(value: Text): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitleFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("title", js.Any.fromFunction2(value))
    @scala.inline
    def setTitle(value: Title | typings.qtip2.anon.Text): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

