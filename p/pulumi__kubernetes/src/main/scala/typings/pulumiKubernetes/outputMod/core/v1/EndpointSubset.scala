package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointSubset is a group of addresses with a common set of ports. The expanded set of
  * endpoints is the Cartesian product of Addresses x Ports. For example, given:
  *   {
  *     Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
  *     Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
  *   }
  * The resulting set of endpoints can be viewed as:
  *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
  *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
  */
trait EndpointSubset extends js.Object {
  /**
    * IP addresses which offer the related ports that are marked as ready. These endpoints should
    * be considered safe for load balancers and clients to utilize.
    */
  val addresses: js.Array[EndpointAddress]
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because
    * they have not yet finished starting, have recently failed a readiness check, or have
    * recently failed a liveness check.
    */
  val notReadyAddresses: js.Array[EndpointAddress]
  /**
    * Port numbers available on the related IP addresses.
    */
  val ports: js.Array[EndpointPort]
}

object EndpointSubset {
  @scala.inline
  def apply(
    addresses: js.Array[EndpointAddress],
    notReadyAddresses: js.Array[EndpointAddress],
    ports: js.Array[EndpointPort]
  ): EndpointSubset = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], notReadyAddresses = notReadyAddresses.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointSubset]
  }
}

