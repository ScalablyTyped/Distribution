package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomObjectEffect extends js.Object {
  /**
    * Power level of the applied effect.
    */
  var level: Double
  /**
    * Power ID of the applied effect. `PWR_*` constant.
    */
  var power: PowerConstant
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double
}

object RoomObjectEffect {
  @scala.inline
  def apply(level: Double, power: PowerConstant, ticksRemaining: Double): RoomObjectEffect = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomObjectEffect]
  }
}

