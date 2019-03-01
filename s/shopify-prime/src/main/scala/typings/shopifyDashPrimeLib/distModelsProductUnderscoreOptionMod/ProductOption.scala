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

object ProductOption {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    product_id: scala.Int | scala.Double = null,
    values: js.Array[java.lang.String] = null
  ): ProductOption = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ProductOption]
  }
}

