package typings.shopifyDashPrime.distModelsChargeMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.shopifyDashPrimeStrings.accepted
import typings.shopifyDashPrime.shopifyDashPrimeStrings.active
import typings.shopifyDashPrime.shopifyDashPrimeStrings.cancelled
import typings.shopifyDashPrime.shopifyDashPrimeStrings.declined
import typings.shopifyDashPrime.shopifyDashPrimeStrings.expired
import typings.shopifyDashPrime.shopifyDashPrimeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge extends ShopifyObject {
  /**
    * The URL that the customer should be sent to, to accept or decline the application charge.
    */
  var confirmation_url: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the application charge was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The name of the application charge, e.g. "Super Expensive One-time Charge".
    */
  var name: String
  /**
    * The price of the application charge. Note: Shopify returns this value as a string.
    */
  var price: js.UndefOr[String | Double] = js.undefined
  /**
    * The URL the customer is sent to once they accept/decline a charge.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * The status of the charge.
    */
  var status: js.UndefOr[pending | accepted | active | cancelled | declined | expired] = js.undefined
  /**
    * Whether or not the application charge is a test transaction.
    */
  var test: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the recurring application charge was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
}

object Charge {
  @scala.inline
  def apply(
    name: String,
    admin_graphql_api_id: String = null,
    confirmation_url: String = null,
    created_at: String = null,
    id: Int | Double = null,
    price: String | Double = null,
    return_url: String = null,
    status: pending | accepted | active | cancelled | declined | expired = null,
    test: js.UndefOr[Boolean] = js.undefined,
    updated_at: String = null
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

