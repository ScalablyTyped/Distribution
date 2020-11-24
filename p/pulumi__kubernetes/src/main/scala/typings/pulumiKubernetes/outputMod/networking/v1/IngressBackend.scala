package typings.pulumiKubernetes.outputMod.networking.v1

import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
@js.native
trait IngressBackend extends js.Object {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
    */
  var resource: TypedLocalObjectReference = js.native
  
  /**
    * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
    */
  var service: IngressServiceBackend = js.native
}
object IngressBackend {
  
  @scala.inline
  def apply(resource: TypedLocalObjectReference, service: IngressServiceBackend): IngressBackend = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
  
  @scala.inline
  implicit class IngressBackendOps[Self <: IngressBackend] (val x: Self) extends AnyVal {
    
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
    def setResource(value: TypedLocalObjectReference): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: IngressServiceBackend): Self = this.set("service", value.asInstanceOf[js.Any])
  }
}
