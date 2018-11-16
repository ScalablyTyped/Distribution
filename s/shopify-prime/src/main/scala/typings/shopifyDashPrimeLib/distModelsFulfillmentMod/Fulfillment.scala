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

