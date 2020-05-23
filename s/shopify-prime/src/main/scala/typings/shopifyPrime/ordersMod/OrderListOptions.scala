package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.financialStatusMod.FinancialStatus
import typings.shopifyPrime.fulfillmentStatusMod.FulfillmentStatus
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.optionsBaseMod.ProcessedOptions
import typings.shopifyPrime.orderStatusMod.OrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderListOptions
  extends ListOptions
     with FieldOptions
     with ProcessedOptions
     with OrderCountOptions {
  /**
    * A comma-separated list of order ids.
    */
  var ids: js.UndefOr[String] = js.undefined
}

object OrderListOptions {
  @scala.inline
  def apply(
    created_at_max: String = null,
    created_at_min: String = null,
    fields: String = null,
    financial_status: FinancialStatus = null,
    fulfillment_status: FulfillmentStatus = null,
    ids: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    processed_at_max: String = null,
    processed_at_min: String = null,
    since_id: js.UndefOr[Double] = js.undefined,
    status: OrderStatus = null,
    updated_at_max: String = null,
    updated_at_min: String = null
  ): OrderListOptions = {
    val __obj = js.Dynamic.literal()
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max.asInstanceOf[js.Any])
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (financial_status != null) __obj.updateDynamic("financial_status")(financial_status.asInstanceOf[js.Any])
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (processed_at_max != null) __obj.updateDynamic("processed_at_max")(processed_at_max.asInstanceOf[js.Any])
    if (processed_at_min != null) __obj.updateDynamic("processed_at_min")(processed_at_min.asInstanceOf[js.Any])
    if (!js.isUndefined(since_id)) __obj.updateDynamic("since_id")(since_id.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max.asInstanceOf[js.Any])
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderListOptions]
  }
}

