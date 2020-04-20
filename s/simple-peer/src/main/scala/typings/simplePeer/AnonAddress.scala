package typings.simplePeer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var family: String
  var port: String
}

object AnonAddress {
  @scala.inline
  def apply(address: String, family: String, port: String): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

