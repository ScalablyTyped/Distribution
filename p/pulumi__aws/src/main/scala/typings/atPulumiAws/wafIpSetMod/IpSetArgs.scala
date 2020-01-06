package typings.atPulumiAws.wafIpSetMod

import typings.atPulumiAws.typesInputMod.waf.IpSetIpSetDescriptor
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetArgs extends js.Object {
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[IpSetIpSetDescriptor]]]] = js.native
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object IpSetArgs {
  @scala.inline
  def apply(ipSetDescriptors: Input[js.Array[Input[IpSetIpSetDescriptor]]] = null, name: Input[String] = null): IpSetArgs = {
    val __obj = js.Dynamic.literal()
    if (ipSetDescriptors != null) __obj.updateDynamic("ipSetDescriptors")(ipSetDescriptors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetArgs]
  }
}

