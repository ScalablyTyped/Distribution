package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cooldown extends js.Object {
  /**
    * Cooldown ticks remaining, or undefined if the power creep is not spawned in the world.
    */
  var cooldown: js.UndefOr[Double] = js.undefined
  /**
    * Current level of the power
    */
  var level: Double
}

object Cooldown {
  @scala.inline
  def apply(level: Double, cooldown: js.UndefOr[Double] = js.undefined): Cooldown = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(cooldown)) __obj.updateDynamic("cooldown")(cooldown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooldown]
  }
}

