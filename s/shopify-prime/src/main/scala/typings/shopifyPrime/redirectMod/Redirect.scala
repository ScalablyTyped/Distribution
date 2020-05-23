package typings.shopifyPrime.redirectMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends ShopifyObject {
  /**
    * The "before" path to be redirected. When the user this path, s/he will be redirected to the path specified by target.
    */
  var path: String
  /**
    * The "after" path or URL to be redirected to. When the user visits the path specified by path, s/he will be redirected to this path or URL. This property can be set to any path on the shop's site, or any URL, even one on a completely different domain.
    */
  var target: String
}

object Redirect {
  @scala.inline
  def apply(
    path: String,
    target: String,
    admin_graphql_api_id: String = null,
    id: js.UndefOr[Double] = js.undefined
  ): Redirect = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

