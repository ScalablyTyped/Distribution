package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealRangedHeal extends StObject {
  
  var heal: typings.screeps.screepsNumbers.`4` = js.native
  
  var rangedHeal: typings.screeps.screepsNumbers.`4` = js.native
}
object HealRangedHeal {
  
  @scala.inline
  def apply(heal: typings.screeps.screepsNumbers.`4`, rangedHeal: typings.screeps.screepsNumbers.`4`): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealRangedHeal]
  }
  
  @scala.inline
  implicit class HealRangedHealMutableBuilder[Self <: HealRangedHeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeal(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
