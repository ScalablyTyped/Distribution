package typings.pulumiAws.getVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcAttachmentResult extends js.Object {
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String = js.native
  val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.native
  /**
    * EC2 Transit Gateway VPC Attachment identifier
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Whether IPv6 support is enabled.
    */
  val ipv6Support: String = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.Array[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: String = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: String = js.native
}

object GetVpcAttachmentResult {
  @scala.inline
  def apply(
    dnsSupport: String,
    ipv6Support: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    transitGatewayId: String,
    vpcId: String,
    vpcOwnerId: String,
    filters: js.Array[GetVpcAttachmentFilter] = null,
    id: String = null
  ): GetVpcAttachmentResult = {
    val __obj = js.Dynamic.literal(dnsSupport = dnsSupport.asInstanceOf[js.Any], ipv6Support = ipv6Support.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcOwnerId = vpcOwnerId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcAttachmentResult]
  }
}

