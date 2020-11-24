package typings.pulumiAws.getVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcEndpointServiceResult extends js.Object {
  
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Boolean = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint service.
    */
  val arn: String = js.native
  
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.Array[String] = js.native
  
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.Array[String] = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcEndpointServiceFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: Boolean = js.native
  
  /**
    * The AWS account ID of the service owner or `amazon`.
    */
  val owner: String = js.native
  
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: String = js.native
  
  val service: js.UndefOr[String] = js.native
  
  /**
    * The ID of the endpoint service.
    */
  val serviceId: String = js.native
  
  val serviceName: String = js.native
  
  val serviceType: String = js.native
  
  /**
    * A map of tags assigned to the resource.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * Whether or not the service supports endpoint policies - `true` or `false`.
    */
  val vpcEndpointPolicySupported: Boolean = js.native
}
object GetVpcEndpointServiceResult {
  
  @scala.inline
  def apply(
    acceptanceRequired: Boolean,
    arn: String,
    availabilityZones: js.Array[String],
    baseEndpointDnsNames: js.Array[String],
    id: String,
    managesVpcEndpoints: Boolean,
    owner: String,
    privateDnsName: String,
    serviceId: String,
    serviceName: String,
    serviceType: String,
    tags: StringDictionary[String],
    vpcEndpointPolicySupported: Boolean
  ): GetVpcEndpointServiceResult = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], baseEndpointDnsNames = baseEndpointDnsNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managesVpcEndpoints = managesVpcEndpoints.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointPolicySupported = vpcEndpointPolicySupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceResult]
  }
  
  @scala.inline
  implicit class GetVpcEndpointServiceResultOps[Self <: GetVpcEndpointServiceResult] (val x: Self) extends AnyVal {
    
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
    def setAcceptanceRequired(value: Boolean): Self = this.set("acceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseEndpointDnsNamesVarargs(value: String*): Self = this.set("baseEndpointDnsNames", js.Array(value :_*))
    
    @scala.inline
    def setBaseEndpointDnsNames(value: js.Array[String]): Self = this.set("baseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagesVpcEndpoints(value: Boolean): Self = this.set("managesVpcEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointPolicySupported(value: Boolean): Self = this.set("vpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcEndpointServiceFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcEndpointServiceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
