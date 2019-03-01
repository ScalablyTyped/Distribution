package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dns extends js.Object {
  var dns: scala.Double
  var download: scala.Double
  var firstByte: scala.Double
  var tcp: scala.Double
  var total: scala.Double
  @JSName("wait")
  var wait_FAnon_Dns: scala.Double
}

object Anon_Dns {
  @scala.inline
  def apply(
    dns: scala.Double,
    download: scala.Double,
    firstByte: scala.Double,
    tcp: scala.Double,
    total: scala.Double,
    wait: scala.Double
  ): Anon_Dns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dns")(dns)
    __obj.updateDynamic("download")(download)
    __obj.updateDynamic("firstByte")(firstByte)
    __obj.updateDynamic("tcp")(tcp)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_Dns]
  }
}

