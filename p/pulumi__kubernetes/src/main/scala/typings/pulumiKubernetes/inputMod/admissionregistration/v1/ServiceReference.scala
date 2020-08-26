package typings.pulumiKubernetes.inputMod.admissionregistration.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
@js.native
trait ServiceReference extends js.Object {
  /**
    * `name` is the name of the service. Required
    */
  var name: Input[String] = js.native
  /**
    * `namespace` is the namespace of the service. Required
    */
  var namespace: Input[String] = js.native
  /**
    * `path` is an optional URL path which will be sent in any request to this service.
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  var port: js.UndefOr[Input[Double]] = js.native
}

object ServiceReference {
  @scala.inline
  def apply(name: Input[String], namespace: Input[String]): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceReference]
  }
  @scala.inline
  implicit class ServiceReferenceOps[Self <: ServiceReference] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

