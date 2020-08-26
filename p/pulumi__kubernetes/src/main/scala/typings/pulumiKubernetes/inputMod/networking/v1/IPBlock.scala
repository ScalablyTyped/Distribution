package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24","2001:db9::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
  */
@js.native
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64"
    */
  var cidr: Input[String] = js.native
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range
    */
  var except: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object IPBlock {
  @scala.inline
  def apply(cidr: Input[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
  @scala.inline
  implicit class IPBlockOps[Self <: IPBlock] (val x: Self) extends AnyVal {
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
    def setCidr(value: Input[String]): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptVarargs(value: Input[String]*): Self = this.set("except", js.Array(value :_*))
    @scala.inline
    def setExcept(value: Input[js.Array[Input[String]]]): Self = this.set("except", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
  }
  
}

