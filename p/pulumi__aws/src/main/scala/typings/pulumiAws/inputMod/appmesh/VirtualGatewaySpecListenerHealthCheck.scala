package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListenerHealthCheck extends js.Object {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    */
  var healthyThreshold: Input[Double] = js.native
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: Input[Double] = js.native
  
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
    */
  var protocol: Input[String] = js.native
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Input[Double] = js.native
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
    */
  var unhealthyThreshold: Input[Double] = js.native
}
object VirtualGatewaySpecListenerHealthCheck {
  
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double]
  ): VirtualGatewaySpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerHealthCheck]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerHealthCheckOps[Self <: VirtualGatewaySpecListenerHealthCheck] (val x: Self) extends AnyVal {
    
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
    def setHealthyThreshold(value: Input[Double]): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMillis(value: Input[Double]): Self = this.set("intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMillis(value: Input[Double]): Self = this.set("timeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: Input[Double]): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
