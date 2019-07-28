package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMaskProps extends js.Object {
  var mask: js.UndefOr[String] = js.undefined
}

object CommonMaskProps {
  @scala.inline
  def apply(mask: String = null): CommonMaskProps = {
    val __obj = js.Dynamic.literal()
    if (mask != null) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[CommonMaskProps]
  }
}

