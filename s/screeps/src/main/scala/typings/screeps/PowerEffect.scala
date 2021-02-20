package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Effect applied to room object as result of a `PowerCreep.usePower`.
  */
@js.native
trait PowerEffect extends RoomObjectEffect {
  
  /**
    * Effect ID of the applied effect. `PWR_*` constant.
    */
  var effect: PowerConstant = js.native
  
  /**
    * Power level of the applied effect.
    */
  var level: Double = js.native
  
  /**
    * @deprecated Power ID of the applied effect. `PWR_*` constant. No longer documented, will be removed.
    */
  var power: PowerConstant = js.native
  
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double = js.native
}
object PowerEffect {
  
  @scala.inline
  def apply(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): PowerEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerEffect]
  }
  
  @scala.inline
  implicit class PowerEffectMutableBuilder[Self <: PowerEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: PowerConstant): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: PowerConstant): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksRemaining(value: Double): Self = StObject.set(x, "ticksRemaining", value.asInstanceOf[js.Any])
  }
}
