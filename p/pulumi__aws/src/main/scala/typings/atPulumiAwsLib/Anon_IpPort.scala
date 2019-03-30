package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpPort extends js.Object {
  var ip: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IpPort {
  @scala.inline
  def apply(ip: java.lang.String, port: scala.Int | scala.Double = null): Anon_IpPort = {
    val __obj = js.Dynamic.literal(ip = ip)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpPort]
  }
}

