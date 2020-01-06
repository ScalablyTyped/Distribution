package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListenerHealthCheck extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    * * `intervalMillis`- (Required) The time period in milliseconds between each health check execution.
    */
  var healthyThreshold: Input[Double] = js.native
  var intervalMillis: Input[Double] = js.native
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: Input[String] = js.native
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Input[Double] = js.native
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
    */
  var unhealthyThreshold: Input[Double] = js.native
}

object VirtualNodeSpecListenerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double],
    path: Input[String] = null,
    port: Input[Double] = null
  ): VirtualNodeSpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerHealthCheck]
  }
}

