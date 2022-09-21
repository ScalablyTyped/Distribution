package typings.sipJs.coreMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentClient")
@js.native
open class ReSubscribeUserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.ReSubscribeUserAgentClient {
  def this(dialog: typings.sipJs.dialogsMod.SubscriptionDialog) = this()
  def this(dialog: typings.sipJs.dialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: typings.sipJs.dialogsMod.SubscriptionDialog, delegate: Unit, options: RequestOptions) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
