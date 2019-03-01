package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val serviceName: java.lang.String
  /**
    * Specifies the port of the referenced service.
    */
  val servicePort: scala.Double | java.lang.String
}

object IngressBackend {
  @scala.inline
  def apply(serviceName: java.lang.String, servicePort: scala.Double | java.lang.String): IngressBackend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.updateDynamic("servicePort")(servicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
}

