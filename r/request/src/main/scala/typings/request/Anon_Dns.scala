package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dns extends js.Object {
  var dns: Double
  var download: Double
  var firstByte: Double
  var tcp: Double
  var total: Double
  @JSName("wait")
  var wait_FAnon_Dns: Double
}

object Anon_Dns {
  @scala.inline
  def apply(dns: Double, download: Double, firstByte: Double, tcp: Double, total: Double, wait: Double): Anon_Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dns]
  }
}

