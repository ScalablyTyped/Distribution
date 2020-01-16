package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarLineScatterCandleBubbleConfig extends js.Object {
  var highlightColor: js.UndefOr[Color] = js.undefined
}

object BarLineScatterCandleBubbleConfig {
  @scala.inline
  def apply(highlightColor: Int | Double = null): BarLineScatterCandleBubbleConfig = {
    val __obj = js.Dynamic.literal()
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLineScatterCandleBubbleConfig]
  }
}

