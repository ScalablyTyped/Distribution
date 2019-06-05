package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.ReferUserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
}

