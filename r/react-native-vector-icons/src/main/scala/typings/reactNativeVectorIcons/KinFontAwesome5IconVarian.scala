package typings.reactNativeVectorIcons

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.`no-hide-descendants`
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.assertive
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.auto
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.balanced
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.button
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.clip
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.head
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.highQuality
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.middle
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.no
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.none
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.polite
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.radiobutton_checked
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.radiobutton_unchecked
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.simple
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.tail
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in react-native-vector-icons.react-native-vector-icons/FontAwesome5.FontAwesome5IconVariants ]:? boolean} & react-native-vector-icons.react-native-vector-icons/Icon.IconProps */
trait KinFontAwesome5IconVarian extends js.Object {
  /**
    * Provides an array of custom actions available for accessibility.
    */
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  /**
    * In some cases, we also want to alert the end user of the type of selected component (i.e., that it is a “button”).
    * If we were using native buttons, this would work automatically. Since we are using javascript, we need to
    * provide a bit more context for TalkBack. To do so, you must specify the ‘accessibilityComponentType’ property
    * for any UI component. For instances, we support ‘button’, ‘radiobutton_checked’ and ‘radiobutton_unchecked’ and so on.
    * @platform android
    */
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  /**
    * A Boolean value indicating whether the accessibility elements contained within this accessibility element
    * are hidden to the screen reader.
    * @platform ios
    */
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
    */
  var accessibilityHint: js.UndefOr[String] = js.undefined
  /**
    * https://facebook.github.io/react-native/docs/accessibility#accessibilityignoresinvertcolorsios
    * @platform ios
    */
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
    * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  /**
    * Indicates to accessibility services whether the user should be notified when this view changes.
    * Works for Android API >= 19 only.
    * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
    * @platform android
    */
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  /**
    * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
    */
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  /**
    * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
    */
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  /**
    * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
    * @deprecated: accessibilityState available in 0.60+
    */
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  /**
    * Accessibility traits tell a person using VoiceOver what kind of element they have selected.
    * Is this element a label? A button? A header? These questions are answered by accessibilityTraits.
    * @platform ios
    */
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  /**
    * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
    * it contains range information (minimum, current, and maximum).
    */
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  /**
    * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
    * @platform ios
    */
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, indicates that the view is an accessibility element.
    * By default, all the touchable elements are accessible.
    */
  var accessible: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether font should be scaled down automatically to fit given style constraints.
    */
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var brand: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of the icon
    *
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * This can be one of the following values:
    *
    * - `head` - The line is displayed so that the end fits in the container and the missing text
    * at the beginning of the line is indicated by an ellipsis glyph. e.g., "...wxyz"
    * - `middle` - The line is displayed so that the beginning and end fit in the container and the
    * missing text in the middle is indicated by an ellipsis glyph. "ab...yz"
    * - `tail` - The line is displayed so that the beginning fits in the container and the
    * missing text at the end of the line is indicated by an ellipsis glyph. e.g., "abcd..."
    * - `clip` - Lines are not drawn past the edge of the text container.
    *
    * The default is `tail`.
    *
    * `numberOfLines` must be set in conjunction with this prop.
    *
    * > `clip` is working only for iOS
    */
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  /**
    * Controls how view is important for accessibility which is if it fires accessibility events
    * and if it is reported to accessibility services that query the screen.
    * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
    *
    * Possible values:
    *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
    *      'yes' - The view is important for accessibility.
    *      'no' - The view is not important for accessibility.
    *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
    */
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  /**
    * Line Break mode. Works only with numberOfLines.
    * clip is working only for iOS
    */
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  /**
    * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
    * - null/undefined (default): inherit from the parent node or the global default (0)
    * - 0: no max, ignore parent/global default
    * - >= 1: sets the maxFontSizeMultiplier of this node to this value
    */
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  /**
    * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
    */
  var minimumFontScale: js.UndefOr[Double] = js.undefined
  /**
    * Name of the icon to show
    *
    * See Icon Explorer app
    * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
    */
  var name: String
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  /**
    * Used to truncate the text with an ellipsis after computing the text
    * layout, including line wrapping, such that the total number of lines
    * does not exceed this number.
    *
    * This prop is commonly used with `ellipsizeMode`.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
    */
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  /**
    * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
    * @platform ios
    */
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
    * @platform ios
    */
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  /**
    * This function is called on long press.
    * e.g., `onLongPress={this.increaseSize}>``
    */
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * This function is called on press.
    * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[String] = js.undefined
  /**
    * Size of the icon, can also be passed as fontSize in the style object.
    *
    * @default 12
    */
  var size: js.UndefOr[Double] = js.undefined
  var solid: js.UndefOr[Boolean] = js.undefined
  /**
    * @see https://facebook.github.io/react-native/docs/text.html#style
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * When `true`, no visual change is made when text is pressed down. By
    * default, a gray oval highlights the text on press down.
    */
  var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}

object KinFontAwesome5IconVarian {
  @scala.inline
  def apply(
    name: String,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
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
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    brand: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    ellipsizeMode: head | middle | tail | clip = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    light: js.UndefOr[Boolean] = js.undefined,
    lineBreakMode: head | middle | tail | clip = null,
    maxFontSizeMultiplier: Int | Double = null,
    minimumFontScale: Int | Double = null,
    nativeID: String = null,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    size: Int | Double = null,
    solid: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    textBreakStrategy: simple | highQuality | balanced = null
  ): KinFontAwesome5IconVarian = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (!js.isUndefined(brand)) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(solid)) __obj.updateDynamic("solid")(solid.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinFontAwesome5IconVarian]
  }
}

