package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.financialStatusMod.FinancialStatus
import typings.shopifyPrime.fulfillmentStatusMod.FulfillmentStatus
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.orderStatusMod.OrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCountOptions extends DateOptions {
  var financial_status: js.UndefOr[FinancialStatus] = js.native
  var fulfillment_status: js.UndefOr[FulfillmentStatus] = js.native
  var status: js.UndefOr[OrderStatus] = js.native
}

object OrderCountOptions {
  @scala.inline
  def apply(): OrderCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCountOptions]
  }
  @scala.inline
  implicit class OrderCountOptionsOps[Self <: OrderCountOptions] (val x: Self) extends AnyVal {
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
    def setFinancial_status(value: FinancialStatus): Self = this.set("financial_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinancial_status: Self = this.set("financial_status", js.undefined)
    @scala.inline
    def setFulfillment_status(value: FulfillmentStatus): Self = this.set("fulfillment_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillment_status: Self = this.set("fulfillment_status", js.undefined)
    @scala.inline
    def setStatus(value: OrderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

