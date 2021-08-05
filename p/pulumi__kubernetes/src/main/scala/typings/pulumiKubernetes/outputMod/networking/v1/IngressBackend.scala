package typings.pulumiKubernetes.outputMod.networking.v1

import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackend extends StObject {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
    */
  var resource: TypedLocalObjectReference
  
  /**
    * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
    */
  var service: IngressServiceBackend
}
object IngressBackend {
  
  inline def apply(resource: TypedLocalObjectReference, service: IngressServiceBackend): IngressBackend = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
  
  extension [Self <: IngressBackend](x: Self) {
    
    inline def setResource(value: TypedLocalObjectReference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setService(value: IngressServiceBackend): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
