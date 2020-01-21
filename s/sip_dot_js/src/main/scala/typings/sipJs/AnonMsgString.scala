package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsgString extends js.Object {
  var msg: String
}

object AnonMsgString {
  @scala.inline
  def apply(msg: String): AnonMsgString = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMsgString]
  }
}

