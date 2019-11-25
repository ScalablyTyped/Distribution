package typings.recharts.rechartsMod

import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisProps extends js.Object {
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.undefined
  // The range of axis
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var `type`: js.UndefOr[number | category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.undefined
  // The unique id of z-axis
  var zAxisId: js.UndefOr[String | Double] = js.undefined
}

object ZAxisProps {
  @scala.inline
  def apply(
    dataKey: DataKey = null,
    name: String | Double = null,
    range: js.Array[Double] = null,
    scale: ScaleType | RechartsFunction = null,
    `type`: number | category = null,
    unit: String | Double = null,
    zAxisId: String | Double = null
  ): ZAxisProps = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisProps]
  }
}

