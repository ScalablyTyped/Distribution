package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecListenerHealthCheck extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    * * `intervalMillis`- (Required) The time period in milliseconds between each health check execution.
    */
  var healthyThreshold: Double
  var intervalMillis: Double
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: Double
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: String
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Double
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
    */
  var unhealthyThreshold: Double
}

object VirtualNodeSpecListenerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    intervalMillis: Double,
    port: Double,
    protocol: String,
    timeoutMillis: Double,
    unhealthyThreshold: Double,
    path: String = null
  ): VirtualNodeSpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, intervalMillis = intervalMillis, port = port, protocol = protocol, timeoutMillis = timeoutMillis, unhealthyThreshold = unhealthyThreshold)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[VirtualNodeSpecListenerHealthCheck]
  }
}

