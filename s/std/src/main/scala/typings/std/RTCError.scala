package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCError extends Error {
  var errorDetail: java.lang.String
  var httpRequestStatusCode: Double
  var receivedAlert: Double | Null
  var sctpCauseCode: Double
  var sdpLineNumber: Double
  var sentAlert: Double | Null
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable0[RTCError]
     with Instantiable1[/* errorDetail */ java.lang.String, RTCError]
     with Instantiable2[/* errorDetail */ java.lang.String, /* message */ java.lang.String, RTCError]

