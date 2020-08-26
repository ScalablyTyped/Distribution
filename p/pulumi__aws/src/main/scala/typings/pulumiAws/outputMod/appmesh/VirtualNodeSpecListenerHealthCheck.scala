package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListenerHealthCheck extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    */
  var healthyThreshold: Double = js.native
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: Double = js.native
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: Double = js.native
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: String = js.native
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Double = js.native
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
    */
  var unhealthyThreshold: Double = js.native
}

object VirtualNodeSpecListenerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    intervalMillis: Double,
    port: Double,
    protocol: String,
    timeoutMillis: Double,
    unhealthyThreshold: Double
  ): VirtualNodeSpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerHealthCheck]
  }
  @scala.inline
  implicit class VirtualNodeSpecListenerHealthCheckOps[Self <: VirtualNodeSpecListenerHealthCheck] (val x: Self) extends AnyVal {
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
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalMillis(value: Double): Self = this.set("intervalMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutMillis(value: Double): Self = this.set("timeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

