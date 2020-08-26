package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerPort extends js.Object {
  /**
    * Whether the port should be exposed externally.  Defaults to `false`.
    */
  var external: js.UndefOr[Boolean] = js.native
  /**
    * The incoming port where the service exposes the endpoint.
    */
  var port: Double = js.native
  /**
    * The protocol to use for exposing the service:
    * * `tcp`: Expose TCP externaly and to the container.
    * * `udp`: Expose UDP externally and to the container.
    * * `http`: Expose HTTP externally and to the container.
    * * `https`: Expose HTTPS externally and HTTP to the container.
    */
  var protocol: js.UndefOr[ContainerProtocol] = js.native
  /**
    * The target port on the backing container.  Defaults to the value of [port].
    */
  var targetPort: js.UndefOr[Double] = js.native
}

object ContainerPort {
  @scala.inline
  def apply(port: Double): ContainerPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
  @scala.inline
  implicit class ContainerPortOps[Self <: ContainerPort] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    @scala.inline
    def setProtocol(value: ContainerProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setTargetPort(value: Double): Self = this.set("targetPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPort: Self = this.set("targetPort", js.undefined)
  }
  
}

