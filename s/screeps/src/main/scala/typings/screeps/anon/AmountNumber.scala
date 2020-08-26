package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmountNumber extends js.Object {
  var amount: Double = js.native
}

object AmountNumber {
  @scala.inline
  def apply(amount: Double): AmountNumber = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountNumber]
  }
  @scala.inline
  implicit class AmountNumberOps[Self <: AmountNumber] (val x: Self) extends AnyVal {
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
  }
  
}

