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

object TaxLine {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    price: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): TaxLine = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TaxLine]
  }
}

