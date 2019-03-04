package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTSurfaceProps extends js.Object {
  var height: scala.Double
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: scala.Double
}

object ARTSurfaceProps {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, style: StyleProp[ViewStyle] = null): ARTSurfaceProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTSurfaceProps]
  }
}

