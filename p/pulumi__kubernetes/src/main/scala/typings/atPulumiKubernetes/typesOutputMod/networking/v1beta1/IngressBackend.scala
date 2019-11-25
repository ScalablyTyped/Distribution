package typings.atPulumiKubernetes.typesOutputMod.networking.v1beta1

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
  val serviceName: String
  /**
    * Specifies the port of the referenced service.
    */
  val servicePort: Double | String
}

object IngressBackend {
  @scala.inline
  def apply(serviceName: String, servicePort: Double | String): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IngressBackend]
  }
}

