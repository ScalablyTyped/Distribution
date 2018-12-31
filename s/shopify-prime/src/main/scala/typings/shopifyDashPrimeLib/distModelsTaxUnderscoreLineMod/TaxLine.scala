package typings
package shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxLine
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The amount of tax to be charged.
    */
  var price: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rate of tax to be applied.
    */
  var rate: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the tax.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

