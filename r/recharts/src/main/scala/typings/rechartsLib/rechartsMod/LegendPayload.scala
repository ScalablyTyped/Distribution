package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendPayload extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var id: js.Any
  var `type`: LegendType
  var value: js.Any
}

object LegendPayload {
  @scala.inline
  def apply(id: js.Any, `type`: LegendType, value: js.Any, color: java.lang.String = null): LegendPayload = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("value")(value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[LegendPayload]
  }
}

