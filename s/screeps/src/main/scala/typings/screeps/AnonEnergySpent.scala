package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnergySpent extends js.Object {
  var amount: Double
  var energySpent: Double
  var targetId: String
}

object AnonEnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double, targetId: String): AnonEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnergySpent]
  }
}

