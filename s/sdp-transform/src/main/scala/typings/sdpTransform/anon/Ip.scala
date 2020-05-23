package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ip extends js.Object {
  var ip: String
  var version: Double
}

object Ip {
  @scala.inline
  def apply(ip: String, version: Double): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
}

