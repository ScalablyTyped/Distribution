package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class InteractiveMapPropsMutableBuilder[Self <: InteractiveMapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickRadius(value: Double): Self = StObject.set(x, "clickRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickRadiusUndefined: Self = StObject.set(x, "clickRadius", js.undefined)
    
    @scala.inline
    def setController(value: MapController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    @scala.inline
    def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    @scala.inline
    def setGetCursor(value: /* state */ ExtraState => Unit): Self = StObject.set(x, "getCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCursorUndefined: Self = StObject.set(x, "getCursor", js.undefined)
    
    @scala.inline
    def setInteractiveLayerIds(value: js.Array[String]): Self = StObject.set(x, "interactiveLayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveLayerIdsUndefined: Self = StObject.set(x, "interactiveLayerIds", js.undefined)
    
    @scala.inline
    def setInteractiveLayerIdsVarargs(value: String*): Self = StObject.set(x, "interactiveLayerIds", js.Array(value :_*))
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setOnInteractionStateChange(value: /* state */ ExtraState => Unit): Self = StObject.set(x, "onInteractionStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInteractionStateChangeUndefined: Self = StObject.set(x, "onInteractionStateChange", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnNativeClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onNativeClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNativeClickUndefined: Self = StObject.set(x, "onNativeClick", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionInterrupt(value: () => Unit): Self = StObject.set(x, "onTransitionInterrupt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTransitionInterruptUndefined: Self = StObject.set(x, "onTransitionInterrupt", js.undefined)
    
    @scala.inline
    def setOnTransitionStart(value: () => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
    
    @scala.inline
    def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setOnWheel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    @scala.inline
    def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    
    @scala.inline
    def setTouchRotate(value: Boolean): Self = StObject.set(x, "touchRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRotateUndefined: Self = StObject.set(x, "touchRotate", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double | auto): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasing(value: /* t */ Double => Double): Self = StObject.set(x, "transitionEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransitionEasingUndefined: Self = StObject.set(x, "transitionEasing", js.undefined)
    
    @scala.inline
    def setTransitionInterpolator(value: TransitionInterpolator): Self = StObject.set(x, "transitionInterpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionInterpolatorUndefined: Self = StObject.set(x, "transitionInterpolator", js.undefined)
    
    @scala.inline
    def setTransitionInterruption(value: TRANSITION_EVENTS): Self = StObject.set(x, "transitionInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionInterruptionUndefined: Self = StObject.set(x, "transitionInterruption", js.undefined)
  }
}
