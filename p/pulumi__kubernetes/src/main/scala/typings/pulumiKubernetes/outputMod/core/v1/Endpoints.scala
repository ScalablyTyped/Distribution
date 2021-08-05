package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
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
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
    */
  var subsets: js.Array[EndpointSubset]
}
object Endpoints {
  
  inline def apply(metadata: ObjectMeta, subsets: js.Array[EndpointSubset]): Endpoints = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", kind = "Endpoints", metadata = metadata.asInstanceOf[js.Any], subsets = subsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoints]
  }
  
  extension [Self <: Endpoints](x: Self) {
    
    inline def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSubsets(value: js.Array[EndpointSubset]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
    
    inline def setSubsetsVarargs(value: EndpointSubset*): Self = StObject.set(x, "subsets", js.Array(value :_*))
  }
}
