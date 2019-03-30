package typings
package atPulumiAwsLib.route53ResolverEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverEndpointState extends js.Object {
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IpIpId]]]
  ] = js.undefined
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ResolverEndpointState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    direction: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hostVpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipAddresses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IpIpId]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ResolverEndpointState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (hostVpcId != null) __obj.updateDynamic("hostVpcId")(hostVpcId.asInstanceOf[js.Any])
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointState]
  }
}

