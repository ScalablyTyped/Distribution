package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooldown extends js.Object {
  /**
    * Cooldown ticks remaining, or undefined if the power creep is not spawned in the world.
    */
  var cooldown: js.UndefOr[scala.Double]
  /**
    * Current level of the power
    */
  var level: scala.Double
}

object Anon_Cooldown {
  @scala.inline
  def apply(level: scala.Double, cooldown: scala.Int | scala.Double = null): Anon_Cooldown = {
    val __obj = js.Dynamic.literal(level = level)
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cooldown]
  }
}

