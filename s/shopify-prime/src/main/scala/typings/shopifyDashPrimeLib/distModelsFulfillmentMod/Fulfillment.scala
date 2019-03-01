package typings
package shopifyDashPrimeLib.distModelsFulfillmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fulfillment
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The date and time when the fulfillment was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A historical record of each item in the fulfillment.
    */
  var line_items: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem]] = js.undefined
  /**
    * The unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * A textfield with information about the receipt.
    */
  var receipt: js.UndefOr[js.Any] = js.undefined
  /**
    * The status of the fulfillment. Known values are 'pending', 'open', 'success', 'cancelled',
    * 'error' and 'failure'.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the shipping company.
    */
  var tracking_company: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The shipping number, provided by the shipping company. If multiple tracking numbers
    * exist, returns the first number.
    */
  var tracking_number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of shipping numbers, provided by the shipping company. May be null.
    */
  var tracking_numbers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The tracking url, provided by the shipping company. May be null. If multiple tracking URLs
    * exist, returns the first URL.
    */
  var tracking_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of one or more tracking urls, provided by the shipping company. May be null.
    */
  var tracking_urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The date and time when the fulfillment was last modified.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object Fulfillment {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    line_items: js.Array[shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem] = null,
    order_id: scala.Int | scala.Double = null,
    receipt: js.Any = null,
    status: java.lang.String = null,
    tracking_company: java.lang.String = null,
    tracking_number: java.lang.String = null,
    tracking_numbers: js.Array[java.lang.String] = null,
    tracking_url: java.lang.String = null,
    tracking_urls: js.Array[java.lang.String] = null,
    updated_at: java.lang.String = null
  ): Fulfillment = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (line_items != null) __obj.updateDynamic("line_items")(line_items)
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    if (receipt != null) __obj.updateDynamic("receipt")(receipt)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tracking_company != null) __obj.updateDynamic("tracking_company")(tracking_company)
    if (tracking_number != null) __obj.updateDynamic("tracking_number")(tracking_number)
    if (tracking_numbers != null) __obj.updateDynamic("tracking_numbers")(tracking_numbers)
    if (tracking_url != null) __obj.updateDynamic("tracking_url")(tracking_url)
    if (tracking_urls != null) __obj.updateDynamic("tracking_urls")(tracking_urls)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Fulfillment]
  }
}

