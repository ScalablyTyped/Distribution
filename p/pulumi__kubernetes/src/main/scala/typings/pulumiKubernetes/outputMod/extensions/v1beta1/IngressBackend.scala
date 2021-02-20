package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
@js.native
trait IngressBackend extends StObject {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: TypedLocalObjectReference = js.native
  
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: String = js.native
  
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: Double | String = js.native
}
object IngressBackend {
  
  @scala.inline
  def apply(resource: TypedLocalObjectReference, serviceName: String, servicePort: Double | String): IngressBackend = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
  
  @scala.inline
  implicit class IngressBackendMutableBuilder[Self <: IngressBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: TypedLocalObjectReference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePort(value: Double | String): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
  }
}
