package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Damage extends StObject {
  
  var damage: `0.7` = js.native
}
object Damage {
  
  @scala.inline
  def apply(damage: `0.7`): Damage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damage]
  }
  
  @scala.inline
  implicit class DamageMutableBuilder[Self <: Damage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamage(value: `0.7`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
