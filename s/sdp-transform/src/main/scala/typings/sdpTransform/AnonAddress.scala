package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var netType: String
  var sessionId: String | Double
  var sessionVersion: Double
  var username: String
}

object AnonAddress {
  @scala.inline
  def apply(
    address: String,
    netType: String,
    sessionId: String | Double,
    sessionVersion: Double,
    username: String
  ): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

