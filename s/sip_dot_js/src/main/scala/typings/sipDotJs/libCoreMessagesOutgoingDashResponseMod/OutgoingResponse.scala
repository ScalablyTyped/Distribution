package typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingResponse extends js.Object {
  /** The outgoing message. */
  val message: String
}

object OutgoingResponse {
  @scala.inline
  def apply(message: String): OutgoingResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutgoingResponse]
  }
}

