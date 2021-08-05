package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Effect applied to room object as result of a `PowerCreep.usePower`.
  */
trait PowerEffect
  extends StObject
     with RoomObjectEffect {
  
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
  
  inline def apply(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): PowerEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerEffect]
  }
  
  extension [Self <: PowerEffect](x: Self) {
    
    inline def setEffect(value: PowerConstant): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setPower(value: PowerConstant): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setTicksRemaining(value: Double): Self = StObject.set(x, "ticksRemaining", value.asInstanceOf[js.Any])
  }
}
