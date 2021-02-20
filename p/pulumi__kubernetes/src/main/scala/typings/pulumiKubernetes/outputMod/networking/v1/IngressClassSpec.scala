package typings.pulumiKubernetes.outputMod.networking.v1

import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressClassSpec provides information about the class of an Ingress.
  */
@js.native
trait IngressClassSpec extends StObject {
  
  /**
    * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
    */
  var controller: String = js.native
  
  /**
    * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
    */
  var parameters: TypedLocalObjectReference = js.native
}
object IngressClassSpec {
  
  @scala.inline
  def apply(controller: String, parameters: TypedLocalObjectReference): IngressClassSpec = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressClassSpec]
  }
  
  @scala.inline
  implicit class IngressClassSpecMutableBuilder[Self <: IngressClassSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: TypedLocalObjectReference): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
