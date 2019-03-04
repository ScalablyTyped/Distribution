package typings
package shopifyDashPrimeLib.distModelsRedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The "before" path to be redirected. When the user this path, s/he will be redirected to the path specified by target.
    */
  var path: java.lang.String
  /**
    * The "after" path or URL to be redirected to. When the user visits the path specified by path, s/he will be redirected to this path or URL. This property can be set to any path on the shop's site, or any URL, even one on a completely different domain.
    */
  var target: java.lang.String
}

object Redirect {
  @scala.inline
  def apply(
    path: java.lang.String,
    target: java.lang.String,
    admin_graphql_api_id: java.lang.String = null,
    id: scala.Int | scala.Double = null
  ): Redirect = {
    val __obj = js.Dynamic.literal(path = path, target = target)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

