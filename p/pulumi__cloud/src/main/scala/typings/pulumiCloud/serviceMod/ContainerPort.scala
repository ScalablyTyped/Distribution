package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerPort extends js.Object {
  /**
    * Whether the port should be exposed externally.  Defaults to `false`.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  /**
    * The incoming port where the service exposes the endpoint.
    */
  var port: Double
  /**
    * The protocol to use for exposing the service:
    * * `tcp`: Expose TCP externaly and to the container.
    * * `udp`: Expose UDP externally and to the container.
    * * `http`: Expose HTTP externally and to the container.
    * * `https`: Expose HTTPS externally and HTTP to the container.
    */
  var protocol: js.UndefOr[ContainerProtocol] = js.undefined
  /**
    * The target port on the backing container.  Defaults to the value of [port].
    */
  var targetPort: js.UndefOr[Double] = js.undefined
}

object ContainerPort {
  @scala.inline
  def apply(
    port: Double,
    external: js.UndefOr[Boolean] = js.undefined,
    protocol: ContainerProtocol = null,
    targetPort: js.UndefOr[Double] = js.undefined
  ): ContainerPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(targetPort)) __obj.updateDynamic("targetPort")(targetPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
}

