package typings
package sipDotJsLib.libCoreMessagesIncomingDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingResponse extends js.Object {
  /** The incoming message. */
  val message: sipDotJsLib.libSIPMessageMod.IncomingResponse
}

object IncomingResponse {
  @scala.inline
  def apply(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): IncomingResponse = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IncomingResponse]
  }
}

