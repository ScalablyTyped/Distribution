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
object RTCError
  extends ScalablyTyped.runtime.Instantiable0[RTCError]
     with ScalablyTyped.runtime.Instantiable1[/* errorDetail */ java.lang.String, RTCError]
     with ScalablyTyped.runtime.Instantiable2[/* errorDetail */ java.lang.String, /* message */ java.lang.String, RTCError]

