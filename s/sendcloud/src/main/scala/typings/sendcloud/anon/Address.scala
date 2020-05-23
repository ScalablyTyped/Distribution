package typings.sendcloud.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var created_at: String
  var description: String
  var members_count: Double
  var modify_at: String
  var name: String
}

object Address {
  @scala.inline
  def apply(
    address: String,
    created_at: String,
    description: String,
    members_count: Double,
    modify_at: String,
    name: String
  ): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

