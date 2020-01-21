package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountEnergySpentNumber extends js.Object {
  var amount: Double
  var energySpent: Double
}

object AnonAmountEnergySpentNumber {
  @scala.inline
  def apply(amount: Double, energySpent: Double): AnonAmountEnergySpentNumber = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountEnergySpentNumber]
  }
}

