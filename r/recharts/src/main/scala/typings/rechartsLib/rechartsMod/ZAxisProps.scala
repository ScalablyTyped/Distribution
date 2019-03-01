package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisProps extends js.Object {
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The range of axis
  var range: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The unique id of z-axis
  var zAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ZAxisProps {
  @scala.inline
  def apply(
    dataKey: DataKey = null,
    name: java.lang.String | scala.Double = null,
    range: js.Array[scala.Double] = null,
    scale: ScaleType | RechartsFunction = null,
    `type`: rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category = null,
    unit: java.lang.String | scala.Double = null,
    zAxisId: java.lang.String | scala.Double = null
  ): ZAxisProps = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisProps]
  }
}

