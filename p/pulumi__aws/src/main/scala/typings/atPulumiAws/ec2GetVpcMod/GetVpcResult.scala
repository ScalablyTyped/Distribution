package typings.atPulumiAws.ec2GetVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetVpcCidrBlockAssociation
import typings.atPulumiAws.typesOutputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: String = js.native
  /**
    * The CIDR block for the association.
    */
  val cidrBlock: String = js.native
  val cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation] = js.native
  val default: Boolean = js.native
  val dhcpOptionsId: String = js.native
  /**
    * Whether or not the VPC has DNS hostname support
    */
  val enableDnsHostnames: Boolean = js.native
  /**
    * Whether or not the VPC has DNS support
    */
  val enableDnsSupport: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  val id: String = js.native
  /**
    * The allowed tenancy of instances launched into the
    * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
    */
  val instanceTenancy: String = js.native
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: String = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: String = js.native
  /**
    * The ID of the main route table associated with this VPC.
    */
  val mainRouteTableId: String = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: String = js.native
  /**
    * The State of the association.
    */
  val state: String = js.native
  val tags: StringDictionary[js.Any] = js.native
}

object GetVpcResult {
  @scala.inline
  def apply(
    arn: String,
    cidrBlock: String,
    cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation],
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
    filters: js.Array[GetVpcFilter] = null
  ): GetVpcResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], cidrBlockAssociations = cidrBlockAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], enableDnsHostnames = enableDnsHostnames.asInstanceOf[js.Any], enableDnsSupport = enableDnsSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTenancy = instanceTenancy.asInstanceOf[js.Any], ipv6AssociationId = ipv6AssociationId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], mainRouteTableId = mainRouteTableId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcResult]
  }
}

