package typings.qtip2.QTip2

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events property
  */
@js.native
trait Events extends js.Object {
  var blur: js.UndefOr[EventApiFunc] = js.native
  var focus: js.UndefOr[EventApiFunc] = js.native
  var hidden: js.UndefOr[EventApiFunc] = js.native
  var hide: js.UndefOr[EventApiFunc] = js.native
  var move: js.UndefOr[EventApiFunc] = js.native
  var render: js.UndefOr[EventApiFunc] = js.native
  var show: js.UndefOr[EventApiFunc] = js.native
  var toggle: js.UndefOr[EventApiFunc] = js.native
  var visible: js.UndefOr[EventApiFunc] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setBlur(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setHidden(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("hidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHide(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("hide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setMove(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setRender(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setShow(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("show", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setToggle(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("toggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setVisible(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("visible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

