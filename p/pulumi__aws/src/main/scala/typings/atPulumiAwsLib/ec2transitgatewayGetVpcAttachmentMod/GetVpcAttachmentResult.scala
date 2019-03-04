package typings
package atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcAttachmentResult extends js.Object {
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: java.lang.String
  /**
    * Whether IPv6 support is enabled.
    */
  val ipv6Support: java.lang.String
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.Array[java.lang.String]
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: java.lang.String
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: java.lang.String
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: java.lang.String
}

object GetVpcAttachmentResult {
  @scala.inline
  def apply(
    dnsSupport: java.lang.String,
    ipv6Support: java.lang.String,
    subnetIds: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    transitGatewayId: java.lang.String,
    vpcId: java.lang.String,
    vpcOwnerId: java.lang.String
  ): GetVpcAttachmentResult = {
    val __obj = js.Dynamic.literal(dnsSupport = dnsSupport, ipv6Support = ipv6Support, subnetIds = subnetIds, tags = tags, transitGatewayId = transitGatewayId, vpcId = vpcId, vpcOwnerId = vpcOwnerId)
  
    __obj.asInstanceOf[GetVpcAttachmentResult]
  }
}

