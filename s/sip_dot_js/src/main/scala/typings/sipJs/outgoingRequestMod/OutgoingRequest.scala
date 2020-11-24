package typings.sipJs.outgoingRequestMod

import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingRequest extends js.Object {
  
  /**
    * Sends a CANCEL message targeting this request to the UAS.
    * @param reason - Reason for canceling request.
    * @param options - Request options bucket.
    */
  def cancel(): Unit = js.native
  def cancel(reason: js.UndefOr[scala.Nothing], options: RequestOptions): Unit = js.native
  def cancel(reason: String): Unit = js.native
  def cancel(reason: String, options: RequestOptions): Unit = js.native
  
  /** Delegate providing custom handling of this outgoing request. */
  var delegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  
  /**
    * Destroy request.
    */
  def dispose(): Unit = js.native
  
  /** The outgoing message. */
  val message: OutgoingRequestMessage = js.native
}
