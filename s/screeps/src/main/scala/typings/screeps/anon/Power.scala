package typings.screeps.anon

import typings.screeps.PowerConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Power extends StObject {
  
  var power: PowerConstant
  
  var targetId: String
}
object Power {
  
  inline def apply(power: PowerConstant, targetId: String): Power = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Power]
  }
  
  extension [Self <: Power](x: Self) {
    
    inline def setPower(value: PowerConstant): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
