package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.SpeedDialDirection
import typings.reactDashOnsenui.reactDashOnsenuiMod.SpeedDialPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: js.UndefOr[SpeedDialDirection] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[SpeedDialPosition] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(
    direction: SpeedDialDirection = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    position: SpeedDialPosition = null
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Direction]
  }
}

