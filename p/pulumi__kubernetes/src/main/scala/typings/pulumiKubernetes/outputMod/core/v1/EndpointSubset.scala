package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
  *   {
  *     Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
  *     Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
  *   }
  * The resulting set of endpoints can be viewed as:
  *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
  *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
  */
@js.native
trait EndpointSubset extends js.Object {
  
  /**
    * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
    */
  var addresses: js.Array[EndpointAddress] = js.native
  
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
    */
  var notReadyAddresses: js.Array[EndpointAddress] = js.native
  
  /**
    * Port numbers available on the related IP addresses.
    */
  var ports: js.Array[EndpointPort] = js.native
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
  
  @scala.inline
  implicit class EndpointSubsetOps[Self <: EndpointSubset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressesVarargs(value: EndpointAddress*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[EndpointAddress]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotReadyAddressesVarargs(value: EndpointAddress*): Self = this.set("notReadyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setNotReadyAddresses(value: js.Array[EndpointAddress]): Self = this.set("notReadyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: EndpointPort*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[EndpointPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
  }
}
