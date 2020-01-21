package typings.pubnub

import typings.pubnub.mod.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: UserData
  var event: String
  var `type`: String
}

object AnonData {
  @scala.inline
  def apply(data: UserData, event: String, `type`: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

