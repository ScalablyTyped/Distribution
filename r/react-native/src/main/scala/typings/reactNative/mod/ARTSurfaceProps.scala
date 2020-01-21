package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTSurfaceProps extends js.Object {
  var height: Double
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: Double
}

object ARTSurfaceProps {
  @scala.inline
  def apply(height: Double, width: Double, style: StyleProp[ViewStyle] = null): ARTSurfaceProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTSurfaceProps]
  }
}

