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
@js.native
trait PartialMapState extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, js.Any]] = js.native
  var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.native
  var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.native
  var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.native
  var panEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
  var rotate: js.UndefOr[js.Function1[/* input */ DeltaScaleX, MapState]] = js.native
  var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
  var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.native
  var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
}

object PartialMapState {
  @scala.inline
  def apply(): PartialMapState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapState]
  }
  @scala.inline
  implicit class PartialMapStateOps[Self <: PartialMapState] (val x: Self) extends AnyVal {
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
    def setConstructor(value: /* props */ MapStateProps => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setGetInteractiveState(value: () => InteractiveState): Self = this.set("getInteractiveState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInteractiveState: Self = this.set("getInteractiveState", js.undefined)
    @scala.inline
    def setGetViewportProps(value: () => ViewportProps): Self = this.set("getViewportProps", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViewportProps: Self = this.set("getViewportProps", js.undefined)
    @scala.inline
    def setPan(value: /* input */ PositionInputstartPosnumb => MapState): Self = this.set("pan", js.Any.fromFunction1(value))
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    @scala.inline
    def setPanEnd(value: () => MapState): Self = this.set("panEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deletePanEnd: Self = this.set("panEnd", js.undefined)
    @scala.inline
    def setPanStart(value: /* input */ PositionInput => MapState): Self = this.set("panStart", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanStart: Self = this.set("panStart", js.undefined)
    @scala.inline
    def setRotate(value: /* input */ DeltaScaleX => MapState): Self = this.set("rotate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotateEnd(value: () => MapState): Self = this.set("rotateEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRotateEnd: Self = this.set("rotateEnd", js.undefined)
    @scala.inline
    def setRotateStart(value: /* input */ PositionInput => MapState): Self = this.set("rotateStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRotateStart: Self = this.set("rotateStart", js.undefined)
    @scala.inline
    def setZoom(value: /* input */ PositionInputscalenumbers => MapState): Self = this.set("zoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomEnd(value: () => MapState): Self = this.set("zoomEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    @scala.inline
    def setZoomStart(value: /* input */ PositionInput => MapState): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
  }
  
}

