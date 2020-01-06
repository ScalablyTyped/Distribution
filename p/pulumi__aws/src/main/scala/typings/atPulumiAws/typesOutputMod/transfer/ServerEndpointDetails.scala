package typings.atPulumiAws.typesOutputMod.transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: String = js.native
}

object ServerEndpointDetails {
  @scala.inline
  def apply(vpcEndpointId: String): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerEndpointDetails]
  }
}

