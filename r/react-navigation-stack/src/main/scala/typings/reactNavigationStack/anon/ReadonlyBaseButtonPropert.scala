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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-gesture-handler.react-native-gesture-handler.BaseButtonProperties> */
@js.native
trait ReadonlyBaseButtonPropert extends StObject {
  
  val accessibilityLabel: js.UndefOr[String] = js.native
  
  val disallowInterruption: js.UndefOr[Boolean] = js.native
  
  val enabled: js.UndefOr[Boolean] = js.native
  
  val exclusive: js.UndefOr[Boolean] = js.native
  
  val hitSlop: js.UndefOr[
    Double | typings.reactNativeGestureHandler.anon.Bottom | typings.reactNativeGestureHandler.anon.Left | Right | typings.reactNativeGestureHandler.anon.Height | BottomHeight
  ] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.native
  
  val onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.native
  
  val onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.native
  
  val onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.native
  
  val rippleColor: js.UndefOr[String] = js.native
  
  val shouldActivateOnStart: js.UndefOr[Boolean] = js.native
  
  val shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  
  val simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  val testID: js.UndefOr[String] = js.native
  
  val waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}
object ReadonlyBaseButtonPropert {
  
  @scala.inline
  def apply(): ReadonlyBaseButtonPropert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyBaseButtonPropert]
  }
  
  @scala.inline
  implicit class ReadonlyBaseButtonPropertMutableBuilder[Self <: ReadonlyBaseButtonPropert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setHitSlop(
      value: Double | typings.reactNativeGestureHandler.anon.Bottom | typings.reactNativeGestureHandler.anon.Left | Right | typings.reactNativeGestureHandler.anon.Height | BottomHeight
    ): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnActiveStateChange(value: /* active */ Boolean => Unit): Self = StObject.set(x, "onActiveStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveStateChangeUndefined: Self = StObject.set(x, "onActiveStateChange", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* pointerInside */ Boolean => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    @scala.inline
    def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    @scala.inline
    def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
