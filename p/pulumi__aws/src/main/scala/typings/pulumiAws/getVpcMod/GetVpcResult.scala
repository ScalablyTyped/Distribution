package typings.pulumiAws.getVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcCidrBlockAssociation
import typings.pulumiAws.outputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcResult extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: String = js.native
  
  /**
    * The CIDR block for the association.
    */
  val cidrBlock: String = js.native
  
  val cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation] = js.native
  
  val default: Boolean = js.native
  
  val dhcpOptionsId: String = js.native
  
  /**
    * Whether or not the VPC has DNS hostname support
    */
  val enableDnsHostnames: Boolean = js.native
  
  /**
    * Whether or not the VPC has DNS support
    */
  val enableDnsSupport: Boolean = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  
  val id: String = js.native
  
  /**
    * The allowed tenancy of instances launched into the
    * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
    */
  val instanceTenancy: String = js.native
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: String = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: String = js.native
  
  /**
    * The ID of the main route table associated with this VPC.
    */
  val mainRouteTableId: String = js.native
  
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: String = js.native
  
  /**
    * The State of the association.
    */
  val state: String = js.native
  
  val tags: StringDictionary[String] = js.native
}
object GetVpcResult {
  
  @scala.inline
  def apply(
    arn: String,
    cidrBlock: String,
    cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation],
    default: Boolean,
    dhcpOptionsId: String,
    enableDnsHostnames: Boolean,
    enableDnsSupport: Boolean,
    id: String,
    instanceTenancy: String,
    ipv6AssociationId: String,
    ipv6CidrBlock: String,
    mainRouteTableId: String,
    ownerId: String,
    state: String,
    tags: StringDictionary[String]
  ): GetVpcResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], cidrBlockAssociations = cidrBlockAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], enableDnsHostnames = enableDnsHostnames.asInstanceOf[js.Any], enableDnsSupport = enableDnsSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTenancy = instanceTenancy.asInstanceOf[js.Any], ipv6AssociationId = ipv6AssociationId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], mainRouteTableId = mainRouteTableId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcResult]
  }
  
  @scala.inline
  implicit class GetVpcResultOps[Self <: GetVpcResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockAssociationsVarargs(value: GetVpcCidrBlockAssociation*): Self = this.set("cidrBlockAssociations", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlockAssociations(value: js.Array[GetVpcCidrBlockAssociation]): Self = this.set("cidrBlockAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsId(value: String): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsHostnames(value: Boolean): Self = this.set("enableDnsHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsSupport(value: Boolean): Self = this.set("enableDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTenancy(value: String): Self = this.set("instanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AssociationId(value: String): Self = this.set("ipv6AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainRouteTableId(value: String): Self = this.set("mainRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
