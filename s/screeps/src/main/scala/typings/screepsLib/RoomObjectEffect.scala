package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomObjectEffect extends js.Object {
  /**
    * Power level of the applied effect.
    */
  var level: scala.Double
  /**
    * Power ID of the applied effect. `PWR_*` constant.
    */
  var power: PowerConstant
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: scala.Double
}

object RoomObjectEffect {
  @scala.inline
  def apply(level: scala.Double, power: PowerConstant, ticksRemaining: scala.Double): RoomObjectEffect = {
    val __obj = js.Dynamic.literal(level = level, power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining)
  
    __obj.asInstanceOf[RoomObjectEffect]
  }
}

