package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCError extends DOMException {
  val errorDetail: RTCErrorDetailType
  val httpRequestStatusCode: Double | Null
  val receivedAlert: Double | Null
  val sctpCauseCode: Double | Null
  val sdpLineNumber: Double | Null
  val sentAlert: Double | Null
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable1[/* init */ RTCErrorInit, RTCError]
     with Instantiable2[/* init */ RTCErrorInit, /* message */ java.lang.String, RTCError]

