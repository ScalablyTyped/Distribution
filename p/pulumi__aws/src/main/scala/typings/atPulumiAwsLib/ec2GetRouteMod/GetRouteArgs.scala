package typings
package atPulumiAwsLib.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteArgs extends js.Object {
  /**
    * The CIDR block of the Route belonging to the Route Table.
    */
  val destinationCidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IPv6 CIDR block of the Route belonging to the Route Table.
    */
  val destinationIpv6CidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Egress Only Gateway ID of the Route belonging to the Route Table.
    */
  val egressOnlyGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Gateway ID of the Route belonging to the Route Table.
    */
  val gatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Instance ID of the Route belonging to the Route Table.
    */
  val instanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The NAT Gateway ID of the Route belonging to the Route Table.
    */
  val natGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Network Interface ID of the Route belonging to the Route Table.
    */
  val networkInterfaceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of the specific Route Table containing the Route entry.
    */
  val routeTableId: java.lang.String
  /**
    * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
    */
  val transitGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The VPC Peering Connection ID of the Route belonging to the Route Table.
    */
  val vpcPeeringConnectionId: js.UndefOr[java.lang.String] = js.undefined
}

