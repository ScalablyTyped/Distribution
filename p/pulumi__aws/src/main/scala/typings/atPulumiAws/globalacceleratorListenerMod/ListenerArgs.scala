package typings.atPulumiAws.globalacceleratorListenerMod

import typings.atPulumiAws.typesInputMod.globalaccelerator.ListenerPortRange
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: Input[String] = js.native
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: js.UndefOr[Input[String]] = js.native
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: Input[js.Array[Input[ListenerPortRange]]] = js.native
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: Input[String] = js.native
}

object ListenerArgs {
  @scala.inline
  def apply(
    acceleratorArn: Input[String],
    portRanges: Input[js.Array[Input[ListenerPortRange]]],
    protocol: Input[String],
    clientAffinity: Input[String] = null
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(acceleratorArn = acceleratorArn.asInstanceOf[js.Any], portRanges = portRanges.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (clientAffinity != null) __obj.updateDynamic("clientAffinity")(clientAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
}

