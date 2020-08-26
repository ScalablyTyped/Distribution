package typings.pulumiAws.getGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayResult extends js.Object {
  /**
    * The ASN on the Amazon side of the connection.
    */
  val amazonSideAsn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: String = js.native
}

object GetGatewayResult {
  @scala.inline
  def apply(amazonSideAsn: String, id: String, name: String, ownerAccountId: String): GetGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerAccountId = ownerAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayResult]
  }
  @scala.inline
  implicit class GetGatewayResultOps[Self <: GetGatewayResult] (val x: Self) extends AnyVal {
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
    def setAmazonSideAsn(value: String): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAccountId(value: String): Self = this.set("ownerAccountId", value.asInstanceOf[js.Any])
  }
  
}

