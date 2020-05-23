package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnergySpent extends js.Object {
  var amount: Double
  var energySpent: Double
}

object EnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double): EnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergySpent]
  }
}

