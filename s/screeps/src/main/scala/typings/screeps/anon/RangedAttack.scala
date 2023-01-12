package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedAttack extends StObject {
  
  var rangedAttack: typings.screeps.screepsInts.`2`
  
  var rangedMassAttack: typings.screeps.screepsInts.`2`
}
object RangedAttack {
  
  inline def apply(): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = 2, rangedMassAttack = 2)
    __obj.asInstanceOf[RangedAttack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangedAttack] (val x: Self) extends AnyVal {
    
    inline def setRangedAttack(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    inline def setRangedMassAttack(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
