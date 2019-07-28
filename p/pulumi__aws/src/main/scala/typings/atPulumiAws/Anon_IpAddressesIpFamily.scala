package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpAddressesIpFamily extends js.Object {
  var ipAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var ipFamily: js.UndefOr[Input[String]] = js.undefined
}

object Anon_IpAddressesIpFamily {
  @scala.inline
  def apply(ipAddresses: Input[js.Array[Input[String]]] = null, ipFamily: Input[String] = null): Anon_IpAddressesIpFamily = {
    val __obj = js.Dynamic.literal()
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (ipFamily != null) __obj.updateDynamic("ipFamily")(ipFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpAddressesIpFamily]
  }
}

