package typings
package atPulumiAwsLib.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteResult extends js.Object {
  val destinationCidrBlock: java.lang.String
  val destinationIpv6CidrBlock: java.lang.String
  val egressOnlyGatewayId: java.lang.String
  val gatewayId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val instanceId: java.lang.String
  val natGatewayId: java.lang.String
  val networkInterfaceId: java.lang.String
  val transitGatewayId: java.lang.String
  val vpcPeeringConnectionId: java.lang.String
}

