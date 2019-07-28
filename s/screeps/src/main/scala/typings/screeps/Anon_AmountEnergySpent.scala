package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountEnergySpent extends js.Object {
  var amount: Double
  var energySpent: Double
  // EVENT_REPAIR
  var targetId: String
}

object Anon_AmountEnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double, targetId: String): Anon_AmountEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount, energySpent = energySpent, targetId = targetId)
  
    __obj.asInstanceOf[Anon_AmountEnergySpent]
  }
}

