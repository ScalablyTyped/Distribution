package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiPulumi.outputMod.Input
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
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
    */
  var resource: js.UndefOr[Input[TypedLocalObjectReference]] = js.native
  
  /**
    * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
    */
  var service: js.UndefOr[Input[IngressServiceBackend]] = js.native
}
object IngressBackend {
  
  @scala.inline
  def apply(): IngressBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressBackend]
  }
  
  @scala.inline
  implicit class IngressBackendMutableBuilder[Self <: IngressBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setService(value: Input[IngressServiceBackend]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
