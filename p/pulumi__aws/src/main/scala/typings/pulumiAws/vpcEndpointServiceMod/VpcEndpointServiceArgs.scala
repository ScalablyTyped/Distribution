package typings.pulumiAws.vpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointServiceArgs extends js.Object {
  
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Input[Boolean] = js.native
  
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
    */
  val gatewayLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VpcEndpointServiceArgs {
  
  @scala.inline
  def apply(acceptanceRequired: Input[Boolean]): VpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceArgs]
  }
  
  @scala.inline
  implicit class VpcEndpointServiceArgsOps[Self <: VpcEndpointServiceArgs] (val x: Self) extends AnyVal {
    
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
    def setAllowedPrincipalsVarargs(value: Input[String]*): Self = this.set("allowedPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = this.set("allowedPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPrincipals: Self = this.set("allowedPrincipals", js.undefined)
    
    @scala.inline
    def setGatewayLoadBalancerArnsVarargs(value: Input[String]*): Self = this.set("gatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setGatewayLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = this.set("gatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayLoadBalancerArns: Self = this.set("gatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: Input[String]*): Self = this.set("networkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = this.set("networkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkLoadBalancerArns: Self = this.set("networkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
