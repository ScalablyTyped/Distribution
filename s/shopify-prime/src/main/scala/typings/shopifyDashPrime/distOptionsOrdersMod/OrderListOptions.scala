package typings.shopifyDashPrime.distOptionsOrdersMod

import typings.shopifyDashPrime.distEnumsFinancialUnderscoreStatusMod.FinancialStatus
import typings.shopifyDashPrime.distEnumsFulfillmentUnderscoreStatusMod.FulfillmentStatus
import typings.shopifyDashPrime.distEnumsOrderUnderscoreStatusMod.OrderStatus
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distOptionsBaseMod.ProcessedOptions
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
    limit: Int | Double = null,
    page: Int | Double = null,
    processed_at_max: String = null,
    processed_at_min: String = null,
    since_id: Int | Double = null,
    status: OrderStatus = null,
    updated_at_max: String = null,
    updated_at_min: String = null
  ): OrderListOptions = {
    val __obj = js.Dynamic.literal()
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max)
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (financial_status != null) __obj.updateDynamic("financial_status")(financial_status.asInstanceOf[js.Any])
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (processed_at_max != null) __obj.updateDynamic("processed_at_max")(processed_at_max)
    if (processed_at_min != null) __obj.updateDynamic("processed_at_min")(processed_at_min)
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max)
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min)
    __obj.asInstanceOf[OrderListOptions]
  }
}

