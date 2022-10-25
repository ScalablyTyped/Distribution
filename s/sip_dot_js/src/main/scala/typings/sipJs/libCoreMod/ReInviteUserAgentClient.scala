package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
open class ReInviteUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}
