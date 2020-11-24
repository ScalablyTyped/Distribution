package typings.pulumiAws.endpointGroupMod

import typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointGroupState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: js.UndefOr[Input[js.Array[Input[EndpointGroupEndpointConfiguration]]]] = js.native
  
  /**
    * The name of the AWS Region where the endpoint group is located.
    */
  val endpointGroupRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.native
  
  val healthCheckPath: js.UndefOr[Input[String]] = js.native
  
  val healthCheckPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
    */
  val portOverrides: js.UndefOr[Input[js.Array[Input[EndpointGroupPortOverride]]]] = js.native
  
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: js.UndefOr[Input[Double]] = js.native
}
object EndpointGroupState {
  
  @scala.inline
  def apply(): EndpointGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointGroupState]
  }
  
  @scala.inline
  implicit class EndpointGroupStateOps[Self <: EndpointGroupState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEndpointConfigurationsVarargs(value: Input[EndpointGroupEndpointConfiguration]*): Self = this.set("endpointConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEndpointConfigurations(value: Input[js.Array[Input[EndpointGroupEndpointConfiguration]]]): Self = this.set("endpointConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfigurations: Self = this.set("endpointConfigurations", js.undefined)
    
    @scala.inline
    def setEndpointGroupRegion(value: Input[String]): Self = this.set("endpointGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointGroupRegion: Self = this.set("endpointGroupRegion", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: Input[Double]): Self = this.set("healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckIntervalSeconds: Self = this.set("healthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: Input[String]): Self = this.set("healthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("healthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: Input[Double]): Self = this.set("healthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPort: Self = this.set("healthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: Input[String]): Self = this.set("healthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckProtocol: Self = this.set("healthCheckProtocol", js.undefined)
    
    @scala.inline
    def setListenerArn(value: Input[String]): Self = this.set("listenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerArn: Self = this.set("listenerArn", js.undefined)
    
    @scala.inline
    def setPortOverridesVarargs(value: Input[EndpointGroupPortOverride]*): Self = this.set("portOverrides", js.Array(value :_*))
    
    @scala.inline
    def setPortOverrides(value: Input[js.Array[Input[EndpointGroupPortOverride]]]): Self = this.set("portOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortOverrides: Self = this.set("portOverrides", js.undefined)
    
    @scala.inline
    def setThresholdCount(value: Input[Double]): Self = this.set("thresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdCount: Self = this.set("thresholdCount", js.undefined)
    
    @scala.inline
    def setTrafficDialPercentage(value: Input[Double]): Self = this.set("trafficDialPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficDialPercentage: Self = this.set("trafficDialPercentage", js.undefined)
  }
}
