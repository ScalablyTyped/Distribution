package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCError")
@js.native
class RTCErrorCls () extends RTCError {
  def this(errorDetail: java.lang.String) = this()
  def this(errorDetail: java.lang.String, message: java.lang.String) = this()
  /* CompleteClass */
  override var errorDetail: java.lang.String = js.native
  /* CompleteClass */
  override var httpRequestStatusCode: Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var receivedAlert: Double | Null = js.native
  /* CompleteClass */
  override var sctpCauseCode: Double = js.native
  /* CompleteClass */
  override var sdpLineNumber: Double = js.native
  /* CompleteClass */
  override var sentAlert: Double | Null = js.native
}

