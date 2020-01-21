package typings.shopifyPrime.productOptionMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductOption extends ShopifyObject {
  /**
    * The name of the option.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The order of the product variant in the list of product variants. 1 is the first position.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * The unique numeric identifier for the product.
    */
  var product_id: js.UndefOr[Double] = js.undefined
  /**
    * The values for the options.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object ProductOption {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    id: Int | Double = null,
    name: String = null,
    position: Int | Double = null,
    product_id: Int | Double = null,
    values: js.Array[String] = null
  ): ProductOption = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductOption]
  }
}

