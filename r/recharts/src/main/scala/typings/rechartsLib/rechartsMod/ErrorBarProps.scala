package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBarProps extends js.Object {
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: DataKey
  var dataPointFormatter: js.UndefOr[DataPointFormatter] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

object ErrorBarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    data: js.Array[_] = null,
    dataPointFormatter: DataPointFormatter = null,
    layout: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    xAxis: js.Object = null,
    yAxis: js.Object = null
  ): ErrorBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataPointFormatter != null) __obj.updateDynamic("dataPointFormatter")(dataPointFormatter)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    __obj.asInstanceOf[ErrorBarProps]
  }
}

