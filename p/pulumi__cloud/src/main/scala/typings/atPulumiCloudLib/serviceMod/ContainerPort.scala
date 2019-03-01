package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerPort extends js.Object {
  /**
    * Whether the port should be exposed externally.  Defaults to `false`.
    */
  var external: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The incoming port where the service exposes the endpoint.
    */
  var port: scala.Double
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
  var targetPort: js.UndefOr[scala.Double] = js.undefined
}

object ContainerPort {
  @scala.inline
  def apply(
    port: scala.Double,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: ContainerProtocol = null,
    targetPort: scala.Int | scala.Double = null
  ): ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("port")(port)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (targetPort != null) __obj.updateDynamic("targetPort")(targetPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
}

