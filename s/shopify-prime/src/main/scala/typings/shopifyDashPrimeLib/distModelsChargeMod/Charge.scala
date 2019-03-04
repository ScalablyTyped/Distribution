package typings
package shopifyDashPrimeLib.distModelsChargeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The URL that the customer should be sent to, to accept or decline the application charge.
    */
  var confirmation_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the application charge was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the application charge, e.g. "Super Expensive One-time Charge".
    */
  var name: java.lang.String
  /**
    * The price of the application charge. Note: Shopify returns this value as a string.
    */
  var price: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The URL the customer is sent to once they accept/decline a charge.
    */
  var return_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the charge.
    */
  var status: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.pending | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.accepted | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.active | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.cancelled | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.declined | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.expired
  ] = js.undefined
  /**
    * Whether or not the application charge is a test transaction.
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The date and time when the recurring application charge was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object Charge {
  @scala.inline
  def apply(
    name: java.lang.String,
    admin_graphql_api_id: java.lang.String = null,
    confirmation_url: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    price: java.lang.String | scala.Double = null,
    return_url: java.lang.String = null,
    status: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.pending | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.accepted | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.active | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.cancelled | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.declined | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.expired = null,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    updated_at: java.lang.String = null
  ): Charge = {
    val __obj = js.Dynamic.literal(name = name)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (confirmation_url != null) __obj.updateDynamic("confirmation_url")(confirmation_url)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Charge]
  }
}

