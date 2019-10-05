package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerPort represents a network port in a single container.
  */
trait ContainerPort extends js.Object {
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x <
    * 65536.
    */
  var containerPort: Input[Double]
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: js.UndefOr[Input[String]] = js.undefined
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x
    * < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not
    * need this.
    */
  var hostPort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a
    * pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}

object ContainerPort {
  @scala.inline
  def apply(
    containerPort: Input[Double],
    hostIP: Input[String] = null,
    hostPort: Input[Double] = null,
    name: Input[String] = null,
    protocol: Input[String] = null
  ): ContainerPort = {
    val __obj = js.Dynamic.literal(containerPort = containerPort.asInstanceOf[js.Any])
    if (hostIP != null) __obj.updateDynamic("hostIP")(hostIP.asInstanceOf[js.Any])
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
}

