package typings.atPulumiKubernetes.typesInputMod.networking.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
  * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
  * not be included within this rule.
  */
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
    */
  var cidr: Input[String]
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  var except: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object IPBlock {
  @scala.inline
  def apply(cidr: Input[String], except: Input[js.Array[Input[String]]] = null): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
}

