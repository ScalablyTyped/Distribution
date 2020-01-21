package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port number of the endpoint.
    */
  var port: Input[Double]
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}

object EndpointPort {
  @scala.inline
  def apply(port: Input[Double], name: Input[String] = null, protocol: Input[String] = null): EndpointPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
}

