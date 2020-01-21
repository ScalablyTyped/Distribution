package typings.pulumiAws.inputMod.globalaccelerator

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorIpSet extends js.Object {
  /**
    * The array of IP addresses in the IP address set.
    */
  var ipAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: js.UndefOr[Input[String]] = js.native
}

object AcceleratorIpSet {
  @scala.inline
  def apply(ipAddresses: Input[js.Array[Input[String]]] = null, ipFamily: Input[String] = null): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal()
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (ipFamily != null) __obj.updateDynamic("ipFamily")(ipFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorIpSet]
  }
}

