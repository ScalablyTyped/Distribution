package typings.selectables.mod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var elements: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String | Boolean] = js.native
  var moreUsing: js.UndefOr[String] = js.native
  var onDeselect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.native
  var selectedClass: js.UndefOr[String] = js.native
  var start: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var stop: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var zone: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setElements(value: String): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKey(value: String | Boolean): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMoreUsing(value: String): Self = this.set("moreUsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreUsing: Self = this.set("moreUsing", js.undefined)
    @scala.inline
    def setOnDeselect(value: /* el */ Element => Unit): Self = this.set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnSelect(value: /* el */ Element => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSelectedClass(value: String): Self = this.set("selectedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedClass: Self = this.set("selectedClass", js.undefined)
    @scala.inline
    def setStart(value: /* e */ Event => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: /* e */ Event => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

