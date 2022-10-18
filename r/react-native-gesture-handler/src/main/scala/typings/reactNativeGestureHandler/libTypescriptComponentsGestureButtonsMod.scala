package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.HostComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.ActiveOpacity
import typings.reactNativeGestureHandler.anon.DelayLongPress
import typings.reactNativeGestureHandler.anon.UnderlayColor
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsGestureButtonsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BaseButton")
  @js.native
  open class BaseButton protected ()
    extends Component[BaseButtonProps, js.Object, Any] {
    def this(props: BaseButtonProps) = this()
    
    /* private */ var handleEvent: Any = js.native
    
    /* private */ var lastActive: Any = js.native
    
    /* private */ var longPressDetected: Any = js.native
    
    /* private */ var longPressTimeout: Any = js.native
    
    /* private */ var onGestureEvent: Any = js.native
    
    /* private */ var onHandlerStateChange: Any = js.native
    
    /* private */ var onLongPress: Any = js.native
  }
  /* static members */
  object BaseButton {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BaseButton.defaultProps")
    @js.native
    def defaultProps: DelayLongPress = js.native
    inline def defaultProps_=(x: DelayLongPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BorderlessButton")
  @js.native
  open class BorderlessButton protected ()
    extends Component[BorderlessButtonProps, js.Object, Any] {
    def this(props: BorderlessButtonProps) = this()
    
    /* private */ var onActiveStateChange: Any = js.native
    
    /* private */ var opacity: Any = js.native
  }
  /* static members */
  object BorderlessButton {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BorderlessButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "BorderlessButton.defaultProps")
    @js.native
    def defaultProps: ActiveOpacity = js.native
    inline def defaultProps_=(x: ActiveOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "PureNativeButton")
  @js.native
  val PureNativeButton: HostComponent[RawButtonProps] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "RawButton")
  @js.native
  val RawButton: ForwardRefExoticComponent[
    RawButtonProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "RectButton")
  @js.native
  open class RectButton protected ()
    extends Component[RectButtonProps, js.Object, Any] {
    def this(props: RectButtonProps) = this()
    
    /* private */ var onActiveStateChange: Any = js.native
    
    /* private */ var opacity: Any = js.native
  }
  /* static members */
  object RectButton {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "RectButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureButtons", "RectButton.defaultProps")
    @js.native
    def defaultProps: UnderlayColor = js.native
    inline def defaultProps_=(x: UnderlayColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait BaseButtonProps
    extends StObject
       with RawButtonProps {
    
    /**
      * Delay, in milliseconds, after which the `onLongPress` callback gets called.
      * Defaults to 600.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when button changes from inactive to active and vice versa. It
      * passes active state as a boolean variable as a first parameter for that
      * method.
      */
    var onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.undefined
    
    /**
      * Called when the button gets pressed and is held for `delayLongPress`
      * milliseconds.
      */
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when the button gets pressed (analogous to `onPress` in
      * `TouchableHighlight` from RN core).
      */
    var onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object BaseButtonProps {
    
    inline def apply(): BaseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseButtonProps]
    }
    
    extension [Self <: BaseButtonProps](x: Self) {
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setOnActiveStateChange(value: /* active */ Boolean => Unit): Self = StObject.set(x, "onActiveStateChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveStateChangeUndefined: Self = StObject.set(x, "onActiveStateChange", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: /* pointerInside */ Boolean => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait BorderlessButtonProps
    extends StObject
       with BaseButtonProps {
    
    /**
      * iOS only.
      *
      * Opacity applied to the button when it is in an active state.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
  }
  object BorderlessButtonProps {
    
    inline def apply(): BorderlessButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderlessButtonProps]
    }
    
    extension [Self <: BorderlessButtonProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    }
  }
  
  trait RawButtonProps
    extends StObject
       with NativeViewGestureHandlerProps_ {
    
    /**
      * Android only.
      *
      * Set this to true if you want the ripple animation to render outside the view bounds.
      */
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if more than one button could be pressed simultaneously. By default
      * set true.
      */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Android only.
      *
      * Defines whether the ripple animation should be drawn on the foreground of the view.
      */
    var foreground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Android only.
      *
      * Defines color of native ripple animation used since API level 21.
      */
    var rippleColor: js.UndefOr[Any] = js.undefined
    
    /**
      * Android only.
      *
      * Defines radius of native ripple animation used since API level 21.
      */
    var rippleRadius: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Android only.
      *
      * Set this to true if you don't want the system to play sound when the button is pressed.
      */
    var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object RawButtonProps {
    
    inline def apply(): RawButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawButtonProps]
    }
    
    extension [Self <: RawButtonProps](x: Self) {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setRippleColor(value: Any): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleRadius(value: Double): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
      
      inline def setRippleRadiusNull: Self = StObject.set(x, "rippleRadius", null)
      
      inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
      
      inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    }
  }
  
  trait RectButtonProps
    extends StObject
       with BaseButtonProps {
    
    /**
      * iOS only.
      *
      * Opacity applied to the underlay when button is in active state.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Background color that will be dimmed when button is in active state.
      */
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object RectButtonProps {
    
    inline def apply(): RectButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectButtonProps]
    }
    
    extension [Self <: RectButtonProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
