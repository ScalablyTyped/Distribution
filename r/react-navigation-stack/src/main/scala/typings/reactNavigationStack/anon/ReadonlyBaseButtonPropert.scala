package typings.reactNavigationStack.anon

import typings.react.mod.Ref
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Right
import typings.reactNativeGestureHandler.mod.NativeViewGestureHandlerGestureEvent
import typings.reactNativeGestureHandler.mod.NativeViewGestureHandlerStateChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-gesture-handler.react-native-gesture-handler.BaseButtonProperties> */
trait ReadonlyBaseButtonPropert extends StObject {
  
  val accessibilityLabel: js.UndefOr[String] = js.undefined
  
  val disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  val exclusive: js.UndefOr[Boolean] = js.undefined
  
  val hitSlop: js.UndefOr[
    Double | typings.reactNativeGestureHandler.anon.Bottom | typings.reactNativeGestureHandler.anon.Left | Right | typings.reactNativeGestureHandler.anon.Height | BottomHeight
  ] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.undefined
  
  val onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.undefined
  
  val onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.undefined
  
  val onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.undefined
  
  val rippleColor: js.UndefOr[String] = js.undefined
  
  val shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  
  val shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  val simultaneousHandlers: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val testID: js.UndefOr[String] = js.undefined
  
  val waitFor: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
}
object ReadonlyBaseButtonPropert {
  
  inline def apply(): ReadonlyBaseButtonPropert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyBaseButtonPropert]
  }
  
  extension [Self <: ReadonlyBaseButtonPropert](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setHitSlop(
      value: Double | typings.reactNativeGestureHandler.anon.Bottom | typings.reactNativeGestureHandler.anon.Left | Right | typings.reactNativeGestureHandler.anon.Height | BottomHeight
    ): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnActiveStateChange(value: /* active */ Boolean => Unit): Self = StObject.set(x, "onActiveStateChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveStateChangeUndefined: Self = StObject.set(x, "onActiveStateChange", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    inline def setOnPress(value: /* pointerInside */ Boolean => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setSimultaneousHandlers(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setWaitFor(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
