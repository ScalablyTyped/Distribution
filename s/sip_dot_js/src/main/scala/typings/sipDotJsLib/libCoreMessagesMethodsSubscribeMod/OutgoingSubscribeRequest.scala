package typings
package sipDotJsLib.libCoreMessagesMethodsSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingSubscribeRequest
  extends sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest {
  /** Delegate providing custom handling of this outgoing SUBSCRIBE request. */
  @JSName("delegate")
  var delegate_OutgoingSubscribeRequest: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): scala.Unit = js.native
}

