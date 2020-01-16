package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarWidth extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var group: js.UndefOr[Anon_BarSpace] = js.undefined
}

object Anon_BarWidth {
  @scala.inline
  def apply(barWidth: Int | Double = null, group: Anon_BarSpace = null): Anon_BarWidth = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarWidth]
  }
}

