package typings.atPulumiKubernetes.typesInputMod.discovery.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort represents a Port used by an EndpointSlice
  */
trait EndpointPort extends js.Object {
  /**
    * The name of this port. All ports in an EndpointSlice must have a unique name. If the
    * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
    * Service.ports[].name. Name must either be an empty string or pass IANA_SVC_NAME validation:
    * * must be no more than 15 characters long * may contain only [-a-z0-9] * must contain at
    * least one letter [a-z] * it must not start or end with a hyphen, nor contain adjacent
    * hyphens Default is empty string.
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
  def apply(name: Input[String] = null, port: Input[Double] = null, protocol: Input[String] = null): EndpointPort = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
}

