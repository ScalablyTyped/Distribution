package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var addresses: js.UndefOr[Input[js.Array[Input[EndpointAddress]]]] = js.undefined
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because
    * they have not yet finished starting, have recently failed a readiness check, or have
    * recently failed a liveness check.
    */
  var notReadyAddresses: js.UndefOr[Input[js.Array[Input[EndpointAddress]]]] = js.undefined
  /**
    * Port numbers available on the related IP addresses.
    */
  var ports: js.UndefOr[Input[js.Array[Input[EndpointPort]]]] = js.undefined
}

object EndpointSubset {
  @scala.inline
  def apply(
    addresses: Input[js.Array[Input[EndpointAddress]]] = null,
    notReadyAddresses: Input[js.Array[Input[EndpointAddress]]] = null,
    ports: Input[js.Array[Input[EndpointPort]]] = null
  ): EndpointSubset = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (notReadyAddresses != null) __obj.updateDynamic("notReadyAddresses")(notReadyAddresses.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSubset]
  }
}

