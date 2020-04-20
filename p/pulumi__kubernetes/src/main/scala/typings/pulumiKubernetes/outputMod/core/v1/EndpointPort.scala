package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort is a tuple that describes a single port.
  */
trait EndpointPort extends js.Object {
  /**
    * The application protocol for this port. This field follows standard Kubernetes label
    * syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
    * http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
    * names such as mycompany.com/my-custom-protocol. Field can be enabled with
    * ServiceAppProtocol feature gate.
    */
  val appProtocol: String
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
  def apply(appProtocol: String, name: String, port: Double, protocol: String): EndpointPort = {
    val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
}

