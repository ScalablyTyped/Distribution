package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.financialStatusMod.FinancialStatus
import typings.shopifyPrime.fulfillmentStatusMod.FulfillmentStatus
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.orderStatusMod.OrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCountOptions extends DateOptions {
  var financial_status: js.UndefOr[FinancialStatus] = js.undefined
  var fulfillment_status: js.UndefOr[FulfillmentStatus] = js.undefined
  var status: js.UndefOr[OrderStatus] = js.undefined
}

object OrderCountOptions {
  @scala.inline
  def apply(
    created_at_max: String = null,
    created_at_min: String = null,
    financial_status: FinancialStatus = null,
    fulfillment_status: FulfillmentStatus = null,
    status: OrderStatus = null,
    updated_at_max: String = null,
    updated_at_min: String = null
  ): OrderCountOptions = {
    val __obj = js.Dynamic.literal()
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max.asInstanceOf[js.Any])
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min.asInstanceOf[js.Any])
    if (financial_status != null) __obj.updateDynamic("financial_status")(financial_status.asInstanceOf[js.Any])
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max.asInstanceOf[js.Any])
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCountOptions]
  }
}

