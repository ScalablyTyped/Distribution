package typings.pulumiAws.ec2clientvpnRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteArgs extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Input[String] = js.native
  /**
    * A brief description of the authorization rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  val destinationCidrBlock: Input[String] = js.native
  /**
    * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
    */
  val targetVpcSubnetId: Input[String] = js.native
}

object RouteArgs {
  @scala.inline
  def apply(
    clientVpnEndpointId: Input[String],
    destinationCidrBlock: Input[String],
    targetVpcSubnetId: Input[String]
  ): RouteArgs = {
    val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], targetVpcSubnetId = targetVpcSubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
  @scala.inline
  implicit class RouteArgsOps[Self <: RouteArgs] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVpcSubnetId(value: Input[String]): Self = this.set("targetVpcSubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

