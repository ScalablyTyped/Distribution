package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpec extends js.Object {
  /**
    * The backends to which the virtual node is expected to send outbound traffic.
    */
  var backends: js.UndefOr[js.Array[VirtualNodeSpecBackend]] = js.undefined
  /**
    * The listeners from which the virtual node is expected to receive inbound traffic.
    */
  var listener: js.UndefOr[VirtualNodeSpecListener] = js.undefined
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[VirtualNodeSpecLogging] = js.undefined
  /**
    * The service discovery information for the virtual node.
    */
  var serviceDiscovery: js.UndefOr[VirtualNodeSpecServiceDiscovery] = js.undefined
}

object VirtualNodeSpec {
  @scala.inline
  def apply(
    backends: js.Array[VirtualNodeSpecBackend] = null,
    listener: VirtualNodeSpecListener = null,
    logging: VirtualNodeSpecLogging = null,
    serviceDiscovery: VirtualNodeSpecServiceDiscovery = null
  ): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends)
    if (listener != null) __obj.updateDynamic("listener")(listener)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery)
    __obj.asInstanceOf[VirtualNodeSpec]
  }
}

