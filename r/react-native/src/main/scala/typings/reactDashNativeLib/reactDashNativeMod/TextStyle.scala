package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.TextStyleAndroid because Would inherit conflicting mutable fields List(flexShrink, flex, minHeight, margin, flexBasis, borderBottomWidth, marginTop, marginHorizontal, marginLeft, overflow, flexDirection, alignItems, aspectRatio, bottom, alignContent, alignSelf, borderStartWidth, left, marginEnd, borderLeftWidth, paddingRight, height, borderWidth, borderTopWidth, borderEndWidth, direction, paddingTop, justifyContent, marginVertical, flexWrap, paddingStart, borderRightWidth, minWidth, marginBottom, paddingBottom, zIndex, marginRight, end, position, marginStart, paddingVertical, padding, start, paddingEnd, width, top, maxWidth, flexGrow, paddingLeft, maxHeight, paddingHorizontal, right, display, shadowOpacity, shadowColor, shadowOffset, shadowRadius, translateX, scaleY, transformMatrix, rotation, transform, scaleX, translateY, backgroundColor, borderTopStartRadius, borderTopRightRadius, borderBottomColor, borderTopEndRadius, borderRightColor, borderLeftColor, borderEndColor, borderBottomEndRadius, borderStartColor, borderRadius, borderBottomLeftRadius, testID, elevation, borderStyle, borderBottomStartRadius, backfaceVisibility, opacity, borderTopColor, borderTopLeftRadius, borderBottomRightRadius, borderColor))*/

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

