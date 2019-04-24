package typings
package atPulumiAwsLib.ec2GetVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: java.lang.String
  /**
    * The CIDR block for the association.
    */
  val cidrBlock: java.lang.String
  val cidrBlockAssociations: js.Array[atPulumiAwsLib.Anon_AssociationId]
  val default: scala.Boolean
  val dhcpOptionsId: java.lang.String
  /**
    * Whether or not the VPC has DNS hostname support
    */
  val enableDnsHostnames: scala.Boolean
  /**
    * Whether or not the VPC has DNS support
    */
  val enableDnsSupport: scala.Boolean
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  val id: java.lang.String
  /**
    * The allowed tenancy of instances launched into the
    * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
    */
  val instanceTenancy: java.lang.String
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: java.lang.String
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: java.lang.String
  /**
    * The ID of the main route table associated with this VPC.
    */
  val mainRouteTableId: java.lang.String
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: java.lang.String
  /**
    * The State of the association.
    */
  val state: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetVpcResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    cidrBlock: java.lang.String,
    cidrBlockAssociations: js.Array[atPulumiAwsLib.Anon_AssociationId],
    default: scala.Boolean,
    dhcpOptionsId: java.lang.String,
    enableDnsHostnames: scala.Boolean,
    enableDnsSupport: scala.Boolean,
    id: java.lang.String,
    instanceTenancy: java.lang.String,
    ipv6AssociationId: java.lang.String,
    ipv6CidrBlock: java.lang.String,
    mainRouteTableId: java.lang.String,
    ownerId: java.lang.String,
    state: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetVpcResult = {
    val __obj = js.Dynamic.literal(arn = arn, cidrBlock = cidrBlock, cidrBlockAssociations = cidrBlockAssociations, default = default, dhcpOptionsId = dhcpOptionsId, enableDnsHostnames = enableDnsHostnames, enableDnsSupport = enableDnsSupport, id = id, instanceTenancy = instanceTenancy, ipv6AssociationId = ipv6AssociationId, ipv6CidrBlock = ipv6CidrBlock, mainRouteTableId = mainRouteTableId, ownerId = ownerId, state = state, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcResult]
  }
}

