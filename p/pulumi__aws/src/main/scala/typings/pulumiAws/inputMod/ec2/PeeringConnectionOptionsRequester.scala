package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringConnectionOptionsRequester extends StObject {
  
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC. This option is not supported for inter-region VPC peering.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection. This option is not supported for inter-region VPC peering.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.native
}
object PeeringConnectionOptionsRequester {
  
  @scala.inline
  def apply(): PeeringConnectionOptionsRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringConnectionOptionsRequester]
  }
  
  @scala.inline
  implicit class PeeringConnectionOptionsRequesterMutableBuilder[Self <: PeeringConnectionOptionsRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClassicLinkToRemoteVpc(value: Input[Boolean]): Self = StObject.set(x, "allowClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClassicLinkToRemoteVpcUndefined: Self = StObject.set(x, "allowClassicLinkToRemoteVpc", js.undefined)
    
    @scala.inline
    def setAllowRemoteVpcDnsResolution(value: Input[Boolean]): Self = StObject.set(x, "allowRemoteVpcDnsResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemoteVpcDnsResolutionUndefined: Self = StObject.set(x, "allowRemoteVpcDnsResolution", js.undefined)
    
    @scala.inline
    def setAllowVpcToRemoteClassicLink(value: Input[Boolean]): Self = StObject.set(x, "allowVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowVpcToRemoteClassicLinkUndefined: Self = StObject.set(x, "allowVpcToRemoteClassicLink", js.undefined)
  }
}
