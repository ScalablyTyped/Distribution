package typings.pulumiAws.globalacceleratorListenerMod

import typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    protocol: Input[String]
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(acceleratorArn = acceleratorArn.asInstanceOf[js.Any], portRanges = portRanges.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
  
  @scala.inline
  implicit class ListenerArgsOps[Self <: ListenerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceleratorArn(value: Input[String]): Self = this.set("acceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRangesVarargs(value: Input[ListenerPortRange]*): Self = this.set("portRanges", js.Array(value :_*))
    
    @scala.inline
    def setPortRanges(value: Input[js.Array[Input[ListenerPortRange]]]): Self = this.set("portRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAffinity(value: Input[String]): Self = this.set("clientAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAffinity: Self = this.set("clientAffinity", js.undefined)
  }
}
