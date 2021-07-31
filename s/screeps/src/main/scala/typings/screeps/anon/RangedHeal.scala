package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedHeal extends StObject {
  
  var heal: typings.screeps.screepsNumbers.`3`
  
  var rangedHeal: typings.screeps.screepsNumbers.`3`
}
object RangedHeal {
  
  @scala.inline
  def apply(): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = 3, rangedHeal = 3)
    __obj.asInstanceOf[RangedHeal]
  }
  
  @scala.inline
  implicit class RangedHealMutableBuilder[Self <: RangedHeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeal(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
