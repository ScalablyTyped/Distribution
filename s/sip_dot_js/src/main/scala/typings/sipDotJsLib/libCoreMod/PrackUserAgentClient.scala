package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "PrackUserAgentClient")
@js.native
class PrackUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.PrackUserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
}

