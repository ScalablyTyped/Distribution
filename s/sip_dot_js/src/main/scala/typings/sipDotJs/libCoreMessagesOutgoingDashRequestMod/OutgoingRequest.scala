package typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequest extends js.Object {
  /** Delegate providing custom handling of this outgoing request. */
  var delegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  /** The outgoing message. */
  val message: OutgoingRequestMessage = js.native
  /**
    * Sends a CANCEL message targeting this request to the UAS.
    * @param reason Reason for canceling request.
    * @param options Request options bucket.
    */
  def cancel(): Unit = js.native
  def cancel(reason: String): Unit = js.native
  def cancel(reason: String, options: RequestOptions): Unit = js.native
  /**
    * Destroy request.
    */
  def dispose(): Unit = js.native
}

