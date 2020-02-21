package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: AnonData
}

object AnonMessage {
  @scala.inline
  def apply(message: AnonData): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

