package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcCidrBlockAssociation extends StObject {
  
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
    val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcCidrBlockAssociation]
  }
  
  @scala.inline
  implicit class GetVpcCidrBlockAssociationMutableBuilder[Self <: GetVpcCidrBlockAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
