package typings.reactNativeSideMenu.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.EndCallback
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSideMenu.reactNativeSideMenuStrings.left
import typings.reactNativeSideMenu.reactNativeSideMenuStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeSideMenuProps extends js.Object {
  var animationFunction: js.UndefOr[js.Function2[/* prop */ Value, /* value */ Double, CompositeAnimation]] = js.native
  var animationStyle: js.UndefOr[js.Function1[/* value */ Double, ViewStyle]] = js.native
  /**
    * When true, menu close automatically as soon as an event occurs
    * @default true
    */
  var autoClosing: js.UndefOr[Boolean] = js.native
  /**
    * When true, content view will bounce back to openMenuOffset when dragged further
    * @default true
    */
  var bounceBackOnOverdraw: js.UndefOr[Boolean] = js.native
  /**
    * Disable whether the menu can be opened with gestures or not
    * @default false
    */
  var disableGestures: js.UndefOr[Boolean] = js.native
  /**
    * Edge distance on content view to open side menu, defaults to 60
    */
  var edgeHitWidth: js.UndefOr[Double] = js.native
  /**
    * Content view left margin if menu is hidden
    */
  var hiddenMenuOffset: js.UndefOr[Double] = js.native
  /**
    * Props driven control over menu open state
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Menu component
    */
  var menu: ReactNode = js.native
  /**
    * @default left
    */
  var menuPosition: js.UndefOr[left | right] = js.native
  /**
    * Callback when menu animation has completed.
    */
  var onAnimationComplete: js.UndefOr[js.Function1[/* event */ EndCallback, Unit]] = js.native
  /**
    * Callback on menu open/close. Is passed isOpen as an argument
    */
  var onChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  /**
    * Callback on menu move. Is passed left as an argument
    */
  var onMove: js.UndefOr[js.Function1[/* left */ Double, Unit]] = js.native
  /**
    * Callback when menu is sliding. It returns a decimal from 0 to 1 which represents the percentage of menu offset between hiddenMenuOffset and openMenuOffset.
    */
  var onSliding: js.UndefOr[js.Function1[/* fraction */ Double, Unit]] = js.native
  /**
    * Function that accepts event as an argument and specify if side-menu should react on the touch or not.
    * Check https://facebook.github.io/react-native/docs/gesture-responder-system.html for more details
    */
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Boolean]] = js.native
  /**
    * Content view left margin if menu is opened
    */
  var openMenuOffset: js.UndefOr[Double] = js.native
  /**
    * X axis tolerance
    */
  var toleranceX: js.UndefOr[Double] = js.native
  /**
    * Y axis tolerance
    */
  var toleranceY: js.UndefOr[Double] = js.native
}

object ReactNativeSideMenuProps {
  @scala.inline
  def apply(): ReactNativeSideMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeSideMenuProps]
  }
  @scala.inline
  implicit class ReactNativeSideMenuPropsOps[Self <: ReactNativeSideMenuProps] (val x: Self) extends AnyVal {
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
    def setAnimationFunction(value: (/* prop */ Value, /* value */ Double) => CompositeAnimation): Self = this.set("animationFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAnimationFunction: Self = this.set("animationFunction", js.undefined)
    @scala.inline
    def setAnimationStyle(value: /* value */ Double => ViewStyle): Self = this.set("animationStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationStyle: Self = this.set("animationStyle", js.undefined)
    @scala.inline
    def setAutoClosing(value: Boolean): Self = this.set("autoClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClosing: Self = this.set("autoClosing", js.undefined)
    @scala.inline
    def setBounceBackOnOverdraw(value: Boolean): Self = this.set("bounceBackOnOverdraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceBackOnOverdraw: Self = this.set("bounceBackOnOverdraw", js.undefined)
    @scala.inline
    def setDisableGestures(value: Boolean): Self = this.set("disableGestures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableGestures: Self = this.set("disableGestures", js.undefined)
    @scala.inline
    def setEdgeHitWidth(value: Double): Self = this.set("edgeHitWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHitWidth: Self = this.set("edgeHitWidth", js.undefined)
    @scala.inline
    def setHiddenMenuOffset(value: Double): Self = this.set("hiddenMenuOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenMenuOffset: Self = this.set("hiddenMenuOffset", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setMenu(value: ReactNode): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenuPosition(value: left | right): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    @scala.inline
    def setOnAnimationComplete(value: /* event */ EndCallback => Unit): Self = this.set("onAnimationComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationComplete: Self = this.set("onAnimationComplete", js.undefined)
    @scala.inline
    def setOnChange(value: /* isOpen */ Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnMove(value: /* left */ Double => Unit): Self = this.set("onMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    @scala.inline
    def setOnSliding(value: /* fraction */ Double => Unit): Self = this.set("onSliding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSliding: Self = this.set("onSliding", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* e */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOpenMenuOffset(value: Double): Self = this.set("openMenuOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMenuOffset: Self = this.set("openMenuOffset", js.undefined)
    @scala.inline
    def setToleranceX(value: Double): Self = this.set("toleranceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToleranceX: Self = this.set("toleranceX", js.undefined)
    @scala.inline
    def setToleranceY(value: Double): Self = this.set("toleranceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToleranceY: Self = this.set("toleranceY", js.undefined)
  }
  
}

