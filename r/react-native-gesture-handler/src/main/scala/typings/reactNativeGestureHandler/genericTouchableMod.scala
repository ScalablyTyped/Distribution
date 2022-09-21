package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.ExtraButtonProps
import typings.reactNativeGestureHandler.anon.FnCall
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.GestureEvent
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.HandlerStateChangeEvent
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`0`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2`
import typings.reactNativeGestureHandler.touchableNativeFeedbackAndroidMod.TouchableNativeFeedbackExtraProps
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericTouchableMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", JSImport.Default)
  @js.native
  open class default () extends GenericTouchable
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", "default.defaultProps")
    @js.native
    def defaultProps: ExtraButtonProps = js.native
    inline def defaultProps_=(x: ExtraButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object TOUCHABLE_STATE {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", "TOUCHABLE_STATE.BEGAN")
    @js.native
    val BEGAN: `1` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", "TOUCHABLE_STATE.MOVED_OUTSIDE")
    @js.native
    val MOVED_OUTSIDE: `2` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/GenericTouchable", "TOUCHABLE_STATE.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
  
  @js.native
  trait GenericTouchable
    extends Component[GenericTouchableProps & InternalProps, js.Object, Any] {
    
    var STATE: TouchableState = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGenericTouchable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGenericTouchable(): Unit = js.native
    
    def handleGoToUndetermined(): Unit = js.native
    
    def handleMoveOutside(): Unit = js.native
    
    def handlePressIn(): Unit = js.native
    
    var longPressDetected: Boolean = js.native
    
    var longPressTimeout: Timeout = js.native
    
    def moveToState(newState: TouchableState): Unit = js.native
    
    def onGestureEvent(hasHasPointerInside: GestureEvent[NativeViewGestureHandlerPayload]): Unit = js.native
    
    def onHandlerStateChange(hasNativeEvent: HandlerStateChangeEvent[NativeViewGestureHandlerPayload]): Unit = js.native
    
    def onLongPressDetected(): Unit = js.native
    
    def onMoveIn(): Unit = js.native
    
    def onMoveOut(): Unit = js.native
    
    var pointerInside: Boolean = js.native
    
    var pressInTimeout: Timeout = js.native
    
    var pressOutTimeout: Timeout = js.native
    
    def reset(): Unit = js.native
  }
  
  trait GenericTouchableProps
    extends StObject
       with TouchableWithoutFeedbackProps {
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disallowInterruption: js.UndefOr[Boolean] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    @JSName("onLongPress")
    var onLongPress_GenericTouchableProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("onPressIn")
    var onPressIn_GenericTouchableProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("onPressOut")
    var onPressOut_GenericTouchableProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("onPress")
    var onPress_GenericTouchableProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  }
  object GenericTouchableProps {
    
    inline def apply(): GenericTouchableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericTouchableProps]
    }
    
    extension [Self <: GenericTouchableProps](x: Self) {
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
      
      inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
      
      inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    }
  }
  
  trait InternalProps extends StObject {
    
    var extraButtonProps: TouchableNativeFeedbackExtraProps
    
    var onStateChange: js.UndefOr[js.Function2[/* oldState */ TouchableState, /* newState */ TouchableState, Unit]] = js.undefined
  }
  object InternalProps {
    
    inline def apply(extraButtonProps: TouchableNativeFeedbackExtraProps): InternalProps = {
      val __obj = js.Dynamic.literal(extraButtonProps = extraButtonProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalProps]
    }
    
    extension [Self <: InternalProps](x: Self) {
      
      inline def setExtraButtonProps(value: TouchableNativeFeedbackExtraProps): Self = StObject.set(x, "extraButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOnStateChange(value: (/* oldState */ TouchableState, /* newState */ TouchableState) => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction2(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    }
  }
  
  type Timeout = js.UndefOr[ReturnType[FnCall] | Null]
  
  /* Inlined { readonly UNDETERMINED :0,  readonly BEGAN :1,  readonly MOVED_OUTSIDE :2}[keyof { readonly UNDETERMINED :0,  readonly BEGAN :1,  readonly MOVED_OUTSIDE :2}] */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`0`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2`
  */
  trait TouchableState extends StObject
  object TouchableState {
    
    inline def `0`: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`0` = 0.asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`0`]
    
    inline def `1`: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` = 1.asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1`]
    
    inline def `2`: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` = 2.asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2`]
  }
}
