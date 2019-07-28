package typings.reactDashNativeDashCalendars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var endingDay: js.UndefOr[Boolean] = js.undefined
  var startingDay: js.UndefOr[Boolean] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String = null,
    endingDay: js.UndefOr[Boolean] = js.undefined,
    startingDay: js.UndefOr[Boolean] = js.undefined
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay)
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay)
    __obj.asInstanceOf[Anon_Color]
  }
}

