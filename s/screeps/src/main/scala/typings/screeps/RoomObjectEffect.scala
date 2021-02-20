package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Discriminated union of possible effects on `effect`
  */
/* Rewritten from type alias, can be one of: 
  - typings.screeps.NaturalEffect
  - typings.screeps.PowerEffect
*/
trait RoomObjectEffect extends StObject
object RoomObjectEffect {
  
  @scala.inline
  def NaturalEffect(effect: EffectConstant, ticksRemaining: Double): typings.screeps.NaturalEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.screeps.NaturalEffect]
  }
  
  @scala.inline
  def PowerEffect(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): typings.screeps.PowerEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.screeps.PowerEffect]
  }
}
