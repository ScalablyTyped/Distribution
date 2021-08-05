package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectionAccepterAccepter extends StObject {
  
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}
object VpcPeeringConnectionAccepterAccepter {
  
  inline def apply(): VpcPeeringConnectionAccepterAccepter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterAccepter]
  }
  
  extension [Self <: VpcPeeringConnectionAccepterAccepter](x: Self) {
    
    inline def setAllowClassicLinkToRemoteVpc(value: Boolean): Self = StObject.set(x, "allowClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowClassicLinkToRemoteVpcUndefined: Self = StObject.set(x, "allowClassicLinkToRemoteVpc", js.undefined)
    
    inline def setAllowRemoteVpcDnsResolution(value: Boolean): Self = StObject.set(x, "allowRemoteVpcDnsResolution", value.asInstanceOf[js.Any])
    
    inline def setAllowRemoteVpcDnsResolutionUndefined: Self = StObject.set(x, "allowRemoteVpcDnsResolution", js.undefined)
    
    inline def setAllowVpcToRemoteClassicLink(value: Boolean): Self = StObject.set(x, "allowVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    
    inline def setAllowVpcToRemoteClassicLinkUndefined: Self = StObject.set(x, "allowVpcToRemoteClassicLink", js.undefined)
  }
}
