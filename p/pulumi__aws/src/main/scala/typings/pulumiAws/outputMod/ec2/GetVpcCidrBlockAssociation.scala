package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcCidrBlockAssociation extends js.Object {
  /**
    * The association ID for the the IPv4 CIDR block.
    */
  var associationId: String = js.native
  /**
    * The cidr block of the desired VPC.
    */
  var cidrBlock: String = js.native
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  var state: String = js.native
}

object GetVpcCidrBlockAssociation {
  @scala.inline
  def apply(associationId: String, cidrBlock: String, state: String): GetVpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcCidrBlockAssociation]
  }
}

