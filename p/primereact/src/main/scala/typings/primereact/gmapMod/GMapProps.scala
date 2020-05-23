package typings.primereact.gmapMod

import typings.primereact.anon.Map
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GMapProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onMapClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Map, Unit]] = js.undefined
  var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var overlays: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object GMapProps {
  @scala.inline
  def apply(
    className: String = null,
    onMapClick: /* event */ Event => Unit = null,
    onMapDragEnd: () => Unit = null,
    onMapReady: /* map */ js.Any => Unit = null,
    onOverlayClick: /* e */ Map => Unit = null,
    onOverlayDrag: /* event */ Event => Unit = null,
    onOverlayDragEnd: /* event */ Event => Unit = null,
    onOverlayDragStart: /* event */ Event => Unit = null,
    onZoomChanged: () => Unit = null,
    options: js.Object = null,
    overlays: js.Array[_] = null,
    style: js.Object = null
  ): GMapProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onMapClick != null) __obj.updateDynamic("onMapClick")(js.Any.fromFunction1(onMapClick))
    if (onMapDragEnd != null) __obj.updateDynamic("onMapDragEnd")(js.Any.fromFunction0(onMapDragEnd))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction1(onMapReady))
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1(onOverlayClick))
    if (onOverlayDrag != null) __obj.updateDynamic("onOverlayDrag")(js.Any.fromFunction1(onOverlayDrag))
    if (onOverlayDragEnd != null) __obj.updateDynamic("onOverlayDragEnd")(js.Any.fromFunction1(onOverlayDragEnd))
    if (onOverlayDragStart != null) __obj.updateDynamic("onOverlayDragStart")(js.Any.fromFunction1(onOverlayDragStart))
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(js.Any.fromFunction0(onZoomChanged))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMapProps]
  }
}

