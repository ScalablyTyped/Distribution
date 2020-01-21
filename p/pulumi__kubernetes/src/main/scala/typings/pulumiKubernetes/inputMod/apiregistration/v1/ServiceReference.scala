package typings.pulumiKubernetes.inputMod.apiregistration.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReference extends js.Object {
  /**
    * Name is the name of the service
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Namespace is the namespace of the service
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward
    * compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
}

object ServiceReference {
  @scala.inline
  def apply(name: Input[String] = null, namespace: Input[String] = null, port: Input[Double] = null): ServiceReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceReference]
  }
}

