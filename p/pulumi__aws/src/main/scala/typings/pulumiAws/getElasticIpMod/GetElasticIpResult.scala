package typings.pulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.GetElasticIpFilter
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
    * Customer Owned IP.
    */
  val customerOwnedIp: String = js.native
  /**
    * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
    */
  val customerOwnedIpv4Pool: String = js.native
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
  val tags: StringDictionary[String] = js.native
}

object GetElasticIpResult {
  @scala.inline
  def apply(
    associationId: String,
    customerOwnedIp: String,
    customerOwnedIpv4Pool: String,
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
    tags: StringDictionary[String]
  ): GetElasticIpResult = {
    val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], customerOwnedIp = customerOwnedIp.asInstanceOf[js.Any], customerOwnedIpv4Pool = customerOwnedIpv4Pool.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], networkInterfaceOwnerId = networkInterfaceOwnerId.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], publicIpv4Pool = publicIpv4Pool.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetElasticIpResult]
  }
  @scala.inline
  implicit class GetElasticIpResultOps[Self <: GetElasticIpResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationId(value: String): Self = this.set("associationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerOwnedIp(value: String): Self = this.set("customerOwnedIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: String): Self = this.set("customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceOwnerId(value: String): Self = this.set("networkInterfaceOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateDns(value: String): Self = this.set("privateDns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicDns(value: String): Self = this.set("publicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicIpv4Pool(value: String): Self = this.set("publicIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetElasticIpFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetElasticIpFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

