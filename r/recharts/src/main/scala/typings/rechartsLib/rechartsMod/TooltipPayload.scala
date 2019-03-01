package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPayload extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var name: java.lang.String
  var payload: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
}

object TooltipPayload {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]),
    color: java.lang.String = null,
    dataKey: DataKey = null,
    fill: java.lang.String = null,
    formatter: TooltipFormatter = null,
    payload: js.Any = null,
    unit: java.lang.String = null
  ): TooltipPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[TooltipPayload]
  }
}

