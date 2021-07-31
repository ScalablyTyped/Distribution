package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KHO2 extends StObject {
  
  var KHO2: RangedMassAttack
  
  var KO: RangedAttack
  
  var XKHO2: RangedAttackRangedMassAttack
}
object KHO2 {
  
  @scala.inline
  def apply(KHO2: RangedMassAttack, KO: RangedAttack, XKHO2: RangedAttackRangedMassAttack): KHO2 = {
    val __obj = js.Dynamic.literal(KHO2 = KHO2.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], XKHO2 = XKHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHO2]
  }
  
  @scala.inline
  implicit class KHO2MutableBuilder[Self <: KHO2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKHO2(value: RangedMassAttack): Self = StObject.set(x, "KHO2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKO(value: RangedAttack): Self = StObject.set(x, "KO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXKHO2(value: RangedAttackRangedMassAttack): Self = StObject.set(x, "XKHO2", value.asInstanceOf[js.Any])
  }
}
