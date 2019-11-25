package typings.pubnub

import typings.pubnub.pubnubMod.MembershipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataEventType extends js.Object {
  var data: MembershipData
  var event: String
  var `type`: String
}

object Anon_DataEventType {
  @scala.inline
  def apply(data: MembershipData, event: String, `type`: String): Anon_DataEventType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataEventType]
  }
}

