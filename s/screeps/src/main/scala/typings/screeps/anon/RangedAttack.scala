package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedAttack extends StObject {
  
  var rangedAttack: typings.screeps.screepsNumbers.`2`
  
  var rangedMassAttack: typings.screeps.screepsNumbers.`2`
}
object RangedAttack {
  
  @scala.inline
  def apply(): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = 2, rangedMassAttack = 2)
    __obj.asInstanceOf[RangedAttack]
  }
  
  @scala.inline
  implicit class RangedAttackMutableBuilder[Self <: RangedAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangedAttack(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedMassAttack(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
