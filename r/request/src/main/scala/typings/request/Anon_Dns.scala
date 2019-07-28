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
    val __obj = js.Dynamic.literal(dns = dns, download = download, firstByte = firstByte, tcp = tcp, total = total, wait = wait)
  
    __obj.asInstanceOf[Anon_Dns]
  }
}

