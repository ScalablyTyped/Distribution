package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Natural effect applied to room object
  */
trait NaturalEffect extends RoomObjectEffect {
  /**
    * Effect ID of the applied effect. `EFFECT_*` constant.
    */
  var effect: EffectConstant
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double
}

object NaturalEffect {
  @scala.inline
  def apply(effect: EffectConstant, ticksRemaining: Double): NaturalEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NaturalEffect]
  }
}

