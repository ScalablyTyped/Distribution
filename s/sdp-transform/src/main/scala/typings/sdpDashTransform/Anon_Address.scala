package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var netType: String
  var sessionId: String | Double
  var sessionVersion: Double
  var username: String
}

object Anon_Address {
  @scala.inline
  def apply(
    address: String,
    netType: String,
    sessionId: String | Double,
    sessionVersion: Double,
    username: String
  ): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, netType = netType, sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion, username = username)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

