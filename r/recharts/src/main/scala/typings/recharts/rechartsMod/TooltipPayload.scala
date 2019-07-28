package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPayload extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var name: String
  var payload: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var value: String | Double | (js.Array[String | Double])
}

object TooltipPayload {
  @scala.inline
  def apply(
    name: String,
    value: String | Double | (js.Array[String | Double]),
    color: String = null,
    dataKey: DataKey = null,
    fill: String = null,
    formatter: TooltipFormatter = null,
    payload: js.Any = null,
    unit: String = null
  ): TooltipPayload = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[TooltipPayload]
  }
}

