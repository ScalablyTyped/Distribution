package typings.reactNativeChartsWrapper.mod

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
    positionX: js.UndefOr[Double] = js.undefined,
    positionY: js.UndefOr[Double] = js.undefined,
    text: String = null,
    textColor: js.UndefOr[Color] = js.undefined,
    textSize: js.UndefOr[Double] = js.undefined
  ): ChartDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(positionX)) __obj.updateDynamic("positionX")(positionX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionY)) __obj.updateDynamic("positionY")(positionY.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textSize)) __obj.updateDynamic("textSize")(textSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDescription]
  }
}

