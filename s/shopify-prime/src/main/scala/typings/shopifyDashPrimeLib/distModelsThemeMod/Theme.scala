package typings
package shopifyDashPrimeLib.distModelsThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Theme
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The date and time (ISO 8601 format) when the theme was created.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the theme.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the theme can currently be previewed.
       */
  var previewable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether files are still being copied into place for this theme.
       */
  var processing: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specifies how the theme is being used within the shop. Valid values:
       * * main: The theme is published. Customers see it when they visit the online store.
       * * unpublished: The theme is unpublished. Customers can't see it.
       * * demo: The theme is installed on the store as a demo. The theme can't be published until the merchant buys the full version.
       */
  var role: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.main | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.unpublished | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.demo
  ] = js.undefined
  /**
       * A unique identifier applied to Shopify-made themes that are installed from the Shopify Theme Store Theme Store. Not all themes available in the Theme Store are developed by Shopify. Returns null if the store's theme isn't made by Shopify, or if it wasn't installed from the Theme Store.
       */
  var theme_store_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
       * The date and time ( ISO 8601 format) when the theme was last updated.
       */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

