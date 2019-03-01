package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.SpeedDialDirection] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.SpeedDialPosition] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(
    direction: reactDashOnsenuiLib.reactDashOnsenuiMod.SpeedDialDirection = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    position: reactDashOnsenuiLib.reactDashOnsenuiMod.SpeedDialPosition = null
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Direction]
  }
}

