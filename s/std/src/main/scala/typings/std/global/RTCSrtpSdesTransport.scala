package typings.std.global

import org.scalablytyped.runtime.Instantiable3
import typings.std.RTCSrtpSdesParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends typings.std.RTCSrtpSdesTransport {
  def this(
    transport: typings.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}

@JSGlobal("RTCSrtpSdesTransport")
@js.native
object RTCSrtpSdesTransport
  extends Instantiable3[
      /* transport */ typings.std.RTCIceTransport, 
      /* encryptParameters */ RTCSrtpSdesParameters, 
      /* decryptParameters */ RTCSrtpSdesParameters, 
      typings.std.RTCSrtpSdesTransport
    ] {
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}

