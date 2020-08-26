package typings.sipJs.mod

import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Message")
@js.native
class Message protected ()
  extends typings.sipJs.apiMod.Message {
  /** @internal */
  def this(incomingMessageRequest: IncomingMessageRequest) = this()
}

