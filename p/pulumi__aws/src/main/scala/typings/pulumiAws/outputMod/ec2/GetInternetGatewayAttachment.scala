package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInternetGatewayAttachment extends StObject {
  
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
  
  @scala.inline
  implicit class GetInternetGatewayAttachmentMutableBuilder[Self <: GetInternetGatewayAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
