package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangedAttackRangedMassAttack extends StObject {
  
  var rangedAttack: typings.screeps.screepsNumbers.`4` = js.native
  
  var rangedMassAttack: typings.screeps.screepsNumbers.`4` = js.native
}
object RangedAttackRangedMassAttack {
  
  @scala.inline
  def apply(
    rangedAttack: typings.screeps.screepsNumbers.`4`,
    rangedMassAttack: typings.screeps.screepsNumbers.`4`
  ): RangedAttackRangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttackRangedMassAttack]
  }
  
  @scala.inline
  implicit class RangedAttackRangedMassAttackMutableBuilder[Self <: RangedAttackRangedMassAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangedAttack(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedMassAttack(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
