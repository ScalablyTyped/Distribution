package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.ZoomOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ZoomControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var zoomInText: js.UndefOr[String] = js.native
  var zoomInTitle: js.UndefOr[String] = js.native
  var zoomOutText: js.UndefOr[String] = js.native
  var zoomOutTitle: js.UndefOr[String] = js.native
}

object ZoomControlProps {
  @scala.inline
  def apply(): ZoomControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomControlProps]
  }
  @scala.inline
  implicit class ZoomControlPropsOps[Self <: ZoomControlProps] (val x: Self) extends AnyVal {
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
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZoomInText(value: String): Self = this.set("zoomInText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomInText: Self = this.set("zoomInText", js.undefined)
    @scala.inline
    def setZoomInTitle(value: String): Self = this.set("zoomInTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomInTitle: Self = this.set("zoomInTitle", js.undefined)
    @scala.inline
    def setZoomOutText(value: String): Self = this.set("zoomOutText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOutText: Self = this.set("zoomOutText", js.undefined)
    @scala.inline
    def setZoomOutTitle(value: String): Self = this.set("zoomOutTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOutTitle: Self = this.set("zoomOutTitle", js.undefined)
  }
  
}

