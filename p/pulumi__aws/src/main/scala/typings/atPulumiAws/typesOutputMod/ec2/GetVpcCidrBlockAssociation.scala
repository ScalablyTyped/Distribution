package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcCidrBlockAssociation extends js.Object {
  /**
    * The association ID for the the IPv4 CIDR block.
    */
  var associationId: String
  /**
    * The cidr block of the desired VPC.
    */
  var cidrBlock: String
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  var state: String
}

object GetVpcCidrBlockAssociation {
  @scala.inline
  def apply(associationId: String, cidrBlock: String, state: String): GetVpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal(associationId = associationId, cidrBlock = cidrBlock, state = state)
  
    __obj.asInstanceOf[GetVpcCidrBlockAssociation]
  }
}

