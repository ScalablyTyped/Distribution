package typings
package reactDashNativeDashSvgDashChartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: js.UndefOr[scala.Double] = js.undefined
  var right: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, right: scala.Int | scala.Double = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

