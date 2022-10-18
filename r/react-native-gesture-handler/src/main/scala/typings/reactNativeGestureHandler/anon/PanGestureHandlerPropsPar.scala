package typings.reactNativeGestureHandler.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler.PanGestureHandlerProps & std.Partial<std.Record<'failOffsetXStart' | 'failOffsetYStart' | 'failOffsetXEnd' | 'failOffsetYEnd' | 'activeOffsetXStart' | 'activeOffsetXEnd' | 'activeOffsetYStart' | 'activeOffsetYEnd', number>> */
trait PanGestureHandlerPropsPar extends StObject {
  
  var activateAfterLongPress: js.UndefOr[Double] = js.undefined
  
  /**
    * Range along X axis (in points) where fingers travels without activation of
    * handler. Moving outside of this range implies activation of handler. Range
    * can be given as an array or a single number. If range is set as an array,
    * first value must be lower or equal to 0, a the second one higher or equal
    * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
    * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
    */
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var activeOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetXStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Range along X axis (in points) where fingers travels without activation of
    * handler. Moving outside of this range implies activation of handler. Range
    * can be given as an array or a single number. If range is set as an array,
    * first value must be lower or equal to 0, a the second one higher or equal
    * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
    * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
    */
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var activeOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetYStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Android only.
    */
  var avgTouches: js.UndefOr[Boolean] = js.undefined
  
  var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Enables two-finger gestures on supported devices, for example iPads with
    * trackpads. If not enabled the gesture will require click + drag, with
    * enableTrackpadTwoFingerGesture swiping with two fingers will also trigger
    * the gesture.
    */
  var enableTrackpadTwoFingerGesture: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the finger moves outside this range (in points) along X axis and
    * handler hasn't yet activated it will fail recognizing the gesture. Range
    * can be given as an array or a single number. If range is set as an array,
    * first value must be lower or equal to 0, a the second one higher or equal
    * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
    * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
    */
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var failOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetXStart: js.UndefOr[Double] = js.undefined
  
  /**
    * When the finger moves outside this range (in points) along Y axis and
    * handler hasn't yet activated it will fail recognizing the gesture. Range
    * can be given as an array or a single number. If range is set as an array,
    * first value must be lower or equal to 0, a the second one higher or equal
    * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
    * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
    */
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var failOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetYStart: js.UndefOr[Double] = js.undefined
  
  var hitSlop: js.UndefOr[HitSlop] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * When the given number of fingers is placed on the screen and handler hasn't
    * yet activated it will fail recognizing the gesture. Should be a higher or
    * equal to 0 integer.
    */
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum distance the finger (or multiple finger) need to travel before the
    * handler activates. Expressed in points.
    */
  var minDist: js.UndefOr[Double] = js.undefined
  
  /**
    * A number of fingers that is required to be placed before handler can
    * activate. Should be a higher or equal to 0 integer.
    */
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var minVelocity: js.UndefOr[Double] = js.undefined
  
  var minVelocityX: js.UndefOr[Double] = js.undefined
  
  var minVelocityY: js.UndefOr[Double] = js.undefined
  
  var onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ GestureEvent[PanGestureHandlerEventPayload], Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[
    js.Function1[/* event */ HandlerStateChangeEvent[PanGestureHandlerEventPayload], Unit]
  ] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
}
object PanGestureHandlerPropsPar {
  
  inline def apply(): PanGestureHandlerPropsPar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanGestureHandlerPropsPar]
  }
  
  extension [Self <: PanGestureHandlerPropsPar](x: Self) {
    
    inline def setActivateAfterLongPress(value: Double): Self = StObject.set(x, "activateAfterLongPress", value.asInstanceOf[js.Any])
    
    inline def setActivateAfterLongPressUndefined: Self = StObject.set(x, "activateAfterLongPress", js.undefined)
    
    inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXEndUndefined: Self = StObject.set(x, "activeOffsetXEnd", js.undefined)
    
    inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXStartUndefined: Self = StObject.set(x, "activeOffsetXStart", js.undefined)
    
    inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
    
    inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value*))
    
    inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYEndUndefined: Self = StObject.set(x, "activeOffsetYEnd", js.undefined)
    
    inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYStartUndefined: Self = StObject.set(x, "activeOffsetYStart", js.undefined)
    
    inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
    
    inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value*))
    
    inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
    
    inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
    
    inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
    
    inline def setEnableTrackpadTwoFingerGestureUndefined: Self = StObject.set(x, "enableTrackpadTwoFingerGesture", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXEnd(value: Double): Self = StObject.set(x, "failOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXEndUndefined: Self = StObject.set(x, "failOffsetXEnd", js.undefined)
    
    inline def setFailOffsetXStart(value: Double): Self = StObject.set(x, "failOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXStartUndefined: Self = StObject.set(x, "failOffsetXStart", js.undefined)
    
    inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
    
    inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value*))
    
    inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYEnd(value: Double): Self = StObject.set(x, "failOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYEndUndefined: Self = StObject.set(x, "failOffsetYEnd", js.undefined)
    
    inline def setFailOffsetYStart(value: Double): Self = StObject.set(x, "failOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYStartUndefined: Self = StObject.set(x, "failOffsetYStart", js.undefined)
    
    inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
    
    inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value*))
    
    inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
    
    inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    
    inline def setOnActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onActivated", js.Any.fromFunction1(value))
    
    inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
    
    inline def setOnBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onBegan", js.Any.fromFunction1(value))
    
    inline def setOnBeganUndefined: Self = StObject.set(x, "onBegan", js.undefined)
    
    inline def setOnCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onCancelled", js.Any.fromFunction1(value))
    
    inline def setOnCancelledUndefined: Self = StObject.set(x, "onCancelled", js.undefined)
    
    inline def setOnEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onFailed", js.Any.fromFunction1(value))
    
    inline def setOnFailedUndefined: Self = StObject.set(x, "onFailed", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ GestureEvent[PanGestureHandlerEventPayload] => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ HandlerStateChangeEvent[PanGestureHandlerEventPayload] => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
