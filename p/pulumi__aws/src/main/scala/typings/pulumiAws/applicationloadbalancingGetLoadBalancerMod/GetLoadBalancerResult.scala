package typings.pulumiAws.applicationloadbalancingGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.applicationloadbalancing.GetLoadBalancerAccessLogs
import typings.pulumiAws.outputMod.applicationloadbalancing.GetLoadBalancerSubnetMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerResult extends js.Object {
  
  val accessLogs: GetLoadBalancerAccessLogs = js.native
  
  val arn: String = js.native
  
  val arnSuffix: String = js.native
  
  val customerOwnedIpv4Pool: String = js.native
  
  val dnsName: String = js.native
  
  val dropInvalidHeaderFields: Boolean = js.native
  
  val enableDeletionProtection: Boolean = js.native
  
  val enableHttp2: Boolean = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val idleTimeout: Double = js.native
  
  val internal: Boolean = js.native
  
  val ipAddressType: String = js.native
  
  val loadBalancerType: String = js.native
  
  val name: String = js.native
  
  val securityGroups: js.Array[String] = js.native
  
  val subnetMappings: js.Array[GetLoadBalancerSubnetMapping] = js.native
  
  val subnets: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val vpcId: String = js.native
  
  val zoneId: String = js.native
}
object GetLoadBalancerResult {
  
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
    arn: String,
    arnSuffix: String,
    customerOwnedIpv4Pool: String,
    dnsName: String,
    dropInvalidHeaderFields: Boolean,
    enableDeletionProtection: Boolean,
    enableHttp2: Boolean,
    id: String,
    idleTimeout: Double,
    internal: Boolean,
    ipAddressType: String,
    loadBalancerType: String,
    name: String,
    securityGroups: js.Array[String],
    subnetMappings: js.Array[GetLoadBalancerSubnetMapping],
    subnets: js.Array[String],
    tags: StringDictionary[String],
    vpcId: String,
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], customerOwnedIpv4Pool = customerOwnedIpv4Pool.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], dropInvalidHeaderFields = dropInvalidHeaderFields.asInstanceOf[js.Any], enableDeletionProtection = enableDeletionProtection.asInstanceOf[js.Any], enableHttp2 = enableHttp2.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ipAddressType = ipAddressType.asInstanceOf[js.Any], loadBalancerType = loadBalancerType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
  
  @scala.inline
  implicit class GetLoadBalancerResultOps[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
    
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
    def setAccessLogs(value: GetLoadBalancerAccessLogs): Self = this.set("accessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnSuffix(value: String): Self = this.set("arnSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: String): Self = this.set("customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropInvalidHeaderFields(value: Boolean): Self = this.set("dropInvalidHeaderFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeletionProtection(value: Boolean): Self = this.set("enableDeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHttp2(value: Boolean): Self = this.set("enableHttp2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressType(value: String): Self = this.set("ipAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerType(value: String): Self = this.set("loadBalancerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMappingsVarargs(value: GetLoadBalancerSubnetMapping*): Self = this.set("subnetMappings", js.Array(value :_*))
    
    @scala.inline
    def setSubnetMappings(value: js.Array[GetLoadBalancerSubnetMapping]): Self = this.set("subnetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: js.Array[String]): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
  }
}
