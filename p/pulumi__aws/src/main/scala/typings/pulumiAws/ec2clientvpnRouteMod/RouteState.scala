package typings.pulumiAws.ec2clientvpnRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteState extends js.Object {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A brief description of the authorization rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
    */
  val origin: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
    */
  val targetVpcSubnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of the route.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object RouteState {
  
  @scala.inline
  def apply(): RouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteState]
  }
  
  @scala.inline
  implicit class RouteStateOps[Self <: RouteState] (val x: Self) extends AnyVal {
    
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
    def setClientVpnEndpointId(value: Input[String]): Self = this.set("clientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("clientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    
    @scala.inline
    def setOrigin(value: Input[String]): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setTargetVpcSubnetId(value: Input[String]): Self = this.set("targetVpcSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVpcSubnetId: Self = this.set("targetVpcSubnetId", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
