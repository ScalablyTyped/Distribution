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
    onDateChange: js.Function1[stdLib.Date, scala.Unit],
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
    hitSlop: Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    locale: java.lang.String = null,
    maximumDate: stdLib.Date = null,
    minimumDate: stdLib.Date = null,
    minuteInterval: reactDashNativeLib.reactDashNativeLibNumbers.`1` | reactDashNativeLib.reactDashNativeLibNumbers.`2` | reactDashNativeLib.reactDashNativeLibNumbers.`3` | reactDashNativeLib.reactDashNativeLibNumbers.`4` | reactDashNativeLib.reactDashNativeLibNumbers.`5` | reactDashNativeLib.reactDashNativeLibNumbers.`6` | reactDashNativeLib.reactDashNativeLibNumbers.`10` | reactDashNativeLib.reactDashNativeLibNumbers.`12` | reactDashNativeLib.reactDashNativeLibNumbers.`15` | reactDashNativeLib.reactDashNativeLibNumbers.`20` | reactDashNativeLib.reactDashNativeLibNumbers.`30` = null,
    mode: reactDashNativeLib.reactDashNativeLibStrings.date | reactDashNativeLib.reactDashNativeLibStrings.time | reactDashNativeLib.reactDashNativeLibStrings.datetime = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onLayout: js.Function1[/* event */ LayoutChangeEvent, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onMoveShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onResponderEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderGrant: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderReject: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderRelease: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminate: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminationRequest: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onTouchCancel: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEndCapture: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    timeZoneOffsetInMinutes: scala.Int | scala.Double = null
  ): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(date = date, onDateChange = onDateChange)
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
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate)
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate)
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (timeZoneOffsetInMinutes != null) __obj.updateDynamic("timeZoneOffsetInMinutes")(timeZoneOffsetInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerIOSProps]
  }
}

