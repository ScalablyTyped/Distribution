package typings
package atPulumiAwsLib.wafIpSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpSetArgs extends js.Object {
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeValueInputString]]
    ]
  ] = js.undefined
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IpSetArgs {
  @scala.inline
  def apply(
    ipSetDescriptors: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeValueInputString]]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IpSetArgs = {
    val __obj = js.Dynamic.literal()
    if (ipSetDescriptors != null) __obj.updateDynamic("ipSetDescriptors")(ipSetDescriptors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetArgs]
  }
}

