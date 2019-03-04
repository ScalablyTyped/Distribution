package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var netType: java.lang.String
  var sessionId: java.lang.String | scala.Double
  var sessionVersion: scala.Double
  var username: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String,
    netType: java.lang.String,
    sessionId: java.lang.String | scala.Double,
    sessionVersion: scala.Double,
    username: java.lang.String
  ): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, netType = netType, sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion, username = username)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

