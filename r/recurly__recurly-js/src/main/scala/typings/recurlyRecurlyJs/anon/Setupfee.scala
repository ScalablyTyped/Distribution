package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setupfee extends js.Object {
  var setup_fee: String = js.native
  var unit: String = js.native
}

object Setupfee {
  @scala.inline
  def apply(setup_fee: String, unit: String): Setupfee = {
    val __obj = js.Dynamic.literal(setup_fee = setup_fee.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setupfee]
  }
  @scala.inline
  implicit class SetupfeeOps[Self <: Setupfee] (val x: Self) extends AnyVal {
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
    def setSetup_fee(value: String): Self = this.set("setup_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

