package typings.reactLeaflet.mod

import typings.leaflet.mod.LayersControlEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersControlEvents extends js.Object {
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
}

object LayersControlEvents {
  @scala.inline
  def apply(): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlEvents]
  }
  @scala.inline
  implicit class LayersControlEventsOps[Self <: LayersControlEvents] (val x: Self) extends AnyVal {
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
    def setOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = this.set("onbaselayerchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnbaselayerchange: Self = this.set("onbaselayerchange", js.undefined)
    @scala.inline
    def setOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = this.set("onoverlayadd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnoverlayadd: Self = this.set("onoverlayadd", js.undefined)
    @scala.inline
    def setOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = this.set("onoverlayremove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnoverlayremove: Self = this.set("onoverlayremove", js.undefined)
  }
  
}

