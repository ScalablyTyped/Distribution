package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpAddressesIpFamily extends js.Object {
  var ipAddresses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var ipFamily: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_IpAddressesIpFamily {
  @scala.inline
  def apply(
    ipAddresses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    ipFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_IpAddressesIpFamily = {
    val __obj = js.Dynamic.literal()
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (ipFamily != null) __obj.updateDynamic("ipFamily")(ipFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpAddressesIpFamily]
  }
}

