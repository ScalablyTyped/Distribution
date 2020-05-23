package typings.reactMapGl.anon

import typings.reactMapGl.mod.InteractiveState
import typings.reactMapGl.mod.MapState
import typings.reactMapGl.mod.MapStateProps
import typings.reactMapGl.mod.PositionInput
import typings.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.MapState> */
trait PartialMapState extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, js.Any]] = js.undefined
  var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.undefined
  var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.undefined
  var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.undefined
  var panEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
  var rotate: js.UndefOr[js.Function1[/* input */ DeltaScaleX, MapState]] = js.undefined
  var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
}

object PartialMapState {
  @scala.inline
  def apply(
    constructor: /* props */ MapStateProps => js.Any = null,
    getInteractiveState: () => InteractiveState = null,
    getViewportProps: () => ViewportProps = null,
    pan: /* input */ PositionInputstartPosnumb => MapState = null,
    panEnd: () => MapState = null,
    panStart: /* input */ PositionInput => MapState = null,
    rotate: /* input */ DeltaScaleX => MapState = null,
    rotateEnd: () => MapState = null,
    rotateStart: /* input */ PositionInput => MapState = null,
    zoom: /* input */ PositionInputscalenumbers => MapState = null,
    zoomEnd: () => MapState = null,
    zoomStart: /* input */ PositionInput => MapState = null
  ): PartialMapState = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (getInteractiveState != null) __obj.updateDynamic("getInteractiveState")(js.Any.fromFunction0(getInteractiveState))
    if (getViewportProps != null) __obj.updateDynamic("getViewportProps")(js.Any.fromFunction0(getViewportProps))
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (panEnd != null) __obj.updateDynamic("panEnd")(js.Any.fromFunction0(panEnd))
    if (panStart != null) __obj.updateDynamic("panStart")(js.Any.fromFunction1(panStart))
    if (rotate != null) __obj.updateDynamic("rotate")(js.Any.fromFunction1(rotate))
    if (rotateEnd != null) __obj.updateDynamic("rotateEnd")(js.Any.fromFunction0(rotateEnd))
    if (rotateStart != null) __obj.updateDynamic("rotateStart")(js.Any.fromFunction1(rotateStart))
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction0(zoomEnd))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    __obj.asInstanceOf[PartialMapState]
  }
}

