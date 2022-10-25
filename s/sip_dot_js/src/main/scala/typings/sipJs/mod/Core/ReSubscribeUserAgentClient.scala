package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentClient")
@js.native
open class ReSubscribeUserAgentClient protected ()
  extends typings.sipJs.libCoreMod.ReSubscribeUserAgentClient {
  def this(dialog: typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
