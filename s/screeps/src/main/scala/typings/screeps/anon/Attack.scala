package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attack extends StObject {
  
  var attack: typings.screeps.screepsInts.`2`
}
object Attack {
  
  inline def apply(): Attack = {
    val __obj = js.Dynamic.literal(attack = 2)
    __obj.asInstanceOf[Attack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attack] (val x: Self) extends AnyVal {
    
    inline def setAttack(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
