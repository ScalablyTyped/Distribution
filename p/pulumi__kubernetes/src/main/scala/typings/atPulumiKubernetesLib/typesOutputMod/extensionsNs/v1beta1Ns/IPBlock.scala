package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock.
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
  * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
  * not be included within this rule.
  */
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
    */
  val cidr: java.lang.String
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  val except: js.Array[java.lang.String]
}

object IPBlock {
  @scala.inline
  def apply(cidr: java.lang.String, except: js.Array[java.lang.String]): IPBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cidr")(cidr)
    __obj.updateDynamic("except")(except)
    __obj.asInstanceOf[IPBlock]
  }
}

