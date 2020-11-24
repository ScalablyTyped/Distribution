package typings.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressServiceBackend references a Kubernetes Service as a Backend.
  */
@js.native
trait IngressServiceBackend extends js.Object {
  
  /**
    * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
    */
  var name: String = js.native
  
  /**
    * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
    */
  var port: ServiceBackendPort = js.native
}
object IngressServiceBackend {
  
  @scala.inline
  def apply(name: String, port: ServiceBackendPort): IngressServiceBackend = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressServiceBackend]
  }
  
  @scala.inline
  implicit class IngressServiceBackendOps[Self <: IngressServiceBackend] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: ServiceBackendPort): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
