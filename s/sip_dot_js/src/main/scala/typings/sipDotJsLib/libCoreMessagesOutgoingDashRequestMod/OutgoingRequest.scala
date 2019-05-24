package typings
package sipDotJsLib.libCoreMessagesOutgoingDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequest extends js.Object {
  /** Delegate providing custom handling of this outgoing request. */
  var delegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  /** The outgoing message. */
  val message: sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  /**
    * Sends a CANCEL message targeting this request to the UAS.
    * @param reason Reason for canceling request.
    * @param options Request options bucket.
    */
  def cancel(): scala.Unit = js.native
  def cancel(reason: java.lang.String): scala.Unit = js.native
  def cancel(reason: java.lang.String, options: RequestOptions): scala.Unit = js.native
  /**
    * Destroy request.
    */
  def dispose(): scala.Unit = js.native
}

