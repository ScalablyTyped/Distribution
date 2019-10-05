package typings.atPulumiKubernetes.typesInputMod.networking.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackend extends js.Object {
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
  def apply(serviceName: Input[String], servicePort: Input[Double | String]): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IngressBackend]
  }
}

