package typings.atPulumiAws.typesOutputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorIpSet extends js.Object {
  /**
    * The array of IP addresses in the IP address set.
    */
  var ipAddresses: js.Array[String]
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: String
}

object AcceleratorIpSet {
  @scala.inline
  def apply(ipAddresses: js.Array[String], ipFamily: String): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal(ipAddresses = ipAddresses, ipFamily = ipFamily)
  
    __obj.asInstanceOf[AcceleratorIpSet]
  }
}

