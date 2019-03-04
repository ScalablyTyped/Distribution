package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val hostname: java.lang.String
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or
    * link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all
    * platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  val ip: java.lang.String
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a
    * node.
    */
  val nodeName: java.lang.String
  /**
    * Reference to object providing the endpoint.
    */
  val targetRef: ObjectReference
}

object EndpointAddress {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    ip: java.lang.String,
    nodeName: java.lang.String,
    targetRef: ObjectReference
  ): EndpointAddress = {
    val __obj = js.Dynamic.literal(hostname = hostname, ip = ip, nodeName = nodeName, targetRef = targetRef)
  
    __obj.asInstanceOf[EndpointAddress]
  }
}

