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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("netType")(netType)
    __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.updateDynamic("sessionVersion")(sessionVersion)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Address]
  }
}

