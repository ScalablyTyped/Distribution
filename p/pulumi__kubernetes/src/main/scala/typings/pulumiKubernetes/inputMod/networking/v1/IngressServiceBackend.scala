package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
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
  var name: Input[String] = js.native
  
  /**
    * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
    */
  var port: js.UndefOr[Input[ServiceBackendPort]] = js.native
}
object IngressServiceBackend {
  
  @scala.inline
  def apply(name: Input[String]): IngressServiceBackend = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressServiceBackend]
  }
  
  @scala.inline
  implicit class IngressServiceBackendMutableBuilder[Self <: IngressServiceBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Input[ServiceBackendPort]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
