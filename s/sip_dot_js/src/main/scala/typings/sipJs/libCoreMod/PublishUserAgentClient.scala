package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "PublishUserAgentClient")
@js.native
open class PublishUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.PublishUserAgentClient {
  def this(
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
