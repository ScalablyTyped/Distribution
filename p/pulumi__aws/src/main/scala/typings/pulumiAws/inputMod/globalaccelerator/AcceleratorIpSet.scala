package typings.pulumiAws.inputMod.globalaccelerator

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorIpSet extends js.Object {
  /**
    * A list of IP addresses in the IP address set.
    */
  var ipAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: js.UndefOr[Input[String]] = js.native
}

object AcceleratorIpSet {
  @scala.inline
  def apply(): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorIpSet]
  }
  @scala.inline
  implicit class AcceleratorIpSetOps[Self <: AcceleratorIpSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIpAddressesVarargs(value: Input[String]*): Self = this.set("ipAddresses", js.Array(value :_*))
    @scala.inline
    def setIpAddresses(value: Input[js.Array[Input[String]]]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddresses: Self = this.set("ipAddresses", js.undefined)
    @scala.inline
    def setIpFamily(value: Input[String]): Self = this.set("ipFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpFamily: Self = this.set("ipFamily", js.undefined)
  }
  
}

