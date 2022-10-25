package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SubscribeUserAgentClient")
@js.native
open class SubscribeUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.SubscribeUserAgentClient {
  def this(
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}
