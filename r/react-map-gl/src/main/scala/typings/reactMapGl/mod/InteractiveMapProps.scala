package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveMapProps extends StaticMapProps {
  var clickRadius: js.UndefOr[Double] = js.native
  var controller: js.UndefOr[MapController] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragPan: js.UndefOr[Boolean] = js.native
  var dragRotate: js.UndefOr[Boolean] = js.native
  var getCursor: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.native
  var interactiveLayerIds: js.UndefOr[js.Array[String]] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minPitch: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onInteractionStateChange: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onNativeClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitionInterrupt: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  var onWheel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var scrollZoom: js.UndefOr[Boolean] = js.native
  var touchAction: js.UndefOr[String] = js.native
  var touchRotate: js.UndefOr[Boolean] = js.native
  var touchZoom: js.UndefOr[Boolean] = js.native
  var transitionDuration: js.UndefOr[Double | auto] = js.native
  var transitionEasing: js.UndefOr[EasingFunction] = js.native
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.native
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.native
}

object InteractiveMapProps {
  @scala.inline
  def apply(height: Double | String, width: Double | String): InteractiveMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveMapProps]
  }
  @scala.inline
  implicit class InteractiveMapPropsOps[Self <: InteractiveMapProps] (val x: Self) extends AnyVal {
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
    def setClickRadius(value: Double): Self = this.set("clickRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickRadius: Self = this.set("clickRadius", js.undefined)
    @scala.inline
    def setController(value: MapController): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    @scala.inline
    def setDragPan(value: Boolean): Self = this.set("dragPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragPan: Self = this.set("dragPan", js.undefined)
    @scala.inline
    def setDragRotate(value: Boolean): Self = this.set("dragRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragRotate: Self = this.set("dragRotate", js.undefined)
    @scala.inline
    def setGetCursor(value: /* state */ ExtraState => Unit): Self = this.set("getCursor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCursor: Self = this.set("getCursor", js.undefined)
    @scala.inline
    def setInteractiveLayerIdsVarargs(value: String*): Self = this.set("interactiveLayerIds", js.Array(value :_*))
    @scala.inline
    def setInteractiveLayerIds(value: js.Array[String]): Self = this.set("interactiveLayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractiveLayerIds: Self = this.set("interactiveLayerIds", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPitch: Self = this.set("maxPitch", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinPitch(value: Double): Self = this.set("minPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPitch: Self = this.set("minPitch", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ PointerEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: /* event */ PointerEvent => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnDblClick(value: /* event */ PointerEvent => Unit): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnHover(value: /* event */ PointerEvent => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnInteractionStateChange(value: /* state */ ExtraState => Unit): Self = this.set("onInteractionStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInteractionStateChange: Self = this.set("onInteractionStateChange", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* event */ PointerEvent => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnNativeClick(value: /* event */ PointerEvent => Unit): Self = this.set("onNativeClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNativeClick: Self = this.set("onNativeClick", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: /* event */ PointerEvent => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: /* event */ PointerEvent => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: /* event */ PointerEvent => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: () => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionInterrupt(value: () => Unit): Self = this.set("onTransitionInterrupt", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionInterrupt: Self = this.set("onTransitionInterrupt", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: () => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    @scala.inline
    def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = this.set("onViewStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewStateChange: Self = this.set("onViewStateChange", js.undefined)
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = this.set("onViewportChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    @scala.inline
    def setOnWheel(value: /* event */ PointerEvent => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setScrollZoom(value: Boolean): Self = this.set("scrollZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollZoom: Self = this.set("scrollZoom", js.undefined)
    @scala.inline
    def setTouchAction(value: String): Self = this.set("touchAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchAction: Self = this.set("touchAction", js.undefined)
    @scala.inline
    def setTouchRotate(value: Boolean): Self = this.set("touchRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchRotate: Self = this.set("touchRotate", js.undefined)
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double | auto): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setTransitionEasing(value: /* t */ Double => Double): Self = this.set("transitionEasing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionEasing: Self = this.set("transitionEasing", js.undefined)
    @scala.inline
    def setTransitionInterpolator(value: TransitionInterpolator): Self = this.set("transitionInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInterpolator: Self = this.set("transitionInterpolator", js.undefined)
    @scala.inline
    def setTransitionInterruption(value: TRANSITION_EVENTS): Self = this.set("transitionInterruption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInterruption: Self = this.set("transitionInterruption", js.undefined)
  }
  
}

