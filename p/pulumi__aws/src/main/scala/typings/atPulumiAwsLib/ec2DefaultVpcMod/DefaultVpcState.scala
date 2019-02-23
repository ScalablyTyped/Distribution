package typings
package atPulumiAwsLib.ec2DefaultVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVpcState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether or not an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC was assigned
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The CIDR block of the VPC
    */
  val cidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val dhcpOptionsId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val enableClassiclinkDnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Tenancy of instances spin up within VPC.
    */
  val instanceTenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The association ID for the IPv6 CIDR block of the VPC
    */
  val ipv6AssociationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IPv6 CIDR block of the VPC
    */
  val ipv6CidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws_main_route_table_association`](https://www.terraform.io/docs/providers/aws/r/main_route_table_assoc.html)
    */
  val mainRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

