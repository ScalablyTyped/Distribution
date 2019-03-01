package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountEnergySpentNumber extends js.Object {
  // EVENT_UPGRADE_CONTROLLER
  var amount: scala.Double
  var energySpent: scala.Double
}

object Anon_AmountEnergySpentNumber {
  @scala.inline
  def apply(amount: scala.Double, energySpent: scala.Double): Anon_AmountEnergySpentNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("energySpent")(energySpent)
    __obj.asInstanceOf[Anon_AmountEnergySpentNumber]
  }
}

