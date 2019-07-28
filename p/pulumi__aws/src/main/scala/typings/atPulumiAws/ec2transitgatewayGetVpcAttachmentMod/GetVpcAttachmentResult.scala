package typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcAttachmentResult extends js.Object {
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * EC2 Transit Gateway VPC Attachment identifier
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * Whether IPv6 support is enabled.
    */
  val ipv6Support: String
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.Array[String]
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: StringDictionary[js.Any]
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: String
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: String
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
    filters: js.Array[Anon_NameValues] = null,
    id: String = null
  ): GetVpcAttachmentResult = {
    val __obj = js.Dynamic.literal(dnsSupport = dnsSupport, ipv6Support = ipv6Support, subnetIds = subnetIds, tags = tags, transitGatewayId = transitGatewayId, vpcId = vpcId, vpcOwnerId = vpcOwnerId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetVpcAttachmentResult]
  }
}

