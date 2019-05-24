package typings
package sipDotJsLib.libCoreMessagesMethodsInviteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingInviteRequest
  extends sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest {
  /** Delegate providing custom handling of this outgoing INVITE request. */
  @JSName("delegate")
  var delegate_OutgoingInviteRequest: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
}

