package typings.atPulumiAws.typesOutputMod.transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: String
}

object ServerEndpointDetails {
  @scala.inline
  def apply(vpcEndpointId: String): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId)
  
    __obj.asInstanceOf[ServerEndpointDetails]
  }
}

