package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "InfoUserAgentClient")
@js.native
open class InfoUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.InfoUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: typings.sipJs.libCoreDialogsMod.SessionDialog, delegate: Unit, options: RequestOptions) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
