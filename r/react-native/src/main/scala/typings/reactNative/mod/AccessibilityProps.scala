package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityProps
  extends AccessibilityPropsAndroid
     with AccessibilityPropsIOS {
  /**
    * Provides an array of custom actions available for accessibility.
    */
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  /**
    * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
    */
  var accessibilityHint: js.UndefOr[String] = js.native
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
    * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  /**
    * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
    */
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  /**
    * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
    */
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  /**
    * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
    * it contains range information (minimum, current, and maximum).
    */
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  /**
    * When true, indicates that the view is an accessibility element.
    * By default, all the touchable elements are accessible.
    */
  var accessible: js.UndefOr[Boolean] = js.native
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
    */
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
}

object AccessibilityProps {
  @scala.inline
  def apply(): AccessibilityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityProps]
  }
  @scala.inline
  implicit class AccessibilityPropsOps[Self <: AccessibilityProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
  }
  
}

