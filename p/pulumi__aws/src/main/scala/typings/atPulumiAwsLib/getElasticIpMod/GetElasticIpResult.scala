package typings
package atPulumiAwsLib.getElasticIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetElasticIpResult extends js.Object {
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  val associationId: java.lang.String
  /**
    * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
    */
  val domain: java.lang.String
  /**
    * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
    */
  val id: java.lang.String
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  val instanceId: java.lang.String
  /**
    * The ID of the network interface.
    */
  val networkInterfaceId: java.lang.String
  /**
    * The ID of the AWS account that owns the network interface.
    */
  val networkInterfaceOwnerId: java.lang.String
  /**
    * The private IP address associated with the Elastic IP address.
    */
  val privateIp: java.lang.String
  /**
    * Public IP address of Elastic IP.
    */
  val publicIp: java.lang.String
  /**
    * The ID of an address pool.
    */
  val publicIpv4Pool: java.lang.String
  /**
    * Key-value map of tags associated with Elastic IP.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetElasticIpResult {
  @scala.inline
  def apply(
    associationId: java.lang.String,
    domain: java.lang.String,
    id: java.lang.String,
    instanceId: java.lang.String,
    networkInterfaceId: java.lang.String,
    networkInterfaceOwnerId: java.lang.String,
    privateIp: java.lang.String,
    publicIp: java.lang.String,
    publicIpv4Pool: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetElasticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("associationId")(associationId)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    __obj.updateDynamic("networkInterfaceOwnerId")(networkInterfaceOwnerId)
    __obj.updateDynamic("privateIp")(privateIp)
    __obj.updateDynamic("publicIp")(publicIp)
    __obj.updateDynamic("publicIpv4Pool")(publicIpv4Pool)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetElasticIpResult]
  }
}

