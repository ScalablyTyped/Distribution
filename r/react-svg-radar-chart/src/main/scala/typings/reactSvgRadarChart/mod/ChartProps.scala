package typings.reactSvgRadarChart.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var captions: StringDictionary[String]
  var data: js.Array[ChartData]
  var options: js.UndefOr[ChartOptionsProps] = js.undefined
  var size: Double
}

object ChartProps {
  @scala.inline
  def apply(
    captions: StringDictionary[String],
    data: js.Array[ChartData],
    size: Double,
    options: ChartOptionsProps = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal(captions = captions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}

