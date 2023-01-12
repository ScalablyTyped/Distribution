package typings.screeps.anon

import typings.screeps.EventHealType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealType extends StObject {
  
  var amount: Double
  
  var healType: EventHealType
  
  var targetId: String
}
object HealType {
  
  inline def apply(amount: Double, healType: EventHealType, targetId: String): HealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealType] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setHealType(value: EventHealType): Self = StObject.set(x, "healType", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
