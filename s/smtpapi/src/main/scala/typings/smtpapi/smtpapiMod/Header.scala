package typings.smtpapi.smtpapiMod

import typings.smtpapi.smtpapiStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var asm_group_id: Double
  var category: js.Array[String]
  var filters: js.Object
  var ip_pool: String
  var section: js.Object
  var send_at: Empty | Double
  var send_each_at: js.Array[Double]
  var sub: js.Object
  var to: js.Array[String]
  var unique_args: js.Object
}

object Header {
  @scala.inline
  def apply(
    asm_group_id: Double,
    category: js.Array[String],
    filters: js.Object,
    ip_pool: String,
    section: js.Object,
    send_at: Empty | Double,
    send_each_at: js.Array[Double],
    sub: js.Object,
    to: js.Array[String],
    unique_args: js.Object
  ): Header = {
    val __obj = js.Dynamic.literal(asm_group_id = asm_group_id, category = category, filters = filters, ip_pool = ip_pool, section = section, send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at, sub = sub, to = to, unique_args = unique_args)
  
    __obj.asInstanceOf[Header]
  }
}

