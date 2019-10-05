package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.SubscribeUserAgentClient {
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}

