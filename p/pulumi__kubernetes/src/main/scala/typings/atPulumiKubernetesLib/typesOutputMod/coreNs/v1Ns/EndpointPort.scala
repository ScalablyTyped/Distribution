package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort is a tuple that describes a single port.
  */
trait EndpointPort extends js.Object {
  /**
    * The name of this port (corresponds to ServicePort.Name). Must be a DNS_LABEL. Optional only
    * if one port is defined.
    */
  val name: java.lang.String
  /**
    * The port number of the endpoint.
    */
  val port: scala.Double
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  val protocol: java.lang.String
}

object EndpointPort {
  @scala.inline
  def apply(name: java.lang.String, port: scala.Double, protocol: java.lang.String): EndpointPort = {
    val __obj = js.Dynamic.literal(name = name, port = port, protocol = protocol)
  
    __obj.asInstanceOf[EndpointPort]
  }
}

