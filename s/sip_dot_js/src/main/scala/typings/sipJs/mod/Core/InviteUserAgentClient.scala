package typings.sipJs.mod.Core

import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typings.sipJs.coreMod.InviteUserAgentClient {
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}
