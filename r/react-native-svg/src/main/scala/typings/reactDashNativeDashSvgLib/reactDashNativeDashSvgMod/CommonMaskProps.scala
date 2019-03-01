package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMaskProps extends js.Object {
  var mask: js.UndefOr[java.lang.String] = js.undefined
}

object CommonMaskProps {
  @scala.inline
  def apply(mask: java.lang.String = null): CommonMaskProps = {
    val __obj = js.Dynamic.literal()
    if (mask != null) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[CommonMaskProps]
  }
}

