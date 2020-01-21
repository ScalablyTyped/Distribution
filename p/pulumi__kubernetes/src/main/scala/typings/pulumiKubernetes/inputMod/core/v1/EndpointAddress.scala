package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointAddress is a tuple that describes single IP address.
  */
trait EndpointAddress extends js.Object {
  /**
    * The Hostname of this endpoint
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or
    * link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all
    * platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  var ip: Input[String]
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a
    * node.
    */
  var nodeName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Reference to object providing the endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.undefined
}

object EndpointAddress {
  @scala.inline
  def apply(
    ip: Input[String],
    hostname: Input[String] = null,
    nodeName: Input[String] = null,
    targetRef: Input[ObjectReference] = null
  ): EndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (targetRef != null) __obj.updateDynamic("targetRef")(targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
}

