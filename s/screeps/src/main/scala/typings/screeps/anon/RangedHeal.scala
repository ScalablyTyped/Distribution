package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedHeal extends StObject {
  
  var heal: typings.screeps.screepsInts.`3`
  
  var rangedHeal: typings.screeps.screepsInts.`3`
}
object RangedHeal {
  
  inline def apply(): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = 3, rangedHeal = 3)
    __obj.asInstanceOf[RangedHeal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangedHeal] (val x: Self) extends AnyVal {
    
    inline def setHeal(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    inline def setRangedHeal(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
