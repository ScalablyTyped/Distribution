package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var `type`: String
  var value: String
}

object AnonValue {
  @scala.inline
  def apply(`type`: String, value: String): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

