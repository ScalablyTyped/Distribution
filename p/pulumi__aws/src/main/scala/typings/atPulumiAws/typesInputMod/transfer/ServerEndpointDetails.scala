package typings.atPulumiAws.typesInputMod.transfer

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: Input[String]
}

object ServerEndpointDetails {
  @scala.inline
  def apply(vpcEndpointId: Input[String]): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerEndpointDetails]
  }
}

