package typings.atPulumiAws.route53ResolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.route53.ResolverEndpointIpAddress
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverEndpointArgs extends js.Object {
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: Input[String]
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]]
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: Input[js.Array[Input[String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ResolverEndpointArgs {
  @scala.inline
  def apply(
    direction: Input[String],
    ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]],
    securityGroupIds: Input[js.Array[Input[String]]],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ResolverEndpointArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointArgs]
  }
}

