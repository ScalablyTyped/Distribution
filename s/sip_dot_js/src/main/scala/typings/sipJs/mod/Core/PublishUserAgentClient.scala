package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.PublishUserAgentClient")
@js.native
open class PublishUserAgentClient protected ()
  extends typings.sipJs.libCoreMod.PublishUserAgentClient {
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
