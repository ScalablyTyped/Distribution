package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIp extends js.Object {
  var ip: String
  var port: Double
  var secure: Boolean
}

object AnonIp {
  @scala.inline
  def apply(ip: String, port: Double, secure: Boolean): AnonIp = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIp]
  }
}

