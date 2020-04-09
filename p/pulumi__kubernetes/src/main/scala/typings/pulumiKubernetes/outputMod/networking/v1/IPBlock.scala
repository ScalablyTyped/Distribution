package typings.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24","2001:db9::/64") that is allowed to
  * the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that
  * should not be included within this rule.
  */
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or
    * "2001:db9::/64"
    */
  val cidr: String
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside
    * the CIDR range
    */
  val except: js.Array[String]
}

object IPBlock {
  @scala.inline
  def apply(cidr: String, except: js.Array[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], except = except.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPBlock]
  }
}

