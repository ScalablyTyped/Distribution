package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDescription extends js.Object {
  var positionX: js.UndefOr[Double] = js.undefined
  var positionY: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
}

object ChartDescription {
  @scala.inline
  def apply(
    positionX: Int | Double = null,
    positionY: Int | Double = null,
    text: String = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null
  ): ChartDescription = {
    val __obj = js.Dynamic.literal()
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDescription]
  }
}

