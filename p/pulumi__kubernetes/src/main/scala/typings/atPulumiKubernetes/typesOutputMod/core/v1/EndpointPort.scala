package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort is a tuple that describes a single port.
  */
trait EndpointPort extends js.Object {
  /**
    * The name of this port.  This must match the 'name' field in the corresponding ServicePort.
    * Must be a DNS_LABEL. Optional only if one port is defined.
    */
  val name: String
  /**
    * The port number of the endpoint.
    */
  val port: Double
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  val protocol: String
}

object EndpointPort {
  @scala.inline
  def apply(name: String, port: Double, protocol: String): EndpointPort = {
    val __obj = js.Dynamic.literal(name = name, port = port, protocol = protocol)
  
    __obj.asInstanceOf[EndpointPort]
  }
}

