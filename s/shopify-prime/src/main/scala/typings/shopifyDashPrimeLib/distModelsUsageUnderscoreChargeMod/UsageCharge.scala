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

