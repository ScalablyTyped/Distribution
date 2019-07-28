package typings.atPulumiAws.ec2RouteMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteState extends js.Object {
  /**
    * The destination CIDR block.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
  /**
    * The destination IPv6 CIDR block.
    */
  val destinationIpv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
  val destinationPrefixListId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  val egressOnlyGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of an EC2 instance.
    */
  val instanceId: js.UndefOr[Input[String]] = js.undefined
  val instanceOwnerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of a VPC NAT gateway.
    */
  val natGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of an EC2 network interface.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
  val origin: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the routing table.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.undefined
  val state: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of a VPC peering connection.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.undefined
}

object RouteState {
  @scala.inline
  def apply(
    destinationCidrBlock: Input[String] = null,
    destinationIpv6CidrBlock: Input[String] = null,
    destinationPrefixListId: Input[String] = null,
    egressOnlyGatewayId: Input[String] = null,
    gatewayId: Input[String] = null,
    instanceId: Input[String] = null,
    instanceOwnerId: Input[String] = null,
    natGatewayId: Input[String] = null,
    networkInterfaceId: Input[String] = null,
    origin: Input[String] = null,
    routeTableId: Input[String] = null,
    state: Input[String] = null,
    transitGatewayId: Input[String] = null,
    vpcPeeringConnectionId: Input[String] = null
  ): RouteState = {
    val __obj = js.Dynamic.literal()
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (destinationIpv6CidrBlock != null) __obj.updateDynamic("destinationIpv6CidrBlock")(destinationIpv6CidrBlock.asInstanceOf[js.Any])
    if (destinationPrefixListId != null) __obj.updateDynamic("destinationPrefixListId")(destinationPrefixListId.asInstanceOf[js.Any])
    if (egressOnlyGatewayId != null) __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (instanceOwnerId != null) __obj.updateDynamic("instanceOwnerId")(instanceOwnerId.asInstanceOf[js.Any])
    if (natGatewayId != null) __obj.updateDynamic("natGatewayId")(natGatewayId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteState]
  }
}

