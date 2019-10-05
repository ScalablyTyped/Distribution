package typings.atPulumiKubernetes.typesOutputMod.networking.v1

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
  val cidr: String
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  val except: js.Array[String]
}

object IPBlock {
  @scala.inline
  def apply(cidr: String, except: js.Array[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr, except = except)
  
    __obj.asInstanceOf[IPBlock]
  }
}

