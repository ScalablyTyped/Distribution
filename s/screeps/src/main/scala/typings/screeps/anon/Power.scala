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
  
  @scala.inline
  def apply(power: PowerConstant, targetId: String): Power = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Power]
  }
  
  @scala.inline
  implicit class PowerMutableBuilder[Self <: Power] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPower(value: PowerConstant): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
