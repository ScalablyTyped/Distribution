package typings
package primereactLib.componentsGmapGMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GMapProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onMapClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onMapDragEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, scala.Unit]] = js.undefined
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Map, scala.Unit]] = js.undefined
  var onOverlayDrag: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onZoomChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var overlays: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object GMapProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    onMapClick: /* event */ stdLib.Event => scala.Unit = null,
    onMapDragEnd: () => scala.Unit = null,
    onMapReady: /* map */ js.Any => scala.Unit = null,
    onOverlayClick: /* e */ primereactLib.Anon_Map => scala.Unit = null,
    onOverlayDrag: /* event */ stdLib.Event => scala.Unit = null,
    onOverlayDragEnd: /* event */ stdLib.Event => scala.Unit = null,
    onOverlayDragStart: /* event */ stdLib.Event => scala.Unit = null,
    onZoomChanged: () => scala.Unit = null,
    options: js.Object = null,
    overlays: js.Array[_] = null,
    style: js.Object = null
  ): GMapProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onMapClick != null) __obj.updateDynamic("onMapClick")(js.Any.fromFunction1(onMapClick))
    if (onMapDragEnd != null) __obj.updateDynamic("onMapDragEnd")(js.Any.fromFunction0(onMapDragEnd))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction1(onMapReady))
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1(onOverlayClick))
    if (onOverlayDrag != null) __obj.updateDynamic("onOverlayDrag")(js.Any.fromFunction1(onOverlayDrag))
    if (onOverlayDragEnd != null) __obj.updateDynamic("onOverlayDragEnd")(js.Any.fromFunction1(onOverlayDragEnd))
    if (onOverlayDragStart != null) __obj.updateDynamic("onOverlayDragStart")(js.Any.fromFunction1(onOverlayDragStart))
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(js.Any.fromFunction0(onZoomChanged))
    if (options != null) __obj.updateDynamic("options")(options)
    if (overlays != null) __obj.updateDynamic("overlays")(overlays)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GMapProps]
  }
}

