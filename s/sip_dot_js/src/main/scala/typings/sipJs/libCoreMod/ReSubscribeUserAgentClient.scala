package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentClient")
@js.native
open class ReSubscribeUserAgentClient protected ()
  extends typings.sipJs.libCoreUserAgentsMod.ReSubscribeUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(dialog: typings.sipJs.libCoreDialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
