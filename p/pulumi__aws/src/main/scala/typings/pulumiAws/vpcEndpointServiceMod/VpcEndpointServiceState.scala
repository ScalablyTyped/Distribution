package typings.pulumiAws.vpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointServiceState extends js.Object {
  
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint service.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
    */
  val gatewayLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The service name.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The state of the VPC endpoint service.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VpcEndpointServiceState {
  
  @scala.inline
  def apply(): VpcEndpointServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointServiceState]
  }
  
  @scala.inline
  implicit class VpcEndpointServiceStateOps[Self <: VpcEndpointServiceState] (val x: Self) extends AnyVal {
    
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
    def setAcceptanceRequired(value: Input[Boolean]): Self = this.set("acceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptanceRequired: Self = this.set("acceptanceRequired", js.undefined)
    
    @scala.inline
    def setAllowedPrincipalsVarargs(value: Input[String]*): Self = this.set("allowedPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = this.set("allowedPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPrincipals: Self = this.set("allowedPrincipals", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setBaseEndpointDnsNamesVarargs(value: Input[String]*): Self = this.set("baseEndpointDnsNames", js.Array(value :_*))
    
    @scala.inline
    def setBaseEndpointDnsNames(value: Input[js.Array[Input[String]]]): Self = this.set("baseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseEndpointDnsNames: Self = this.set("baseEndpointDnsNames", js.undefined)
    
    @scala.inline
    def setGatewayLoadBalancerArnsVarargs(value: Input[String]*): Self = this.set("gatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setGatewayLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = this.set("gatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayLoadBalancerArns: Self = this.set("gatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setManagesVpcEndpoints(value: Input[Boolean]): Self = this.set("managesVpcEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagesVpcEndpoints: Self = this.set("managesVpcEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: Input[String]*): Self = this.set("networkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = this.set("networkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkLoadBalancerArns: Self = this.set("networkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: Input[String]): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDnsName: Self = this.set("privateDnsName", js.undefined)
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setServiceType(value: Input[String]): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
