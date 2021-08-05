package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  var amount: Double
  
  var components: RecordDepositConstantComm
  
  var cooldown: Double
  
  var level: js.UndefOr[Double] = js.undefined
}
object Components {
  
  inline def apply(amount: Double, components: RecordDepositConstantComm, cooldown: Double): Components = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: RecordDepositConstantComm): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
