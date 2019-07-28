package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackendsListener extends js.Object {
  var backends: js.UndefOr[Input[js.Array[Input[Anon_VirtualServiceAnonVirtualServiceNameInput]]]] = js.undefined
  var listener: js.UndefOr[Input[Anon_HealthCheckPortMapping]] = js.undefined
  var logging: js.UndefOr[Input[Anon_AccessLogAnonFileAnonPathInput]] = js.undefined
  var serviceDiscovery: js.UndefOr[Input[Anon_AwsCloudMapDns]] = js.undefined
}

object Anon_BackendsListener {
  @scala.inline
  def apply(
    backends: Input[js.Array[Input[Anon_VirtualServiceAnonVirtualServiceNameInput]]] = null,
    listener: Input[Anon_HealthCheckPortMapping] = null,
    logging: Input[Anon_AccessLogAnonFileAnonPathInput] = null,
    serviceDiscovery: Input[Anon_AwsCloudMapDns] = null
  ): Anon_BackendsListener = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackendsListener]
  }
}

