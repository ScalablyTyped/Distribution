package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backends extends js.Object {
  var backends: js.UndefOr[js.Array[Anon_VirtualService]] = js.undefined
  var listener: js.UndefOr[Anon_HealthCheck] = js.undefined
  var logging: js.UndefOr[Anon_AccessLog] = js.undefined
  var serviceDiscovery: js.UndefOr[Anon_AwsCloudMap] = js.undefined
}

object Anon_Backends {
  @scala.inline
  def apply(
    backends: js.Array[Anon_VirtualService] = null,
    listener: Anon_HealthCheck = null,
    logging: Anon_AccessLog = null,
    serviceDiscovery: Anon_AwsCloudMap = null
  ): Anon_Backends = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends)
    if (listener != null) __obj.updateDynamic("listener")(listener)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery)
    __obj.asInstanceOf[Anon_Backends]
  }
}

