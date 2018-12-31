package typings
package shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCredit
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The amount refunded by the application credit.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The description of the application credit.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States whether or not the application credit is a test transaction. Valid values are true or null.
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
}

