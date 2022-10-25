package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ByeUserAgentClient")
@js.native
open class ByeUserAgentClient protected ()
  extends typings.sipJs.libCoreMod.ByeUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: OutgoingRequestDelegate
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
