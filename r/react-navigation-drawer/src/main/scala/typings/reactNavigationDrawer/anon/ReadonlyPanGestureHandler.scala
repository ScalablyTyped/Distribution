package typings.reactNavigationDrawer.anon

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import typings.reactNativeGestureHandler.mod.PanGestureHandlerGestureEvent
import typings.reactNativeGestureHandler.mod.PanGestureHandlerStateChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties> */
trait ReadonlyPanGestureHandler extends StObject {
  
  val activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val avgTouches: js.UndefOr[Boolean] = js.undefined
  
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  val failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val maxDeltaX: js.UndefOr[Double] = js.undefined
  
  val maxDeltaY: js.UndefOr[Double] = js.undefined
  
  val maxPointers: js.UndefOr[Double] = js.undefined
  
  val minDeltaX: js.UndefOr[Double] = js.undefined
  
  val minDeltaY: js.UndefOr[Double] = js.undefined
  
  val minDist: js.UndefOr[Double] = js.undefined
  
  val minOffsetX: js.UndefOr[Double] = js.undefined
  
  val minOffsetY: js.UndefOr[Double] = js.undefined
  
  val minPointers: js.UndefOr[Double] = js.undefined
  
  val minVelocity: js.UndefOr[Double] = js.undefined
  
  val minVelocityX: js.UndefOr[Double] = js.undefined
  
  val minVelocityY: js.UndefOr[Double] = js.undefined
  
  val onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.undefined
  
  val onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.undefined
  
  val shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  val simultaneousHandlers: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
  
  val waitFor: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
}
object ReadonlyPanGestureHandler {
  
  @scala.inline
  def apply(): ReadonlyPanGestureHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPanGestureHandler]
  }
  
  @scala.inline
  implicit class ReadonlyPanGestureHandlerMutableBuilder[Self <: ReadonlyPanGestureHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
    
    @scala.inline
    def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
    
    @scala.inline
    def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
    
    @scala.inline
    def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
    
    @scala.inline
    def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    @scala.inline
    def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    @scala.inline
    def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    @scala.inline
    def setMinDeltaX(value: Double): Self = StObject.set(x, "minDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeltaXUndefined: Self = StObject.set(x, "minDeltaX", js.undefined)
    
    @scala.inline
    def setMinDeltaY(value: Double): Self = StObject.set(x, "minDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeltaYUndefined: Self = StObject.set(x, "minDeltaY", js.undefined)
    
    @scala.inline
    def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    @scala.inline
    def setMinOffsetX(value: Double): Self = StObject.set(x, "minOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOffsetXUndefined: Self = StObject.set(x, "minOffsetX", js.undefined)
    
    @scala.inline
    def setMinOffsetY(value: Double): Self = StObject.set(x, "minOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOffsetYUndefined: Self = StObject.set(x, "minOffsetY", js.undefined)
    
    @scala.inline
    def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    @scala.inline
    def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    @scala.inline
    def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
    
    @scala.inline
    def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    @scala.inline
    def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlers(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimultaneousHandlersFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    @scala.inline
    def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def setWaitFor(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
