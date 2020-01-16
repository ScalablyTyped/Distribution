package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: js.UndefOr[Anon_Max] = js.undefined
  var right: js.UndefOr[Anon_Max] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(left: Anon_Max = null, right: Anon_Max = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

