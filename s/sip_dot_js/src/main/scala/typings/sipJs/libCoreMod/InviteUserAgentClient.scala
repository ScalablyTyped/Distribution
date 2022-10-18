package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "InviteUserAgentClient")
@js.native
open class InviteUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.InviteUserAgentClient {
  def this(
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}
