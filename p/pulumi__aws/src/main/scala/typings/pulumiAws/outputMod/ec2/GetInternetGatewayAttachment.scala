package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayAttachment extends js.Object {
  /**
    * The current state of the attachment between the gateway and the VPC. Present only if a VPC is attached
    */
  var state: String = js.native
  /**
    * The ID of an attached VPC.
    */
  var vpcId: String = js.native
}

object GetInternetGatewayAttachment {
  @scala.inline
  def apply(state: String, vpcId: String): GetInternetGatewayAttachment = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayAttachment]
  }
}

