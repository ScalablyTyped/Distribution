package typings.shopifyPrime.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShopifyObject extends js.Object {
  /**
    * To help with migrating from our REST to the GraphQL, REST responses now include the GraphQL Admin API ID field, admin_graphql_api_id,. The ID in this field can be used to query the object directly using the GraphQL Admin API.
    */
  var admin_graphql_api_id: js.UndefOr[String] = js.native
  /**
    * The object's unique id.
    */
  var id: js.UndefOr[Double] = js.native
}

object ShopifyObject {
  @scala.inline
  def apply(): ShopifyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShopifyObject]
  }
  @scala.inline
  implicit class ShopifyObjectOps[Self <: ShopifyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdmin_graphql_api_id(value: String): Self = this.set("admin_graphql_api_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmin_graphql_api_id: Self = this.set("admin_graphql_api_id", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

