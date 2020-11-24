package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetVpcCidrBlockAssociationOps[Self <: GetVpcCidrBlockAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: String): Self = this.set("associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
