package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergySpent extends StObject {
  
  var amount: Double
  
  var energySpent: Double
}
object EnergySpent {
  
  inline def apply(amount: Double, energySpent: Double): EnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergySpent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergySpent] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setEnergySpent(value: Double): Self = StObject.set(x, "energySpent", value.asInstanceOf[js.Any])
  }
}
