package typings
package shopifyDashPrimeLib.distModelsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShopifyObject extends js.Object {
  /**
    * To help with migrating from our REST to the GraphQL, REST responses now include the GraphQL Admin API ID field, admin_graphql_api_id,. The ID in this field can be used to query the object directly using the GraphQL Admin API.
    */
  var admin_graphql_api_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The object's unique id.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
}

object ShopifyObject {
  @scala.inline
  def apply(admin_graphql_api_id: java.lang.String = null, id: scala.Int | scala.Double = null): ShopifyObject = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShopifyObject]
  }
}

