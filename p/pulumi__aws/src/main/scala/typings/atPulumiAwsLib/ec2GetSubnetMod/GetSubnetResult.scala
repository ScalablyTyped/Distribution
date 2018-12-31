package typings
package atPulumiAwsLib.ec2GetSubnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetResult extends js.Object {
  /**
    * The ARN of the subnet.
    */
  val arn: java.lang.String
  val assignIpv6AddressOnCreation: scala.Boolean
  val availabilityZone: java.lang.String
  val availabilityZoneId: java.lang.String
  val cidrBlock: java.lang.String
  val defaultForAz: scala.Boolean
  val id: java.lang.String
  val ipv6CidrBlock: java.lang.String
  val ipv6CidrBlockAssociationId: java.lang.String
  val mapPublicIpOnLaunch: scala.Boolean
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: java.lang.String
  val state: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

