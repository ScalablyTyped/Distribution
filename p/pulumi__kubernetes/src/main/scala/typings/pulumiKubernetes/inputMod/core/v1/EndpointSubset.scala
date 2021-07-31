package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var addresses: js.UndefOr[Input[js.Array[Input[EndpointAddress]]]] = js.undefined
  
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
    */
  var notReadyAddresses: js.UndefOr[Input[js.Array[Input[EndpointAddress]]]] = js.undefined
  
  /**
    * Port numbers available on the related IP addresses.
    */
  var ports: js.UndefOr[Input[js.Array[Input[EndpointPort]]]] = js.undefined
}
object EndpointSubset {
  
  @scala.inline
  def apply(): EndpointSubset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSubset]
  }
  
  @scala.inline
  implicit class EndpointSubsetMutableBuilder[Self <: EndpointSubset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: Input[js.Array[Input[EndpointAddress]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Input[EndpointAddress]*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setNotReadyAddresses(value: Input[js.Array[Input[EndpointAddress]]]): Self = StObject.set(x, "notReadyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotReadyAddressesUndefined: Self = StObject.set(x, "notReadyAddresses", js.undefined)
    
    @scala.inline
    def setNotReadyAddressesVarargs(value: Input[EndpointAddress]*): Self = StObject.set(x, "notReadyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[EndpointPort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[EndpointPort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
