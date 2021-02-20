package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnergySpent extends StObject {
  
  var amount: Double = js.native
  
  var energySpent: Double = js.native
}
object EnergySpent {
  
  @scala.inline
  def apply(amount: Double, energySpent: Double): EnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergySpent]
  }
  
  @scala.inline
  implicit class EnergySpentMutableBuilder[Self <: EnergySpent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergySpent(value: Double): Self = StObject.set(x, "energySpent", value.asInstanceOf[js.Any])
  }
}
