package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayAttachment extends js.Object {
  /**
    * The current state of the attachment between the gateway and the VPC. Present only if a VPC is attached
    */
  var state: String
  /**
    * The ID of an attached VPC.
    */
  var vpcId: String
}

object GetInternetGatewayAttachment {
  @scala.inline
  def apply(state: String, vpcId: String): GetInternetGatewayAttachment = {
    val __obj = js.Dynamic.literal(state = state, vpcId = vpcId)
  
    __obj.asInstanceOf[GetInternetGatewayAttachment]
  }
}

