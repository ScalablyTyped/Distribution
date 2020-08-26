package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait ContainerPort extends js.Object {
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
    */
  var containerPort: Double = js.native
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: String = js.native
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
    */
  var hostPort: Double = js.native
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: String = js.native
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: String = js.native
}

object ContainerPort {
  @scala.inline
  def apply(containerPort: Double, hostIP: String, hostPort: Double, name: String, protocol: String): ContainerPort = {
    val __obj = js.Dynamic.literal(containerPort = containerPort.asInstanceOf[js.Any], hostIP = hostIP.asInstanceOf[js.Any], hostPort = hostPort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
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
    def setContainerPort(value: Double): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostIP(value: String): Self = this.set("hostIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostPort(value: Double): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
  
}

