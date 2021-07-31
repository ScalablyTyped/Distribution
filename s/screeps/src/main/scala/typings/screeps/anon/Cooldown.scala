package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cooldown extends StObject {
  
  /**
    * Cooldown ticks remaining, or undefined if the power creep is not spawned in the world.
    */
  var cooldown: js.UndefOr[Double] = js.undefined
  
  /**
    * Current level of the power
    */
  var level: Double
}
object Cooldown {
  
  @scala.inline
  def apply(level: Double): Cooldown = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooldown]
  }
  
  @scala.inline
  implicit class CooldownMutableBuilder[Self <: Cooldown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownUndefined: Self = StObject.set(x, "cooldown", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
