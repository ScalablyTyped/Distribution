package typings.reactNativeVectorIcons.iconMod

import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined delayLongPress, delayPressIn, delayPressOut, disabled, hitSlop, onBlur, onFocus, onPressIn, onPressOut, pressRetentionOffset
- typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined background, useForeground
- typings.reactNative.mod.TouchableHighlightProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined activeOpacity, onHideUnderlay, onShowUnderlay, underlayColor */ @js.native
trait IconButtonProps
  extends IconProps
     with TouchableWithoutFeedbackPropsIOS
     with TouchableWithoutFeedbackPropsAndroid {
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    * Determines the type of background drawable that's going to be used to display feedback.
    * It takes an object with type property and extra data depending on the type.
    * It's recommended to use one of the following static methods to generate that dictionary:
    *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
    *         default background for selectable elements (?android:attr/selectableItemBackground)
    *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
    *         theme's default background for borderless selectable elements
    *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
    *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
    *         with specified color (as a string). If property borderless evaluates to true the ripple will render
    *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
    *         type is available on Android API level 21+
    */
  var background: js.UndefOr[BackgroundPropType] = js.native
  /**
    * Background color of the button
    *
    * @default '#007AFF'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Border radius of the button
    * Set to 0 to disable.
    *
    * @default 5
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * Delay in ms, from onPressIn, before onLongPress is called.
    */
  var delayLongPress: js.UndefOr[Double] = js.native
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called.
    */
  var delayPressIn: js.UndefOr[Double] = js.native
  /**
    * Delay in ms, from the release of the touch, before onPressOut is called.
    */
  var delayPressOut: js.UndefOr[Double] = js.native
  /**
    * If true, disable all interactions for this component.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.native
  /**
    * This defines how far your touch can start away from the button.
    * This is added to pressRetentionOffset when moving off of the button.
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch hits
    * two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.native
  /**
    * Styles applied to the icon only
    * Good for setting margins or a different color.
    *
    * @default {marginRight: 10}
    */
  var iconStyle: js.UndefOr[TextStyle] = js.native
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "blur" occurs, meaning the element lost focus.
    * Some platforms may not have the concept of blur.
    */
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "focus" occurs. Some platforms may not have
    * the concept of focus.
    */
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * When the scroll view is disabled, this defines how far your
    * touch may move off of the button, before deactivating the button.
    * Once deactivated, try moving it back and you'll see that the button
    * is once again reactivated! Move it back and forth several times
    * while the scroll view is disabled. Ensure you pass in a constant
    * to reduce memory allocations.
    */
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  /**
    * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
    * Only exist here so we can have ViewStyle or TextStyle
    *
    */
  @JSName("style")
  var style_IconButtonProps: js.UndefOr[ViewStyle | TextStyle] = js.native
  /**
    * The color of the underlay that will show through when the touch is active.
    */
  var underlayColor: js.UndefOr[ColorValue] = js.native
  var useForeground: js.UndefOr[Boolean] = js.native
}

object IconButtonProps {
  @scala.inline
  def apply(name: String): IconButtonProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
  @scala.inline
  implicit class IconButtonPropsOps[Self <: IconButtonProps] (val x: Self) extends AnyVal {
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledNull: Self = this.set("disabled", null)
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setIconStyle(value: TextStyle): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle | TextStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    @scala.inline
    def setUseForeground(value: Boolean): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
  }
  
}

