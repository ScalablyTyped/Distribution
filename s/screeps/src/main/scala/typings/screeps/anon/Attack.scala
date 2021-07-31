package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attack extends StObject {
  
  var attack: typings.screeps.screepsNumbers.`2`
}
object Attack {
  
  @scala.inline
  def apply(): Attack = {
    val __obj = js.Dynamic.literal(attack = 2)
    __obj.asInstanceOf[Attack]
  }
  
  @scala.inline
  implicit class AttackMutableBuilder[Self <: Attack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttack(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
