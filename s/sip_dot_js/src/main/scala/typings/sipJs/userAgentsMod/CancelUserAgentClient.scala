package typings.sipJs.userAgentsMod

import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typings.sipJs.cancelUserAgentClientMod.CancelUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

