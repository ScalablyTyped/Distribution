package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnergySpent extends js.Object {
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
  implicit class EnergySpentOps[Self <: EnergySpent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnergySpent(value: Double): Self = this.set("energySpent", value.asInstanceOf[js.Any])
  }
  
}

