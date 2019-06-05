package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "PublishUserAgentClient")
@js.native
class PublishUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.PublishUserAgentClient {
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
}

