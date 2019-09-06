package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.BackgroundPropType
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.balanced
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.clip
import typings.reactDashNative.reactDashNativeStrings.head
import typings.reactDashNative.reactDashNativeStrings.highQuality
import typings.reactDashNative.reactDashNativeStrings.middle
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.simple
import typings.reactDashNative.reactDashNativeStrings.tail
import typings.reactDashNative.reactDashNativeStrings.yes
import typings.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends IconButtonProps {
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Styles for the Icon when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Adds box shadow to button
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  /**
    * Reverses color scheme
    *
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify reverse icon color
    *
    * @default 'white'
    */
  var reverseColor: js.UndefOr[String] = js.undefined
  /**
    * Type (defaults to material, options are material-community, zocial, font-awesome, octicon, ionicon, foundation, evilicon, simple-line-icon, or entypo)
    * @default 'material'
    */
  var `type`: js.UndefOr[IconType] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: String,
    Component: ComponentClass[js.Object, ComponentState] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessible: js.UndefOr[Boolean] = js.undefined,
    activeOpacity: Int | Double = null,
    adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    background: BackgroundPropType = null,
    backgroundColor: String = null,
    borderRadius: Int | Double = null,
    color: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabledStyle: StyleProp[ViewStyle] = null,
    ellipsizeMode: head | middle | tail | clip = null,
    iconStyle: ViewStyle = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    lineBreakMode: head | middle | tail | clip = null,
    maxFontSizeMultiplier: Int | Double = null,
    minimumFontScale: Int | Double = null,
    nativeID: String = null,
    numberOfLines: Int | Double = null,
    onAccessibilityTap: () => Unit = null,
    onHideUnderlay: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onShowUnderlay: () => Unit = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    reverseColor: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    size: Int | Double = null,
    style: StyleProp[TextStyle] = null,
    style_IconButtonProps: ViewStyle | TextStyle = null,
    suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    `type`: IconType = null,
    underlayColor: String = null,
    useForeground: js.UndefOr[Boolean] = js.undefined
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (background != null) __obj.updateDynamic("background")(background)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (reverseColor != null) __obj.updateDynamic("reverseColor")(reverseColor)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (style_IconButtonProps != null) __obj.updateDynamic("style")(style_IconButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    if (!js.isUndefined(useForeground)) __obj.updateDynamic("useForeground")(useForeground)
    __obj.asInstanceOf[IconProps]
  }
}

