package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCError extends Error {
  var errorDetail: java.lang.String
  var httpRequestStatusCode: scala.Double
  var receivedAlert: scala.Double | scala.Null
  var sctpCauseCode: scala.Double
  var sdpLineNumber: scala.Double
  var sentAlert: scala.Double | scala.Null
}

@JSGlobal("RTCError")
@js.native
class RTCErrorCls () extends RTCError {
  def this(errorDetail: java.lang.String) = this()
  def this(errorDetail: java.lang.String, message: java.lang.String) = this()
  /* CompleteClass */
  override var errorDetail: java.lang.String = js.native
  /* CompleteClass */
  override var httpRequestStatusCode: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var receivedAlert: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override var sctpCauseCode: scala.Double = js.native
  /* CompleteClass */
  override var sdpLineNumber: scala.Double = js.native
  /* CompleteClass */
  override var sentAlert: scala.Double | scala.Null = js.native
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends org.scalablytyped.runtime.Instantiable0[RTCError]
     with org.scalablytyped.runtime.Instantiable1[/* errorDetail */ java.lang.String, RTCError]
     with org.scalablytyped.runtime.Instantiable2[/* errorDetail */ java.lang.String, /* message */ java.lang.String, RTCError]

