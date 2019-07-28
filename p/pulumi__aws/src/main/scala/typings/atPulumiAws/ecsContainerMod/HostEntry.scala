package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostEntry extends js.Object {
  var hostname: String
  var ipAddress: String
}

object HostEntry {
  @scala.inline
  def apply(hostname: String, ipAddress: String): HostEntry = {
    val __obj = js.Dynamic.literal(hostname = hostname, ipAddress = ipAddress)
  
    __obj.asInstanceOf[HostEntry]
  }
}

