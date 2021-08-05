package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetId extends StObject {
  
  var amount: Double
  
  var targetId: String
}
object TargetId {
  
  inline def apply(amount: Double, targetId: String): TargetId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetId]
  }
  
  extension [Self <: TargetId](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
