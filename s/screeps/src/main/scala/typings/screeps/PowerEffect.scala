package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Effect applied to room object as result of a `PowerCreep.usePower`.
  */
trait PowerEffect extends RoomObjectEffect {
  /**
    * Effect ID of the applied effect. `PWR_*` constant.
    */
  var effect: PowerConstant
  /**
    * Power level of the applied effect.
    */
  var level: Double
  /**
    * @deprecated Power ID of the applied effect. `PWR_*` constant. No longer documented, will be removed.
    */
  var power: PowerConstant
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double
}

object PowerEffect {
  @scala.inline
  def apply(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): PowerEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PowerEffect]
  }
}

