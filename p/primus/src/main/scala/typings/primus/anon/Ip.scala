package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ip extends js.Object {
  var ip: String
  var port: Double
  var secure: Boolean
}

object Ip {
  @scala.inline
  def apply(ip: String, port: Double, secure: Boolean): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
}

