package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendPayload extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var id: js.Any
  var `type`: LegendType
  var value: js.Any
}

object LegendPayload {
  @scala.inline
  def apply(id: js.Any, `type`: LegendType, value: js.Any, color: String = null): LegendPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendPayload]
  }
}

