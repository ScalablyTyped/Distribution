package typings.primereact.gmapMod

import typings.primereact.anon.Map
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GMapProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onMapClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Map, Unit]] = js.native
  var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var overlays: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object GMapProps {
  @scala.inline
  def apply(): GMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GMapProps]
  }
  @scala.inline
  implicit class GMapPropsOps[Self <: GMapProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnMapClick(value: /* event */ Event => Unit): Self = this.set("onMapClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMapClick: Self = this.set("onMapClick", js.undefined)
    @scala.inline
    def setOnMapDragEnd(value: () => Unit): Self = this.set("onMapDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMapDragEnd: Self = this.set("onMapDragEnd", js.undefined)
    @scala.inline
    def setOnMapReady(value: /* map */ js.Any => Unit): Self = this.set("onMapReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMapReady: Self = this.set("onMapReady", js.undefined)
    @scala.inline
    def setOnOverlayClick(value: /* e */ Map => Unit): Self = this.set("onOverlayClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverlayClick: Self = this.set("onOverlayClick", js.undefined)
    @scala.inline
    def setOnOverlayDrag(value: /* event */ Event => Unit): Self = this.set("onOverlayDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverlayDrag: Self = this.set("onOverlayDrag", js.undefined)
    @scala.inline
    def setOnOverlayDragEnd(value: /* event */ Event => Unit): Self = this.set("onOverlayDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverlayDragEnd: Self = this.set("onOverlayDragEnd", js.undefined)
    @scala.inline
    def setOnOverlayDragStart(value: /* event */ Event => Unit): Self = this.set("onOverlayDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverlayDragStart: Self = this.set("onOverlayDragStart", js.undefined)
    @scala.inline
    def setOnZoomChanged(value: () => Unit): Self = this.set("onZoomChanged", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnZoomChanged: Self = this.set("onZoomChanged", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOverlaysVarargs(value: js.Any*): Self = this.set("overlays", js.Array(value :_*))
    @scala.inline
    def setOverlays(value: js.Array[_]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

