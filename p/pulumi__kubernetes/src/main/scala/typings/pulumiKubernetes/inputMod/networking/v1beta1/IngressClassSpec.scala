package typings.pulumiKubernetes.inputMod.networking.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressClassSpec provides information about the class of an Ingress.
  */
trait IngressClassSpec extends js.Object {
  /**
    * Controller refers to the name of the controller that should handle this class. This allows
    * for different "flavors" that are controlled by the same controller. For example, you may
    * have different Parameters for the same implementing controller. This should be specified as
    * a domain-prefixed path no more than 250 characters in length, e.g.
    * "acme.io/ingress-controller". This field is immutable.
    */
  var controller: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parameters is a link to a custom resource containing additional configuration for the
    * controller. This is optional if the controller does not require extra parameters.
    */
  var parameters: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
}

object IngressClassSpec {
  @scala.inline
  def apply(controller: Input[String] = null, parameters: Input[TypedLocalObjectReference] = null): IngressClassSpec = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressClassSpec]
  }
}

