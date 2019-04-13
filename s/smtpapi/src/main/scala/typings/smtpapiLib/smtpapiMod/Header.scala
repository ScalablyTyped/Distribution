package typings
package smtpapiLib.smtpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var asm_group_id: scala.Double
  var category: js.Array[java.lang.String]
  var filters: js.Object
  var ip_pool: java.lang.String
  var section: js.Object
  var send_at: smtpapiLib.smtpapiLibStrings.Empty | scala.Double
  var send_each_at: js.Array[scala.Double]
  var sub: js.Object
  var to: js.Array[java.lang.String]
  var unique_args: js.Object
}

object Header {
  @scala.inline
  def apply(
    asm_group_id: scala.Double,
    category: js.Array[java.lang.String],
    filters: js.Object,
    ip_pool: java.lang.String,
    section: js.Object,
    send_at: smtpapiLib.smtpapiLibStrings.Empty | scala.Double,
    send_each_at: js.Array[scala.Double],
    sub: js.Object,
    to: js.Array[java.lang.String],
    unique_args: js.Object
  ): Header = {
    val __obj = js.Dynamic.literal(asm_group_id = asm_group_id, category = category, filters = filters, ip_pool = ip_pool, section = section, send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at, sub = sub, to = to, unique_args = unique_args)
  
    __obj.asInstanceOf[Header]
  }
}

