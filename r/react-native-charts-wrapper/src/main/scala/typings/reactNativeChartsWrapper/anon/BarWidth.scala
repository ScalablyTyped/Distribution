package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarWidth extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var group: js.UndefOr[BarSpace] = js.undefined
}

object BarWidth {
  @scala.inline
  def apply(barWidth: js.UndefOr[Double] = js.undefined, group: BarSpace = null): BarWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarWidth]
  }
}

