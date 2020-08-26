package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Natural effect applied to room object
  */
@js.native
trait NaturalEffect extends RoomObjectEffect {
  /**
    * Effect ID of the applied effect. `EFFECT_*` constant.
    */
  var effect: EffectConstant = js.native
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double = js.native
}

object NaturalEffect {
  @scala.inline
  def apply(effect: EffectConstant, ticksRemaining: Double): NaturalEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaturalEffect]
  }
  @scala.inline
  implicit class NaturalEffectOps[Self <: NaturalEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEffect(value: EffectConstant): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicksRemaining(value: Double): Self = this.set("ticksRemaining", value.asInstanceOf[js.Any])
  }
  
}

