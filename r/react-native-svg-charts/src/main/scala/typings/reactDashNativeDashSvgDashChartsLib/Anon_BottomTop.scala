package typings
package reactDashNativeDashSvgDashChartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomTop extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BottomTop {
  @scala.inline
  def apply(bottom: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): Anon_BottomTop = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomTop]
  }
}

