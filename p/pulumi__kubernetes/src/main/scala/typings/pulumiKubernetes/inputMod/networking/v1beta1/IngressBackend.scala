package typings.pulumiKubernetes.inputMod.networking.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
@js.native
trait IngressBackend extends js.Object {
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: js.UndefOr[Input[TypedLocalObjectReference]] = js.native
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: Input[String] = js.native
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: Input[Double | String] = js.native
}

object IngressBackend {
  @scala.inline
  def apply(serviceName: Input[String], servicePort: Input[Double | String]): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
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
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServicePort(value: Input[Double | String]): Self = this.set("servicePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Input[TypedLocalObjectReference]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

