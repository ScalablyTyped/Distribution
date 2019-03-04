package typings
package reactDashNativeDashScaledDashImageLib.reactDashNativeDashScaledDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaledImageProps extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScaledImageProps {
  @scala.inline
  def apply(
    source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType,
    height: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle] = null,
    width: scala.Int | scala.Double = null
  ): ScaledImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledImageProps]
  }
}

