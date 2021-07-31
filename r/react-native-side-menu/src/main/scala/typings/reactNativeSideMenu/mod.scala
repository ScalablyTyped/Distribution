package typings.reactNativeSideMenu

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.EndCallback
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSideMenu.reactNativeSideMenuStrings.left
import typings.reactNativeSideMenu.reactNativeSideMenuStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-side-menu", JSImport.Default)
  @js.native
  class default () extends SideMenu
  
  trait ReactNativeSideMenuProps extends StObject {
    
    var animationFunction: js.UndefOr[js.Function2[/* prop */ Value, /* value */ Double, CompositeAnimation]] = js.undefined
    
    var animationStyle: js.UndefOr[js.Function1[/* value */ Double, ViewStyle]] = js.undefined
    
    /**
      * When true, menu close automatically as soon as an event occurs
      * @default true
      */
    var autoClosing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, content view will bounce back to openMenuOffset when dragged further
      * @default true
      */
    var bounceBackOnOverdraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable whether the menu can be opened with gestures or not
      * @default false
      */
    var disableGestures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Edge distance on content view to open side menu, defaults to 60
      */
    var edgeHitWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Content view left margin if menu is hidden
      */
    var hiddenMenuOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Props driven control over menu open state
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Menu component
      */
    var menu: ReactNode
    
    /**
      * @default left
      */
    var menuPosition: js.UndefOr[left | right] = js.undefined
    
    /**
      * Callback when menu animation has completed.
      */
    var onAnimationComplete: js.UndefOr[js.Function1[/* event */ EndCallback, Unit]] = js.undefined
    
    /**
      * Callback on menu open/close. Is passed isOpen as an argument
      */
    var onChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    /**
      * Callback on menu move. Is passed left as an argument
      */
    var onMove: js.UndefOr[js.Function1[/* left */ Double, Unit]] = js.undefined
    
    /**
      * Callback when menu is sliding. It returns a decimal from 0 to 1 which represents the percentage of menu offset between hiddenMenuOffset and openMenuOffset.
      */
    var onSliding: js.UndefOr[js.Function1[/* fraction */ Double, Unit]] = js.undefined
    
    /**
      * Function that accepts event as an argument and specify if side-menu should react on the touch or not.
      * Check https://facebook.github.io/react-native/docs/gesture-responder-system.html for more details
      */
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * Content view left margin if menu is opened
      */
    var openMenuOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * X axis tolerance
      */
    var toleranceX: js.UndefOr[Double] = js.undefined
    
    /**
      * Y axis tolerance
      */
    var toleranceY: js.UndefOr[Double] = js.undefined
  }
  object ReactNativeSideMenuProps {
    
    @scala.inline
    def apply(): ReactNativeSideMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeSideMenuProps]
    }
    
    @scala.inline
    implicit class ReactNativeSideMenuPropsMutableBuilder[Self <: ReactNativeSideMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationFunction(value: (/* prop */ Value, /* value */ Double) => CompositeAnimation): Self = StObject.set(x, "animationFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationFunctionUndefined: Self = StObject.set(x, "animationFunction", js.undefined)
      
      @scala.inline
      def setAnimationStyle(value: /* value */ Double => ViewStyle): Self = StObject.set(x, "animationStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimationStyleUndefined: Self = StObject.set(x, "animationStyle", js.undefined)
      
      @scala.inline
      def setAutoClosing(value: Boolean): Self = StObject.set(x, "autoClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingUndefined: Self = StObject.set(x, "autoClosing", js.undefined)
      
      @scala.inline
      def setBounceBackOnOverdraw(value: Boolean): Self = StObject.set(x, "bounceBackOnOverdraw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceBackOnOverdrawUndefined: Self = StObject.set(x, "bounceBackOnOverdraw", js.undefined)
      
      @scala.inline
      def setDisableGestures(value: Boolean): Self = StObject.set(x, "disableGestures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGesturesUndefined: Self = StObject.set(x, "disableGestures", js.undefined)
      
      @scala.inline
      def setEdgeHitWidth(value: Double): Self = StObject.set(x, "edgeHitWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeHitWidthUndefined: Self = StObject.set(x, "edgeHitWidth", js.undefined)
      
      @scala.inline
      def setHiddenMenuOffset(value: Double): Self = StObject.set(x, "hiddenMenuOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenMenuOffsetUndefined: Self = StObject.set(x, "hiddenMenuOffset", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setMenu(value: ReactNode): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPosition(value: left | right): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnAnimationComplete(value: /* event */ EndCallback => Unit): Self = StObject.set(x, "onAnimationComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationCompleteUndefined: Self = StObject.set(x, "onAnimationComplete", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMove(value: /* left */ Double => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      @scala.inline
      def setOnSliding(value: /* fraction */ Double => Unit): Self = StObject.set(x, "onSliding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSlidingUndefined: Self = StObject.set(x, "onSliding", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: /* e */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOpenMenuOffset(value: Double): Self = StObject.set(x, "openMenuOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMenuOffsetUndefined: Self = StObject.set(x, "openMenuOffset", js.undefined)
      
      @scala.inline
      def setToleranceX(value: Double): Self = StObject.set(x, "toleranceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceXUndefined: Self = StObject.set(x, "toleranceX", js.undefined)
      
      @scala.inline
      def setToleranceY(value: Double): Self = StObject.set(x, "toleranceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceYUndefined: Self = StObject.set(x, "toleranceY", js.undefined)
    }
  }
  
  @js.native
  trait SideMenu
    extends Component[ReactNativeSideMenuProps, js.Object, js.Any] {
    
    def moveLeft(offset: Double): Unit = js.native
    
    def openMenu(isOpen: Boolean): Unit = js.native
  }
}
