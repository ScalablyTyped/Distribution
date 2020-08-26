package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeAddress contains information for the node's address.
  */
@js.native
trait NodeAddress extends js.Object {
  /**
    * The node address.
    */
  var address: Input[String] = js.native
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  var `type`: Input[String] = js.native
}

object NodeAddress {
  @scala.inline
  def apply(address: Input[String], `type`: Input[String]): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
  @scala.inline
  implicit class NodeAddressOps[Self <: NodeAddress] (val x: Self) extends AnyVal {
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
    def setAddress(value: Input[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

