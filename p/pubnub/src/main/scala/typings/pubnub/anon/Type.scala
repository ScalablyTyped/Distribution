package typings.pubnub.anon

import typings.pubnub.mod.MembershipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var data: MembershipData
  var event: String
  var `type`: String
}

object Type {
  @scala.inline
  def apply(data: MembershipData, event: String, `type`: String): Type = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

