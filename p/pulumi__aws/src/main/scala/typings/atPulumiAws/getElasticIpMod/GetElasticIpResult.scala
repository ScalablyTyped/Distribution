package typings.atPulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetElasticIpResult extends js.Object {
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  val associationId: String
  /**
    * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
    */
  val domain: String
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.undefined
  /**
    * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
    */
  val id: String
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  val instanceId: String
  /**
    * The ID of the network interface.
    */
  val networkInterfaceId: String
  /**
    * The ID of the AWS account that owns the network interface.
    */
  val networkInterfaceOwnerId: String
  /**
    * The Private DNS associated with the Elastic IP address.
    */
  val privateDns: String
  /**
    * The private IP address associated with the Elastic IP address.
    */
  val privateIp: String
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: String
  /**
    * Public IP address of Elastic IP.
    */
  val publicIp: String
  /**
    * The ID of an address pool.
    */
  val publicIpv4Pool: String
  /**
    * Key-value map of tags associated with Elastic IP.
    */
  val tags: StringDictionary[js.Any]
}

object GetElasticIpResult {
  @scala.inline
  def apply(
    associationId: String,
    domain: String,
    id: String,
    instanceId: String,
    networkInterfaceId: String,
    networkInterfaceOwnerId: String,
    privateDns: String,
    privateIp: String,
    publicDns: String,
    publicIp: String,
    publicIpv4Pool: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetElasticIpFilter] = null
  ): GetElasticIpResult = {
    val __obj = js.Dynamic.literal(associationId = associationId, domain = domain, id = id, instanceId = instanceId, networkInterfaceId = networkInterfaceId, networkInterfaceOwnerId = networkInterfaceOwnerId, privateDns = privateDns, privateIp = privateIp, publicDns = publicDns, publicIp = publicIp, publicIpv4Pool = publicIpv4Pool, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetElasticIpResult]
  }
}

