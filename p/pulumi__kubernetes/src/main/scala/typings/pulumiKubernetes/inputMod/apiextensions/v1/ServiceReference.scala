package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReference extends js.Object {
  /**
    * name is the name of the service. Required
    */
  var name: Input[String]
  /**
    * namespace is the namespace of the service. Required
    */
  var namespace: Input[String]
  /**
    * path is an optional URL path at which the webhook will be contacted.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  /**
    * port is an optional service port at which the webhook will be contacted. `port` should be a
    * valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
}

object ServiceReference {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    path: Input[String] = null,
    port: Input[Double] = null
  ): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceReference]
  }
}

