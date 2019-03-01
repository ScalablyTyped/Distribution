package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackendsListener extends js.Object {
  var backends: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var listener: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_HealthCheckPortMapping]] = js.undefined
  var serviceDiscovery: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DnsAnonServiceNameInput]] = js.undefined
}

object Anon_BackendsListener {
  @scala.inline
  def apply(
    backends: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    listener: atPulumiPulumiLib.outputMod.Input[Anon_HealthCheckPortMapping] = null,
    serviceDiscovery: atPulumiPulumiLib.outputMod.Input[Anon_DnsAnonServiceNameInput] = null
  ): Anon_BackendsListener = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackendsListener]
  }
}

