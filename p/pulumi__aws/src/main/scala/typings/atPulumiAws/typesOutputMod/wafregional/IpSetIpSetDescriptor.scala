package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpSetIpSetDescriptor extends js.Object {
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: String
  /**
    * The CIDR notation.
    */
  var value: String
}

object IpSetIpSetDescriptor {
  @scala.inline
  def apply(`type`: String, value: String): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
}

