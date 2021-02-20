package typings.pulumiKubernetes.outputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressServiceBackend references a Kubernetes Service as a Backend.
  */
@js.native
trait IngressServiceBackend extends StObject {
  
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
  implicit class IngressServiceBackendMutableBuilder[Self <: IngressServiceBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: ServiceBackendPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
