package typings.pulumiKubernetes.outputMod.networking.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
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
  val resource: TypedLocalObjectReference
  /**
    * Specifies the name of the referenced service.
    */
  val serviceName: String
  /**
    * Specifies the port of the referenced service.
    */
  val servicePort: Double | String
}

object IngressBackend {
  @scala.inline
  def apply(resource: TypedLocalObjectReference, serviceName: String, servicePort: Double | String): IngressBackend = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IngressBackend]
  }
}

