package typings.atPulumiAws.ec2GetVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AssociationId
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: String
  /**
    * The CIDR block for the association.
    */
  val cidrBlock: String
  val cidrBlockAssociations: js.Array[Anon_AssociationId]
  val default: Boolean
  val dhcpOptionsId: String
  /**
    * Whether or not the VPC has DNS hostname support
    */
  val enableDnsHostnames: Boolean
  /**
    * Whether or not the VPC has DNS support
    */
  val enableDnsSupport: Boolean
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  val id: String
  /**
    * The allowed tenancy of instances launched into the
    * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
    */
  val instanceTenancy: String
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: String
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: String
  /**
    * The ID of the main route table associated with this VPC.
    */
  val mainRouteTableId: String
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: String
  /**
    * The State of the association.
    */
  val state: String
  val tags: StringDictionary[js.Any]
}

object GetVpcResult {
  @scala.inline
  def apply(
    arn: String,
    cidrBlock: String,
    cidrBlockAssociations: js.Array[Anon_AssociationId],
    default: Boolean,
    dhcpOptionsId: String,
    enableDnsHostnames: Boolean,
    enableDnsSupport: Boolean,
    id: String,
    instanceTenancy: String,
    ipv6AssociationId: String,
    ipv6CidrBlock: String,
    mainRouteTableId: String,
    ownerId: String,
    state: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[Anon_NameValues] = null
  ): GetVpcResult = {
    val __obj = js.Dynamic.literal(arn = arn, cidrBlock = cidrBlock, cidrBlockAssociations = cidrBlockAssociations, default = default, dhcpOptionsId = dhcpOptionsId, enableDnsHostnames = enableDnsHostnames, enableDnsSupport = enableDnsSupport, id = id, instanceTenancy = instanceTenancy, ipv6AssociationId = ipv6AssociationId, ipv6CidrBlock = ipv6CidrBlock, mainRouteTableId = mainRouteTableId, ownerId = ownerId, state = state, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcResult]
  }
}

