package typings.sipDotJs.libCoreMessagesMethodsSubscribeMod

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingSubscribeRequest extends OutgoingRequest {
  /** Delegate providing custom handling of this outgoing SUBSCRIBE request. */
  @JSName("delegate")
  var delegate_OutgoingSubscribeRequest: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): Unit = js.native
}

