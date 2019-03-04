package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountEnergySpent extends js.Object {
  var amount: scala.Double
  var energySpent: scala.Double
  // EVENT_REPAIR
  var targetId: java.lang.String
}

object Anon_AmountEnergySpent {
  @scala.inline
  def apply(amount: scala.Double, energySpent: scala.Double, targetId: java.lang.String): Anon_AmountEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount, energySpent = energySpent, targetId = targetId)
  
    __obj.asInstanceOf[Anon_AmountEnergySpent]
  }
}

