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

object GetSubnetResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    assignIpv6AddressOnCreation: scala.Boolean,
    availabilityZone: java.lang.String,
    availabilityZoneId: java.lang.String,
    cidrBlock: java.lang.String,
    defaultForAz: scala.Boolean,
    id: java.lang.String,
    ipv6CidrBlock: java.lang.String,
    ipv6CidrBlockAssociationId: java.lang.String,
    mapPublicIpOnLaunch: scala.Boolean,
    ownerId: java.lang.String,
    state: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetSubnetResult = {
    val __obj = js.Dynamic.literal(arn = arn, assignIpv6AddressOnCreation = assignIpv6AddressOnCreation, availabilityZone = availabilityZone, availabilityZoneId = availabilityZoneId, cidrBlock = cidrBlock, defaultForAz = defaultForAz, id = id, ipv6CidrBlock = ipv6CidrBlock, ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId, mapPublicIpOnLaunch = mapPublicIpOnLaunch, ownerId = ownerId, state = state, tags = tags, vpcId = vpcId)
  
    __obj.asInstanceOf[GetSubnetResult]
  }
}

