package typings
package shopifyDashPrimeLib.distOptionsOrdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderListOptions
  extends shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.ProcessedOptions
     with OrderCountOptions {
  /**
    * A comma-separated list of order ids.
    */
  var ids: js.UndefOr[java.lang.String] = js.undefined
}

object OrderListOptions {
  @scala.inline
  def apply(
    created_at_max: java.lang.String = null,
    created_at_min: java.lang.String = null,
    fields: java.lang.String = null,
    financial_status: shopifyDashPrimeLib.distEnumsFinancialUnderscoreStatusMod.FinancialStatus = null,
    fulfillment_status: shopifyDashPrimeLib.distEnumsFulfillmentUnderscoreStatusMod.FulfillmentStatus = null,
    ids: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    processed_at_max: java.lang.String = null,
    processed_at_min: java.lang.String = null,
    since_id: scala.Int | scala.Double = null,
    status: shopifyDashPrimeLib.distEnumsOrderUnderscoreStatusMod.OrderStatus = null,
    updated_at_max: java.lang.String = null,
    updated_at_min: java.lang.String = null
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

