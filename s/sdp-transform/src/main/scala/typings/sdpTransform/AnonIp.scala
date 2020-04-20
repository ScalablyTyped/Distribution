package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIp extends js.Object {
  var ip: String
  var version: Double
}

object AnonIp {
  @scala.inline
  def apply(ip: String, version: Double): AnonIp = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIp]
  }
}

