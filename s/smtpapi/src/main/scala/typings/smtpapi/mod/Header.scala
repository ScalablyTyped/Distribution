package typings.smtpapi.mod

import typings.smtpapi.smtpapiStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var asm_group_id: Double
  var category: js.Array[String]
  var filters: js.Object
  var ip_pool: String
  var section: js.Object
  var send_at: _empty | Double
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
    send_at: _empty | Double,
    send_each_at: js.Array[Double],
    sub: js.Object,
    to: js.Array[String],
    unique_args: js.Object
  ): Header = {
    val __obj = js.Dynamic.literal(asm_group_id = asm_group_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], ip_pool = ip_pool.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], unique_args = unique_args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

