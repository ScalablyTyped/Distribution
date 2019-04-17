package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerIOSProps extends ViewProps {
  /**
    * The currently selected date.
    */
  var date: stdLib.Date
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibNumbers.`1` | reactDashNativeLib.reactDashNativeLibNumbers.`2` | reactDashNativeLib.reactDashNativeLibNumbers.`3` | reactDashNativeLib.reactDashNativeLibNumbers.`4` | reactDashNativeLib.reactDashNativeLibNumbers.`5` | reactDashNativeLib.reactDashNativeLibNumbers.`6` | reactDashNativeLib.reactDashNativeLibNumbers.`10` | reactDashNativeLib.reactDashNativeLibNumbers.`12` | reactDashNativeLib.reactDashNativeLibNumbers.`15` | reactDashNativeLib.reactDashNativeLibNumbers.`20` | reactDashNativeLib.reactDashNativeLibNumbers.`30`
  ] = js.undefined
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.date | reactDashNativeLib.reactDashNativeLibStrings.time | reactDashNativeLib.reactDashNativeLibStrings.datetime
  ] = js.undefined
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: stdLib.Date): scala.Unit
}

object DatePickerIOSProps {
  @scala.inline
  def apply(
    date: stdLib.Date,
    onDateChange: stdLib.Date => scala.Unit,
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maximumDate: stdLib.Date = null,
    minimumDate: stdLib.Date = null,
    minuteInterval: reactDashNativeLib.reactDashNativeLibNumbers.`1` | reactDashNativeLib.reactDashNativeLibNumbers.`2` | reactDashNativeLib.reactDashNativeLibNumbers.`3` | reactDashNativeLib.reactDashNativeLibNumbers.`4` | reactDashNativeLib.reactDashNativeLibNumbers.`5` | reactDashNativeLib.reactDashNativeLibNumbers.`6` | reactDashNativeLib.reactDashNativeLibNumbers.`10` | reactDashNativeLib.reactDashNativeLibNumbers.`12` | reactDashNativeLib.reactDashNativeLibNumbers.`15` | reactDashNativeLib.reactDashNativeLibNumbers.`20` | reactDashNativeLib.reactDashNativeLibNumbers.`30` = null,
    mode: reactDashNativeLib.reactDashNativeLibStrings.date | reactDashNativeLib.reactDashNativeLibStrings.time | reactDashNativeLib.reactDashNativeLibStrings.datetime = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: () => scala.Unit = null,
    onAccessibilityTap: () => scala.Unit = null,
    onLayout: /* event */ LayoutChangeEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => scala.Unit = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    timeZoneOffsetInMinutes: scala.Int | scala.Double = null,
    tvParallaxMagnification: scala.Int | scala.Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: scala.Int | scala.Double = null,
    tvParallaxShiftDistanceY: scala.Int | scala.Double = null,
    tvParallaxTiltAngle: scala.Int | scala.Double = null
  ): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(date = date, onDateChange = js.Any.fromFunction1(onDateChange))
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate)
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate)
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction0(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (timeZoneOffsetInMinutes != null) __obj.updateDynamic("timeZoneOffsetInMinutes")(timeZoneOffsetInMinutes.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerIOSProps]
  }
}

