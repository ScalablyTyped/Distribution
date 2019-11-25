package typings.recharts.rechartsMod

import typings.recharts.Anon_ErrorVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBarProps extends js.Object {
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: DataKey
  var dataPointFormatter: js.UndefOr[DataPointFormatter] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

object ErrorBarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    data: js.Array[_] = null,
    dataPointFormatter: (/* entry */ js.Any, /* dataKey */ DataKey) => Anon_ErrorVal = null,
    layout: String = null,
    offset: Int | Double = null,
    stroke: String = null,
    strokeWidth: Int | Double = null,
    width: Int | Double = null,
    xAxis: js.Object = null,
    yAxis: js.Object = null
  ): ErrorBarProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataPointFormatter != null) __obj.updateDynamic("dataPointFormatter")(js.Any.fromFunction2(dataPointFormatter))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBarProps]
  }
}

