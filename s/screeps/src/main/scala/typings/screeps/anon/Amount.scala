package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var amount: Double = js.native
  var energySpent: Double = js.native
  var targetId: String = js.native
}

object Amount {
  @scala.inline
  def apply(amount: Double, energySpent: Double, targetId: String): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

