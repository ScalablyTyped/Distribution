package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpec extends js.Object {
  /**
    * The backends to which the virtual node is expected to send outbound traffic.
    */
  var backends: js.UndefOr[Input[js.Array[Input[VirtualNodeSpecBackend]]]] = js.native
  /**
    * The listeners from which the virtual node is expected to receive inbound traffic.
    */
  var listener: js.UndefOr[Input[VirtualNodeSpecListener]] = js.native
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Input[VirtualNodeSpecLogging]] = js.native
  /**
    * The service discovery information for the virtual node.
    */
  var serviceDiscovery: js.UndefOr[Input[VirtualNodeSpecServiceDiscovery]] = js.native
}

object VirtualNodeSpec {
  @scala.inline
  def apply(
    backends: Input[js.Array[Input[VirtualNodeSpecBackend]]] = null,
    listener: Input[VirtualNodeSpecListener] = null,
    logging: Input[VirtualNodeSpecLogging] = null,
    serviceDiscovery: Input[VirtualNodeSpecServiceDiscovery] = null
  ): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpec]
  }
}

