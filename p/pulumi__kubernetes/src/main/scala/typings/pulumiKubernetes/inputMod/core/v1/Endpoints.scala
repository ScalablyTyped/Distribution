package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Endpoints is a collection of endpoints that implement the actual service. Example:
  *   Name: "mysvc",
  *   Subsets: [
  *     {
  *       Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
  *       Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
  *     },
  *     {
  *       Addresses: [{"ip": "10.10.3.3"}],
  *       Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
  *     },
  *  ]
  */
trait Endpoints extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints]] = js.undefined
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
    */
  var subsets: js.UndefOr[Input[js.Array[Input[EndpointSubset]]]] = js.undefined
}
object Endpoints {
  
  inline def apply(): Endpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoints]
  }
  
  extension [Self <: Endpoints](x: Self) {
    
    inline def setApiVersion(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSubsets(value: Input[js.Array[Input[EndpointSubset]]]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
    
    inline def setSubsetsUndefined: Self = StObject.set(x, "subsets", js.undefined)
    
    inline def setSubsetsVarargs(value: Input[EndpointSubset]*): Self = StObject.set(x, "subsets", js.Array(value :_*))
  }
}
