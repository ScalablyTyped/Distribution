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

