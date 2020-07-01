package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSeriesPoint extends AbstractSeriesPoint {
  var label: String
  var rotation: js.UndefOr[Double] = js.undefined
  var x: Double
  var xOffset: js.UndefOr[Double] = js.undefined
  var y: Double
  var yOffset: js.UndefOr[Double] = js.undefined
}

object LabelSeriesPoint {
  @scala.inline
  def apply(
    label: String,
    x: Double,
    y: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    rotation: js.UndefOr[Double] = js.undefined,
    xOffset: js.UndefOr[Double] = js.undefined,
    yOffset: js.UndefOr[Double] = js.undefined
  ): LabelSeriesPoint = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xOffset)) __obj.updateDynamic("xOffset")(xOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yOffset)) __obj.updateDynamic("yOffset")(yOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSeriesPoint]
  }
}

