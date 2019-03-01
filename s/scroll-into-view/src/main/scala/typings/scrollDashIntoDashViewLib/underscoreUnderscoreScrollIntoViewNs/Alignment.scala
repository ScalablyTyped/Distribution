package typings
package scrollDashIntoDashViewLib.underscoreUnderscoreScrollIntoViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  /** 0 to 1, default 0.5 (center) */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** 0 to 1, default 0.5 (center) */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): Alignment = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

