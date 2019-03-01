package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostEntry extends js.Object {
  var hostname: java.lang.String
  var ipAddress: java.lang.String
}

object HostEntry {
  @scala.inline
  def apply(hostname: java.lang.String, ipAddress: java.lang.String): HostEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("ipAddress")(ipAddress)
    __obj.asInstanceOf[HostEntry]
  }
}

