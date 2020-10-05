package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNavigationStack.anon.TintColorString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderLeftButtonProps extends js.Object {
  /**
    * Accessibility label for the button for screen readers.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  /**
    * Whether label font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Function which returns a React Element to display custom image in header's back button.
    */
  var backImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.native
  /**
    * Whether it's possible to navigate back in stack.
    */
  var canGoBack: js.UndefOr[Boolean] = js.native
  /**
    * Whether the button is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Label text for the button. Usually the title of the previous screen.
    * By default, this is only shown on iOS.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Style object for the label.
    */
  var labelStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  /**
    * Whether the label text is visible.
    * Defaults to `true` on iOS and `false` on Android.
    */
  var labelVisible: js.UndefOr[Boolean] = js.native
  /**
    * Callback to trigger when the size of the label changes.
    */
  var onLabelLayout: js.UndefOr[js.Function1[/* e */ LayoutChangeEvent, Unit]] = js.native
  /**
    * Callback to call when the button is pressed.
    * By default, this triggers `goBack`.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var pressColorAndroid: js.UndefOr[String] = js.native
  /**
    * Layout of the screen.
    */
  var screenLayout: js.UndefOr[Layout] = js.native
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * Layout of the title element in the header.
    */
  var titleLayout: js.UndefOr[Layout] = js.native
  /**
    * Label text to show when there isn't enough space for the full label.
    */
  var truncatedLabel: js.UndefOr[String] = js.native
}

object StackHeaderLeftButtonProps {
  @scala.inline
  def apply(): StackHeaderLeftButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderLeftButtonProps]
  }
  @scala.inline
  implicit class StackHeaderLeftButtonPropsOps[Self <: StackHeaderLeftButtonProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setBackImage(value: /* props */ TintColorString => ReactNode): Self = this.set("backImage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackImage: Self = this.set("backImage", js.undefined)
    @scala.inline
    def setCanGoBack(value: Boolean): Self = this.set("canGoBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanGoBack: Self = this.set("canGoBack", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelVisible(value: Boolean): Self = this.set("labelVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelVisible: Self = this.set("labelVisible", js.undefined)
    @scala.inline
    def setOnLabelLayout(value: /* e */ LayoutChangeEvent => Unit): Self = this.set("onLabelLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLabelLayout: Self = this.set("onLabelLayout", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setPressColorAndroid(value: String): Self = this.set("pressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressColorAndroid: Self = this.set("pressColorAndroid", js.undefined)
    @scala.inline
    def setScreenLayout(value: Layout): Self = this.set("screenLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenLayout: Self = this.set("screenLayout", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitleLayout(value: Layout): Self = this.set("titleLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLayout: Self = this.set("titleLayout", js.undefined)
    @scala.inline
    def setTruncatedLabel(value: String): Self = this.set("truncatedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncatedLabel: Self = this.set("truncatedLabel", js.undefined)
  }
  
}

