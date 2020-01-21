package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountEnergySpent extends js.Object {
  var amount: Double
  var energySpent: Double
  var targetId: String
}

object AnonAmountEnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double, targetId: String): AnonAmountEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountEnergySpent]
  }
}

