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

