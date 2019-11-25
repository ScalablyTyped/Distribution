package typings.shopifyDashPrime.distModelsUsageUnderscoreChargeMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageCharge extends ShopifyObject {
  /**
    * The date and time when the usage charge was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The name or description of the usage charge.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The price of the usage charge.
    */
  var price: js.UndefOr[Double] = js.undefined
  /**
    * The recurring application charge the usage charge belongs to.
    */
  var recurring_application_charge_id: js.UndefOr[Double] = js.undefined
  /**
    * The date and time when the usage charge was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
}

object UsageCharge {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    created_at: String = null,
    description: String = null,
    id: Int | Double = null,
    price: Int | Double = null,
    recurring_application_charge_id: Int | Double = null,
    updated_at: String = null
  ): UsageCharge = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (recurring_application_charge_id != null) __obj.updateDynamic("recurring_application_charge_id")(recurring_application_charge_id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageCharge]
  }
}

