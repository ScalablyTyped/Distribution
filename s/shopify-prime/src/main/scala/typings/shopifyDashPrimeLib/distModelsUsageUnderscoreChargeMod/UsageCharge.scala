package typings
package shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageCharge
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The date and time when the usage charge was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name or description of the usage charge.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The price of the usage charge.
    */
  var price: js.UndefOr[scala.Double] = js.undefined
  /**
    * The recurring application charge the usage charge belongs to.
    */
  var recurring_application_charge_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The date and time when the usage charge was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object UsageCharge {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    description: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    price: scala.Int | scala.Double = null,
    recurring_application_charge_id: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null
  ): UsageCharge = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (recurring_application_charge_id != null) __obj.updateDynamic("recurring_application_charge_id")(recurring_application_charge_id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[UsageCharge]
  }
}

