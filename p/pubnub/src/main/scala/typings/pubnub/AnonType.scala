package typings.pubnub

import typings.pubnub.mod.MembershipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var data: MembershipData
  var event: String
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(data: MembershipData, event: String, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

