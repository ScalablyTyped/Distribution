package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectionAccepter extends StObject {
  
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC. This is
    * [not supported](https://docs.aws.amazon.com/vpc/latest/peering/modify-peering-connections.html) for
    * inter-region VPC peering.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.undefined
}
object VpcPeeringConnectionAccepter {
  
  inline def apply(): VpcPeeringConnectionAccepter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepter]
  }
  
  extension [Self <: VpcPeeringConnectionAccepter](x: Self) {
    
    inline def setAllowClassicLinkToRemoteVpc(value: Input[Boolean]): Self = StObject.set(x, "allowClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowClassicLinkToRemoteVpcUndefined: Self = StObject.set(x, "allowClassicLinkToRemoteVpc", js.undefined)
    
    inline def setAllowRemoteVpcDnsResolution(value: Input[Boolean]): Self = StObject.set(x, "allowRemoteVpcDnsResolution", value.asInstanceOf[js.Any])
    
    inline def setAllowRemoteVpcDnsResolutionUndefined: Self = StObject.set(x, "allowRemoteVpcDnsResolution", js.undefined)
    
    inline def setAllowVpcToRemoteClassicLink(value: Input[Boolean]): Self = StObject.set(x, "allowVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    
    inline def setAllowVpcToRemoteClassicLinkUndefined: Self = StObject.set(x, "allowVpcToRemoteClassicLink", js.undefined)
  }
}
