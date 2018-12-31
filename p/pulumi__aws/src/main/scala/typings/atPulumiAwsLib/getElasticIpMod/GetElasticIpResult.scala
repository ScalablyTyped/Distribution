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

