package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val containerPort: scala.Double
  /**
    * What host IP to bind the external port to.
    */
  val hostIP: java.lang.String
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x
    * < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not
    * need this.
    */
  val hostPort: scala.Double
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a
    * pod must have a unique name. Name for the port that can be referred to by services.
    */
  val name: java.lang.String
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  val protocol: java.lang.String
}

object ContainerPort {
  @scala.inline
  def apply(
    containerPort: scala.Double,
    hostIP: java.lang.String,
    hostPort: scala.Double,
    name: java.lang.String,
    protocol: java.lang.String
  ): ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerPort")(containerPort)
    __obj.updateDynamic("hostIP")(hostIP)
    __obj.updateDynamic("hostPort")(hostPort)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[ContainerPort]
  }
}

