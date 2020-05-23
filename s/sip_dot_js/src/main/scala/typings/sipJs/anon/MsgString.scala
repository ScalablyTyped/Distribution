package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgString extends js.Object {
  var msg: String
}

object MsgString {
  @scala.inline
  def apply(msg: String): MsgString = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgString]
  }
}

