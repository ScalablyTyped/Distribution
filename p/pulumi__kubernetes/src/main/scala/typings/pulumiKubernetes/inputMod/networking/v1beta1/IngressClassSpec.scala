package typings.pulumiKubernetes.inputMod.networking.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressClassSpec provides information about the class of an Ingress.
  */
@js.native
trait IngressClassSpec extends js.Object {
  
  /**
    * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
    */
  var controller: js.UndefOr[Input[String]] = js.native
  
  /**
    * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
    */
  var parameters: js.UndefOr[Input[TypedLocalObjectReference]] = js.native
}
object IngressClassSpec {
  
  @scala.inline
  def apply(): IngressClassSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressClassSpec]
  }
  
  @scala.inline
  implicit class IngressClassSpecOps[Self <: IngressClassSpec] (val x: Self) extends AnyVal {
    
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
    def setController(value: Input[String]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[TypedLocalObjectReference]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
