package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Natural effect applied to room object
  */
trait NaturalEffect
  extends StObject
     with RoomObjectEffect {
  
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
  
  inline def apply(effect: EffectConstant, ticksRemaining: Double): NaturalEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaturalEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NaturalEffect] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: EffectConstant): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setTicksRemaining(value: Double): Self = StObject.set(x, "ticksRemaining", value.asInstanceOf[js.Any])
  }
}
