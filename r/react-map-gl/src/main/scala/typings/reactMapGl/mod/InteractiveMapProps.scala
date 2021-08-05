package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveMapProps
  extends StObject
     with StaticMapProps {
  
  var clickRadius: js.UndefOr[Double] = js.undefined
  
  var controller: js.UndefOr[MapController] = js.undefined
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragPan: js.UndefOr[Boolean] = js.undefined
  
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  
  var getCursor: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  
  var interactiveLayerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var maxPitch: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minPitch: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onContextMenu: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onDblClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onInteractionStateChange: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onMouseMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onMouseOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onMouseUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onNativeClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTransitionInterrupt: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  
  var onWheel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var touchAction: js.UndefOr[String] = js.undefined
  
  var touchRotate: js.UndefOr[Boolean] = js.undefined
  
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  
  var transitionDuration: js.UndefOr[Double | auto] = js.undefined
  
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
}
object InteractiveMapProps {
  
  inline def apply(height: Double | String, width: Double | String): InteractiveMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveMapProps]
  }
  
  extension [Self <: InteractiveMapProps](x: Self) {
    
    inline def setClickRadius(value: Double): Self = StObject.set(x, "clickRadius", value.asInstanceOf[js.Any])
    
    inline def setClickRadiusUndefined: Self = StObject.set(x, "clickRadius", js.undefined)
    
    inline def setController(value: MapController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    inline def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    inline def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    inline def setGetCursor(value: /* state */ ExtraState => Unit): Self = StObject.set(x, "getCursor", js.Any.fromFunction1(value))
    
    inline def setGetCursorUndefined: Self = StObject.set(x, "getCursor", js.undefined)
    
    inline def setInteractiveLayerIds(value: js.Array[String]): Self = StObject.set(x, "interactiveLayerIds", value.asInstanceOf[js.Any])
    
    inline def setInteractiveLayerIdsUndefined: Self = StObject.set(x, "interactiveLayerIds", js.undefined)
    
    inline def setInteractiveLayerIdsVarargs(value: String*): Self = StObject.set(x, "interactiveLayerIds", js.Array(value :_*))
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    inline def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setOnClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContextMenu(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDblClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
    
    inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    inline def setOnHover(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnInteractionStateChange(value: /* state */ ExtraState => Unit): Self = StObject.set(x, "onInteractionStateChange", js.Any.fromFunction1(value))
    
    inline def setOnInteractionStateChangeUndefined: Self = StObject.set(x, "onInteractionStateChange", js.undefined)
    
    inline def setOnMouseDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnNativeClick(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onNativeClick", js.Any.fromFunction1(value))
    
    inline def setOnNativeClickUndefined: Self = StObject.set(x, "onNativeClick", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnTransitionInterrupt(value: () => Unit): Self = StObject.set(x, "onTransitionInterrupt", js.Any.fromFunction0(value))
    
    inline def setOnTransitionInterruptUndefined: Self = StObject.set(x, "onTransitionInterrupt", js.undefined)
    
    inline def setOnTransitionStart(value: () => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction0(value))
    
    inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
    
    inline def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    inline def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    inline def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setOnWheel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    
    inline def setTouchRotate(value: Boolean): Self = StObject.set(x, "touchRotate", value.asInstanceOf[js.Any])
    
    inline def setTouchRotateUndefined: Self = StObject.set(x, "touchRotate", js.undefined)
    
    inline def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    inline def setTransitionDuration(value: Double | auto): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTransitionEasing(value: /* t */ Double => Double): Self = StObject.set(x, "transitionEasing", js.Any.fromFunction1(value))
    
    inline def setTransitionEasingUndefined: Self = StObject.set(x, "transitionEasing", js.undefined)
    
    inline def setTransitionInterpolator(value: TransitionInterpolator): Self = StObject.set(x, "transitionInterpolator", value.asInstanceOf[js.Any])
    
    inline def setTransitionInterpolatorUndefined: Self = StObject.set(x, "transitionInterpolator", js.undefined)
    
    inline def setTransitionInterruption(value: TRANSITION_EVENTS): Self = StObject.set(x, "transitionInterruption", value.asInstanceOf[js.Any])
    
    inline def setTransitionInterruptionUndefined: Self = StObject.set(x, "transitionInterruption", js.undefined)
  }
}
