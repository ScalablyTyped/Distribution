package typings.pulumiKubernetes.inputMod.discovery.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
    * names such as mycompany.com/my-custom-protocol.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of this port. All ports in an EndpointSlice must have a unique name. If the
    * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
    * Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: *
    * must be no more than 63 characters long. * must consist of lower case alphanumeric
    * characters or '-'. * must start and end with an alphanumeric character. Default is empty
    * string.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port number of the endpoint. If this is not specified, ports are not restricted and
    * must be interpreted in the context of the specific consumer.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}

object EndpointPort {
  @scala.inline
  def apply(
    appProtocol: Input[String] = null,
    name: Input[String] = null,
    port: Input[Double] = null,
    protocol: Input[String] = null
  ): EndpointPort = {
    val __obj = js.Dynamic.literal()
    if (appProtocol != null) __obj.updateDynamic("appProtocol")(appProtocol.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
}

