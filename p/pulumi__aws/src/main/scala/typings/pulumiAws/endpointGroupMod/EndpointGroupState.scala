package typings.pulumiAws.endpointGroupMod

import typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointGroupState extends js.Object {
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
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  val healthCheckPath: js.UndefOr[Input[String]] = js.native
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
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
    def setThresholdCount(value: Input[Double]): Self = this.set("thresholdCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdCount: Self = this.set("thresholdCount", js.undefined)
    @scala.inline
    def setTrafficDialPercentage(value: Input[Double]): Self = this.set("trafficDialPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficDialPercentage: Self = this.set("trafficDialPercentage", js.undefined)
  }
  
}

