package typings.reactLeaflet.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerEvents extends js.Object {
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
}

object TileLayerEvents {
  @scala.inline
  def apply(): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerEvents]
  }
  @scala.inline
  implicit class TileLayerEventsOps[Self <: TileLayerEvents] (val x: Self) extends AnyVal {
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
    def setOnload(value: /* event */ LeafletEvent => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloading(value: /* event */ LeafletEvent => Unit): Self = this.set("onloading", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnloading: Self = this.set("onloading", js.undefined)
    @scala.inline
    def setOntileerror(value: /* event */ TileEvent => Unit): Self = this.set("ontileerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntileerror: Self = this.set("ontileerror", js.undefined)
    @scala.inline
    def setOntileload(value: /* event */ TileEvent => Unit): Self = this.set("ontileload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntileload: Self = this.set("ontileload", js.undefined)
    @scala.inline
    def setOntileloadstart(value: /* event */ TileEvent => Unit): Self = this.set("ontileloadstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntileloadstart: Self = this.set("ontileloadstart", js.undefined)
    @scala.inline
    def setOntileunload(value: /* event */ TileEvent => Unit): Self = this.set("ontileunload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntileunload: Self = this.set("ontileunload", js.undefined)
  }
  
}

