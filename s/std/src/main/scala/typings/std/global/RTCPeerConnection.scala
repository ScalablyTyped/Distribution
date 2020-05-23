package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.AlgorithmIdentifier
import typings.std.RTCConfiguration
import typings.std.RTCIceServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCPeerConnection")
@js.native
class RTCPeerConnection ()
  extends typings.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}

@JSGlobal("RTCPeerConnection")
@js.native
object RTCPeerConnection
  extends Instantiable0[typings.std.RTCPeerConnection]
     with Instantiable1[/* configuration */ RTCConfiguration, typings.std.RTCPeerConnection] {
  def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typings.std.RTCCertificate] = js.native
  def getDefaultIceServers(): js.Array[RTCIceServer] = js.native
}

