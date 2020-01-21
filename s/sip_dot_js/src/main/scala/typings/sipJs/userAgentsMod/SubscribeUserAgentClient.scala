package typings.sipJs.userAgentsMod

import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typings.sipJs.subscribeUserAgentClientMod.SubscribeUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
}

