package typings.atPulumiAws.wafregionalIpSetMod

import typings.atPulumiAws.Anon_TypeValueInputString
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpSetArgs extends js.Object {
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[Anon_TypeValueInputString]]]] = js.undefined
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object IpSetArgs {
  @scala.inline
  def apply(
    ipSetDescriptors: Input[js.Array[Input[Anon_TypeValueInputString]]] = null,
    name: Input[String] = null
  ): IpSetArgs = {
    val __obj = js.Dynamic.literal()
    if (ipSetDescriptors != null) __obj.updateDynamic("ipSetDescriptors")(ipSetDescriptors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetArgs]
  }
}

