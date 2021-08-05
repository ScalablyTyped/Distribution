package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait EndpointSubset extends StObject {
  
  /**
    * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
    */
  var addresses: js.Array[EndpointAddress]
  
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
    */
  var notReadyAddresses: js.Array[EndpointAddress]
  
  /**
    * Port numbers available on the related IP addresses.
    */
  var ports: js.Array[EndpointPort]
}
object EndpointSubset {
  
  inline def apply(
    addresses: js.Array[EndpointAddress],
    notReadyAddresses: js.Array[EndpointAddress],
    ports: js.Array[EndpointPort]
  ): EndpointSubset = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], notReadyAddresses = notReadyAddresses.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSubset]
  }
  
  extension [Self <: EndpointSubset](x: Self) {
    
    inline def setAddresses(value: js.Array[EndpointAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: EndpointAddress*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    inline def setNotReadyAddresses(value: js.Array[EndpointAddress]): Self = StObject.set(x, "notReadyAddresses", value.asInstanceOf[js.Any])
    
    inline def setNotReadyAddressesVarargs(value: EndpointAddress*): Self = StObject.set(x, "notReadyAddresses", js.Array(value :_*))
    
    inline def setPorts(value: js.Array[EndpointPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: EndpointPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
