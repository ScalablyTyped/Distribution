package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointGroupEndpointConfiguration extends js.Object {
  
  var clientIpPreservationEnabled: Boolean = js.native
  
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
    */
  var endpointId: js.UndefOr[String] = js.native
  
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
    */
  var weight: js.UndefOr[Double] = js.native
}
object EndpointGroupEndpointConfiguration {
  
  @scala.inline
  def apply(clientIpPreservationEnabled: Boolean): EndpointGroupEndpointConfiguration = {
    val __obj = js.Dynamic.literal(clientIpPreservationEnabled = clientIpPreservationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupEndpointConfiguration]
  }
  
  @scala.inline
  implicit class EndpointGroupEndpointConfigurationOps[Self <: EndpointGroupEndpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClientIpPreservationEnabled(value: Boolean): Self = this.set("clientIpPreservationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointId: Self = this.set("endpointId", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
