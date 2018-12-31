package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps
  extends AccessibilityProps
     with TextPropsIOS
     with TextPropsAndroid {
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
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
  var ellipsizeMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip
  ] = js.undefined
  /**
    * Line Break mode. Works only with numberOfLines.
    * clip is working only for iOS
    */
  var lineBreakMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip
  ] = js.undefined
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to truncate the text with an ellipsis after computing the text
    * layout, including line wrapping, such that the total number of lines
    * does not exceed this number.
    *
    * This prop is commonly used with `ellipsizeMode`.
    */
  var numberOfLines: js.UndefOr[scala.Double] = js.undefined
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, scala.Unit]] = js.undefined
  /**
    * This function is called on long press.
    * e.g., `onLongPress={this.increaseSize}>``
    */
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
    * This function is called on press.
    * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
    * @see https://facebook.github.io/react-native/docs/text.html#style
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

