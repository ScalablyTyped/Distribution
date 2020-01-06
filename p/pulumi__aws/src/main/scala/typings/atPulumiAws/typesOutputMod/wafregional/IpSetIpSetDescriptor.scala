package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetIpSetDescriptor extends js.Object {
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: String = js.native
  /**
    * The CIDR notation.
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

