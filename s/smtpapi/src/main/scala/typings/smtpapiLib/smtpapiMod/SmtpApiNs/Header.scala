package typings
package smtpapiLib.smtpapiMod.SmtpApiNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asm_group_id")(asm_group_id)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("ip_pool")(ip_pool)
    __obj.updateDynamic("section")(section)
    __obj.updateDynamic("send_at")(send_at.asInstanceOf[js.Any])
    __obj.updateDynamic("send_each_at")(send_each_at)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("unique_args")(unique_args)
    __obj.asInstanceOf[Header]
  }
}

