package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealRangedHeal extends StObject {
  
  var heal: typings.screeps.screepsInts.`4`
  
  var rangedHeal: typings.screeps.screepsInts.`4`
}
object HealRangedHeal {
  
  inline def apply(): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = 4, rangedHeal = 4)
    __obj.asInstanceOf[HealRangedHeal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealRangedHeal] (val x: Self) extends AnyVal {
    
    inline def setHeal(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    inline def setRangedHeal(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
