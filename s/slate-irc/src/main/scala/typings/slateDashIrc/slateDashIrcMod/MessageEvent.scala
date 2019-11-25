package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var from: String
  var hostmask: String
  var message: String
  var to: String
}

object MessageEvent {
  @scala.inline
  def apply(from: String, hostmask: String, message: String, to: String): MessageEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
}

