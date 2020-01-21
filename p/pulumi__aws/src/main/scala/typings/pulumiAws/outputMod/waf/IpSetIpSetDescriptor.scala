package typings.pulumiAws.outputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetIpSetDescriptor extends js.Object {
  /**
    * Type of the IP address - `IPV4` or `IPV6`.
    */
  var `type`: String = js.native
  /**
    * An IPv4 or IPv6 address specified via CIDR notation.
    * e.g. `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
    */
  var value: String = js.native
}

object IpSetIpSetDescriptor {
  @scala.inline
  def apply(`type`: String, value: String): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
}

