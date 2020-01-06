package typings.atPulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetElasticIpResult extends js.Object {
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  val associationId: String = js.native
  /**
    * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
    */
  val domain: String = js.native
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
  /**
    * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
    */
  val id: String = js.native
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  val instanceId: String = js.native
  /**
    * The ID of the network interface.
    */
  val networkInterfaceId: String = js.native
  /**
    * The ID of the AWS account that owns the network interface.
    */
  val networkInterfaceOwnerId: String = js.native
  /**
    * The Private DNS associated with the Elastic IP address.
    */
  val privateDns: String = js.native
  /**
    * The private IP address associated with the Elastic IP address.
    */
  val privateIp: String = js.native
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: String = js.native
  /**
    * Public IP address of Elastic IP.
    */
  val publicIp: String = js.native
  /**
    * The ID of an address pool.
    */
  val publicIpv4Pool: String = js.native
  /**
    * Key-value map of tags associated with Elastic IP.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], networkInterfaceOwnerId = networkInterfaceOwnerId.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], publicIpv4Pool = publicIpv4Pool.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetElasticIpResult]
  }
}

