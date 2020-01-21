package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorIpSet extends js.Object {
  /**
    * The array of IP addresses in the IP address set.
    */
  var ipAddresses: js.Array[String] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: String = js.native
}

object AcceleratorIpSet {
  @scala.inline
  def apply(ipAddresses: js.Array[String], ipFamily: String): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal(ipAddresses = ipAddresses.asInstanceOf[js.Any], ipFamily = ipFamily.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AcceleratorIpSet]
  }
}

