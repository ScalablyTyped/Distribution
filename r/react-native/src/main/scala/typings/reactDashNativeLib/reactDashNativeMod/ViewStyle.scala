package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStyle
  extends FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  var backfaceVisibility: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.visible | reactDashNativeLib.reactDashNativeLibStrings.hidden
  ] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderBottomColor: js.UndefOr[java.lang.String] = js.undefined
  var borderBottomEndRadius: js.UndefOr[scala.Double] = js.undefined
  var borderBottomLeftRadius: js.UndefOr[scala.Double] = js.undefined
  var borderBottomRightRadius: js.UndefOr[scala.Double] = js.undefined
  var borderBottomStartRadius: js.UndefOr[scala.Double] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderEndColor: js.UndefOr[java.lang.String] = js.undefined
  var borderLeftColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderRightColor: js.UndefOr[java.lang.String] = js.undefined
  var borderStartColor: js.UndefOr[java.lang.String] = js.undefined
  var borderStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.solid | reactDashNativeLib.reactDashNativeLibStrings.dotted | reactDashNativeLib.reactDashNativeLibStrings.dashed
  ] = js.undefined
  var borderTopColor: js.UndefOr[java.lang.String] = js.undefined
  var borderTopEndRadius: js.UndefOr[scala.Double] = js.undefined
  var borderTopLeftRadius: js.UndefOr[scala.Double] = js.undefined
  var borderTopRightRadius: js.UndefOr[scala.Double] = js.undefined
  var borderTopStartRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

