package typings.pulumiAws.getVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcEndpointDnsEntry
import typings.pulumiAws.outputMod.ec2.GetVpcEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcEndpointResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint.
    */
  val arn: String = js.native
  
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.Array[String] = js.native
  
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.Array[GetVpcEndpointDnsEntry] = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcEndpointFilter]] = js.native
  
  val id: String = js.native
  
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.Array[String] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: String = js.native
  
  /**
    * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val policy: String = js.native
  
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: String = js.native
  
  /**
    * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
    */
  val privateDnsEnabled: Boolean = js.native
  
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: Boolean = js.native
  
  /**
    * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.Array[String] = js.native
  
  /**
    * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
    */
  val securityGroupIds: js.Array[String] = js.native
  
  val serviceName: String = js.native
  
  val state: String = js.native
  
  /**
    * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
  
  /**
    * The VPC Endpoint type, `Gateway` or `Interface`.
    */
  val vpcEndpointType: String = js.native
  
  val vpcId: String = js.native
}
object GetVpcEndpointResult {
  
  @scala.inline
  def apply(
    arn: String,
    cidrBlocks: js.Array[String],
    dnsEntries: js.Array[GetVpcEndpointDnsEntry],
    id: String,
    networkInterfaceIds: js.Array[String],
    ownerId: String,
    policy: String,
    prefixListId: String,
    privateDnsEnabled: Boolean,
    requesterManaged: Boolean,
    routeTableIds: js.Array[String],
    securityGroupIds: js.Array[String],
    serviceName: String,
    state: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[String],
    vpcEndpointType: String,
    vpcId: String
  ): GetVpcEndpointResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlocks = cidrBlocks.asInstanceOf[js.Any], dnsEntries = dnsEntries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceIds = networkInterfaceIds.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], prefixListId = prefixListId.asInstanceOf[js.Any], privateDnsEnabled = privateDnsEnabled.asInstanceOf[js.Any], requesterManaged = requesterManaged.asInstanceOf[js.Any], routeTableIds = routeTableIds.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointType = vpcEndpointType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointResult]
  }
  
  @scala.inline
  implicit class GetVpcEndpointResultOps[Self <: GetVpcEndpointResult] (val x: Self) extends AnyVal {
    
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
    def setCidrBlocksVarargs(value: String*): Self = this.set("cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlocks(value: js.Array[String]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsEntriesVarargs(value: GetVpcEndpointDnsEntry*): Self = this.set("dnsEntries", js.Array(value :_*))
    
    @scala.inline
    def setDnsEntries(value: js.Array[GetVpcEndpointDnsEntry]): Self = this.set("dnsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: String*): Self = this.set("networkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceIds(value: js.Array[String]): Self = this.set("networkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListId(value: String): Self = this.set("prefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsEnabled(value: Boolean): Self = this.set("privateDnsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterManaged(value: Boolean): Self = this.set("requesterManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableIdsVarargs(value: String*): Self = this.set("routeTableIds", js.Array(value :_*))
    
    @scala.inline
    def setRouteTableIds(value: js.Array[String]): Self = this.set("routeTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointType(value: String): Self = this.set("vpcEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcEndpointFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcEndpointFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
