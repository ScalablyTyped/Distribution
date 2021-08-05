package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LHO2 extends StObject {
  
  var LHO2: RangedHeal
  
  var LO: Heal
  
  var XLHO2: HealRangedHeal
}
object LHO2 {
  
  inline def apply(LHO2: RangedHeal, LO: Heal, XLHO2: HealRangedHeal): LHO2 = {
    val __obj = js.Dynamic.literal(LHO2 = LHO2.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], XLHO2 = XLHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LHO2]
  }
  
  extension [Self <: LHO2](x: Self) {
    
    inline def setLHO2(value: RangedHeal): Self = StObject.set(x, "LHO2", value.asInstanceOf[js.Any])
    
    inline def setLO(value: Heal): Self = StObject.set(x, "LO", value.asInstanceOf[js.Any])
    
    inline def setXLHO2(value: HealRangedHeal): Self = StObject.set(x, "XLHO2", value.asInstanceOf[js.Any])
  }
}
