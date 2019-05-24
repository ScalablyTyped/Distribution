package typings
package sipDotJsLib.libCoreMessagesOutgoingDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingResponse extends js.Object {
  /** The outgoing message. */
  val message: java.lang.String
}

object OutgoingResponse {
  @scala.inline
  def apply(message: java.lang.String): OutgoingResponse = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[OutgoingResponse]
  }
}

