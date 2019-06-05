package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.ReSubscribeUserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
}

