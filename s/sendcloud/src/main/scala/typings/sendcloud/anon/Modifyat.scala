package typings.sendcloud.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifyat extends js.Object {
  var address: String
  var created_at: String
  var modify_at: String
  var name: String
  var subscribed: String
  var vars: js.Object
}

object Modifyat {
  @scala.inline
  def apply(
    address: String,
    created_at: String,
    modify_at: String,
    name: String,
    subscribed: String,
    vars: js.Object
  ): Modifyat = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifyat]
  }
}

