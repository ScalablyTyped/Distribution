package typings.pulumiAws.getVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcAttachmentResult extends js.Object {
  
  /**
    * Whether Appliance Mode support is enabled.
    */
  val applianceModeSupport: String = js.native
  
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.native
  
  /**
    * EC2 Transit Gateway VPC Attachment identifier
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * Whether IPv6 support is enabled.
    */
  val ipv6Support: String = js.native
  
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.Array[String] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String = js.native
  
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: String = js.native
  
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: String = js.native
}
object GetVpcAttachmentResult {
  
  @scala.inline
  def apply(
    applianceModeSupport: String,
    dnsSupport: String,
    ipv6Support: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[String],
    transitGatewayId: String,
    vpcId: String,
    vpcOwnerId: String
  ): GetVpcAttachmentResult = {
    val __obj = js.Dynamic.literal(applianceModeSupport = applianceModeSupport.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ipv6Support = ipv6Support.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcOwnerId = vpcOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class GetVpcAttachmentResultOps[Self <: GetVpcAttachmentResult] (val x: Self) extends AnyVal {
    
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
    def setApplianceModeSupport(value: String): Self = this.set("applianceModeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSupport(value: String): Self = this.set("dnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Support(value: String): Self = this.set("ipv6Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcOwnerId(value: String): Self = this.set("vpcOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
