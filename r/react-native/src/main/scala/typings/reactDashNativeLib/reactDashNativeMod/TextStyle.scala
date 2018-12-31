package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.TextStyleAndroid because Would inherit conflicting mutable fields List(alignContent, alignItems, alignSelf, aspectRatio, backfaceVisibility, backgroundColor, borderBottomColor, borderBottomEndRadius, borderBottomLeftRadius, borderBottomRightRadius, borderBottomStartRadius, borderBottomWidth, borderColor, borderEndColor, borderEndWidth, borderLeftColor, borderLeftWidth, borderRadius, borderRightColor, borderRightWidth, borderStartColor, borderStartWidth, borderStyle, borderTopColor, borderTopEndRadius, borderTopLeftRadius, borderTopRightRadius, borderTopStartRadius, borderTopWidth, borderWidth, bottom, direction, display, elevation, end, flex, flexBasis, flexDirection, flexGrow, flexShrink, flexWrap, height, justifyContent, left, margin, marginBottom, marginEnd, marginHorizontal, marginLeft, marginRight, marginStart, marginTop, marginVertical, maxHeight, maxWidth, minHeight, minWidth, opacity, overflow, padding, paddingBottom, paddingEnd, paddingHorizontal, paddingLeft, paddingRight, paddingStart, paddingTop, paddingVertical, position, right, rotation, scaleX, scaleY, shadowColor, shadowOffset, shadowOpacity, shadowRadius, start, testID, top, transform, transformMatrix, translateX, translateY, width, zIndex))*/
trait TextStyle extends TextStyleIOS {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.italic
  ] = js.undefined
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.bold | reactDashNativeLib.reactDashNativeLibStrings.`100` | reactDashNativeLib.reactDashNativeLibStrings.`200` | reactDashNativeLib.reactDashNativeLibStrings.`300` | reactDashNativeLib.reactDashNativeLibStrings.`400` | reactDashNativeLib.reactDashNativeLibStrings.`500` | reactDashNativeLib.reactDashNativeLibStrings.`600` | reactDashNativeLib.reactDashNativeLibStrings.`700` | reactDashNativeLib.reactDashNativeLibStrings.`800` | reactDashNativeLib.reactDashNativeLibStrings.`900`
  ] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var textAlign: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.left | reactDashNativeLib.reactDashNativeLibStrings.right | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.justify
  ] = js.undefined
  var textDecorationLine: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.underline | reactDashNativeLib.reactDashNativeLibStrings.`line-through` | (reactDashNativeLib.reactDashNativeLibStrings.`underline line-through`)
  ] = js.undefined
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  var textShadowOffset: js.UndefOr[reactDashNativeLib.Anon_Height] = js.undefined
  var textShadowRadius: js.UndefOr[scala.Double] = js.undefined
}

