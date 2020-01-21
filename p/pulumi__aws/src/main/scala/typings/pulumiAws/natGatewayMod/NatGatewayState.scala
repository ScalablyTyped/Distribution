package typings.pulumiAws.natGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatGatewayState extends js.Object {
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: js.UndefOr[Input[String]] = js.native
  /**
    * The ENI ID of the network interface created by the NAT gateway.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The private IP address of the NAT Gateway.
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address of the NAT Gateway.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object NatGatewayState {
  @scala.inline
  def apply(
    allocationId: Input[String] = null,
    networkInterfaceId: Input[String] = null,
    privateIp: Input[String] = null,
    publicIp: Input[String] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): NatGatewayState = {
    val __obj = js.Dynamic.literal()
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatGatewayState]
  }
}

