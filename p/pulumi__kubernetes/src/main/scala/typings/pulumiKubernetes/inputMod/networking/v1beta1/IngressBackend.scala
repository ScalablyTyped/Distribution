package typings.pulumiKubernetes.inputMod.networking.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackend extends js.Object {
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress
    * object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: Input[String]
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: Input[Double | String]
}

object IngressBackend {
  @scala.inline
  def apply(
    serviceName: Input[String],
    servicePort: Input[Double | String],
    resource: Input[TypedLocalObjectReference] = null
  ): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
}

