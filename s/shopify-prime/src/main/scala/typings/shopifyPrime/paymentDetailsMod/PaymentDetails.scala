package typings.shopifyPrime.paymentDetailsMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentDetails extends ShopifyObject {
  var avs_result_code: js.UndefOr[String] = js.native
  var credit_card_bin: js.UndefOr[String] = js.native
  var credit_card_company: js.UndefOr[String] = js.native
  var credit_card_number: js.UndefOr[String] = js.native
  var cvv_result_code: js.UndefOr[String] = js.native
}

object PaymentDetails {
  @scala.inline
  def apply(): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetails]
  }
  @scala.inline
  implicit class PaymentDetailsOps[Self <: PaymentDetails] (val x: Self) extends AnyVal {
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
    def setAvs_result_code(value: String): Self = this.set("avs_result_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvs_result_code: Self = this.set("avs_result_code", js.undefined)
    @scala.inline
    def setCredit_card_bin(value: String): Self = this.set("credit_card_bin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit_card_bin: Self = this.set("credit_card_bin", js.undefined)
    @scala.inline
    def setCredit_card_company(value: String): Self = this.set("credit_card_company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit_card_company: Self = this.set("credit_card_company", js.undefined)
    @scala.inline
    def setCredit_card_number(value: String): Self = this.set("credit_card_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit_card_number: Self = this.set("credit_card_number", js.undefined)
    @scala.inline
    def setCvv_result_code(value: String): Self = this.set("cvv_result_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCvv_result_code: Self = this.set("cvv_result_code", js.undefined)
  }
  
}

