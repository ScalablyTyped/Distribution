package typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxLine extends ShopifyObject {
  /**
    * The amount of tax to be charged.
    */
  var price: js.UndefOr[Double] = js.undefined
  /**
    * The rate of tax to be applied.
    */
  var rate: js.UndefOr[Double] = js.undefined
  /**
    * The name of the tax.
    */
  var title: js.UndefOr[String] = js.undefined
}

object TaxLine {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    id: Int | Double = null,
    price: Int | Double = null,
    rate: Int | Double = null,
    title: String = null
  ): TaxLine = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxLine]
  }
}

