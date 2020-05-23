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

trait ReactNativeSideMenuProps extends js.Object {
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
  def apply(
    animationFunction: (/* prop */ Value, /* value */ Double) => CompositeAnimation = null,
    animationStyle: /* value */ Double => ViewStyle = null,
    autoClosing: js.UndefOr[Boolean] = js.undefined,
    bounceBackOnOverdraw: js.UndefOr[Boolean] = js.undefined,
    disableGestures: js.UndefOr[Boolean] = js.undefined,
    edgeHitWidth: js.UndefOr[Double] = js.undefined,
    hiddenMenuOffset: js.UndefOr[Double] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    menu: ReactNode = null,
    menuPosition: left | right = null,
    onAnimationComplete: /* event */ EndCallback => Unit = null,
    onChange: /* isOpen */ Boolean => Unit = null,
    onMove: /* left */ Double => Unit = null,
    onSliding: /* fraction */ Double => Unit = null,
    onStartShouldSetResponderCapture: /* e */ GestureResponderEvent => Boolean = null,
    openMenuOffset: js.UndefOr[Double] = js.undefined,
    toleranceX: js.UndefOr[Double] = js.undefined,
    toleranceY: js.UndefOr[Double] = js.undefined
  ): ReactNativeSideMenuProps = {
    val __obj = js.Dynamic.literal()
    if (animationFunction != null) __obj.updateDynamic("animationFunction")(js.Any.fromFunction2(animationFunction))
    if (animationStyle != null) __obj.updateDynamic("animationStyle")(js.Any.fromFunction1(animationStyle))
    if (!js.isUndefined(autoClosing)) __obj.updateDynamic("autoClosing")(autoClosing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceBackOnOverdraw)) __obj.updateDynamic("bounceBackOnOverdraw")(bounceBackOnOverdraw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGestures)) __obj.updateDynamic("disableGestures")(disableGestures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHitWidth)) __obj.updateDynamic("edgeHitWidth")(edgeHitWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenMenuOffset)) __obj.updateDynamic("hiddenMenuOffset")(hiddenMenuOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onAnimationComplete != null) __obj.updateDynamic("onAnimationComplete")(js.Any.fromFunction1(onAnimationComplete))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction1(onMove))
    if (onSliding != null) __obj.updateDynamic("onSliding")(js.Any.fromFunction1(onSliding))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (!js.isUndefined(openMenuOffset)) __obj.updateDynamic("openMenuOffset")(openMenuOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toleranceX)) __obj.updateDynamic("toleranceX")(toleranceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toleranceY)) __obj.updateDynamic("toleranceY")(toleranceY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativeSideMenuProps]
  }
}

