package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarLineScatterCandleBubbleConfig extends js.Object {
  var highlightColor: js.UndefOr[Color] = js.undefined
}

object BarLineScatterCandleBubbleConfig {
  @scala.inline
  def apply(highlightColor: js.UndefOr[Color] = js.undefined): BarLineScatterCandleBubbleConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightColor)) __obj.updateDynamic("highlightColor")(highlightColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLineScatterCandleBubbleConfig]
  }
}

