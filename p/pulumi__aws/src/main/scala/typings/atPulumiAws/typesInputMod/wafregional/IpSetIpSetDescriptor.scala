package typings.atPulumiAws.typesInputMod.wafregional

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetIpSetDescriptor extends js.Object {
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: Input[String] = js.native
  /**
    * The CIDR notation.
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
}

