package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectionAccepterRequester extends StObject {
  
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.undefined
}
object VpcPeeringConnectionAccepterRequester {
  
  @scala.inline
  def apply(): VpcPeeringConnectionAccepterRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterRequester]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionAccepterRequesterMutableBuilder[Self <: VpcPeeringConnectionAccepterRequester] (val x: Self) extends AnyVal {
    
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
