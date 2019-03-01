package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backends extends js.Object {
  var backends: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var listener: js.UndefOr[Anon_HealthCheck] = js.undefined
  var serviceDiscovery: js.UndefOr[Anon_Dns] = js.undefined
}

object Anon_Backends {
  @scala.inline
  def apply(
    backends: js.Array[java.lang.String] = null,
    listener: Anon_HealthCheck = null,
    serviceDiscovery: Anon_Dns = null
  ): Anon_Backends = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends)
    if (listener != null) __obj.updateDynamic("listener")(listener)
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery)
    __obj.asInstanceOf[Anon_Backends]
  }
}

