package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetIpSetDescriptor extends js.Object {
  /**
    * Type of the IP address - `IPV4` or `IPV6`.
    */
  var `type`: Input[String] = js.native
  /**
    * An IPv4 or IPv6 address specified via CIDR notation.
    * e.g. `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
    */
  var value: Input[String] = js.native
}

object IpSetIpSetDescriptor {
  @scala.inline
  def apply(`type`: Input[String], value: Input[String]): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
  @scala.inline
  implicit class IpSetIpSetDescriptorOps[Self <: IpSetIpSetDescriptor] (val x: Self) extends AnyVal {
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

