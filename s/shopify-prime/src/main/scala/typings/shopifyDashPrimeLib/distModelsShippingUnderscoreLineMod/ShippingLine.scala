package typings
package shopifyDashPrimeLib.distModelsShippingUnderscoreLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShippingLine
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * A reference to the shipping method.
       */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The price of this shipping method.
       */
  var price: js.UndefOr[scala.Double] = js.undefined
  /**
       * The source of the shipping method.
       */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A list of <see cref="ShopifyTaxLine"/> objects, each of which details the taxes applicable to this <see cref="ShopifyShippingLine"/>.
       */
  var tax_lines: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine]] = js.undefined
  /**
       * The title of the shipping method.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

