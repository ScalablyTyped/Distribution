package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductOption
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The name of the option.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The order of the product variant in the list of product variants. 1 is the first position.
       */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
       * The unique numeric identifier for the product.
       */
  var product_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * The values for the options.
       */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

