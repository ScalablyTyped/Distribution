package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedMassAttack extends StObject {
  
  var rangedAttack: typings.screeps.screepsNumbers.`3`
  
  var rangedMassAttack: typings.screeps.screepsNumbers.`3`
}
object RangedMassAttack {
  
  inline def apply(): RangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = 3, rangedMassAttack = 3)
    __obj.asInstanceOf[RangedMassAttack]
  }
  
  extension [Self <: RangedMassAttack](x: Self) {
    
    inline def setRangedAttack(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    inline def setRangedMassAttack(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
