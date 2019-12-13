package typings.atPulumiKubernetes.typesOutputMod.discovery.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort represents a Port used by an EndpointSlice
  */
trait EndpointPort extends js.Object {
  /**
    * The application protocol for this port. This field follows standard Kubernetes label
    * syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
    * http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
    * names. Default is empty string.
    */
  val appProtocol: String
  /**
    * The name of this port. All ports in an EndpointSlice must have a unique name. If the
    * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
    * Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: *
    * must be no more than 63 characters long. * must consist of lower case alphanumeric
    * characters or '-'. * must start and end with an alphanumeric character. Default is empty
    * string.
    */
  val name: String
  /**
    * The port number of the endpoint. If this is not specified, ports are not restricted and
    * must be interpreted in the context of the specific consumer.
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

