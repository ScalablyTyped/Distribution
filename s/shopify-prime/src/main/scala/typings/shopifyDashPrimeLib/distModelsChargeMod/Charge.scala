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

