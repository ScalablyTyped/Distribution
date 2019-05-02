package typings
package simplecrawlerLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfo extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var internal: scala.Boolean
  var mac: java.lang.String
  var netmask: java.lang.String
}

object NetworkInterfaceInfo {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: java.lang.String,
    internal: scala.Boolean,
    mac: java.lang.String,
    netmask: java.lang.String
  ): NetworkInterfaceInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family, internal = internal, mac = mac, netmask = netmask)
  
    __obj.asInstanceOf[NetworkInterfaceInfo]
  }
}

