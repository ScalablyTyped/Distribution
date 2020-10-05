package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsInit extends PaymentDetailsBase {
  var id: js.UndefOr[java.lang.String] = js.native
  var total: PaymentItem = js.native
}

object PaymentDetailsInit {
  @scala.inline
  def apply(total: PaymentItem): PaymentDetailsInit = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsInit]
  }
  @scala.inline
  implicit class PaymentDetailsInitOps[Self <: PaymentDetailsInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTotal(value: PaymentItem): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

