package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReInviteUserAgentClient")
@js.native
open class ReInviteUserAgentClient protected ()
  extends typings.sipJs.libCoreMod.ReInviteUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog, delegate: Unit, options: RequestOptions) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}
