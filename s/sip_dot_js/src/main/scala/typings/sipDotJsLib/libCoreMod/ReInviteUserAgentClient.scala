package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.ReInviteUserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
}

