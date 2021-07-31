package typings.std.global

import typings.std.AlgorithmIdentifier
import typings.std.RTCConfiguration
import typings.std.RTCIceServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCPeerConnection")
@js.native
class RTCPeerConnection ()
  extends StObject
     with typings.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}
object RTCPeerConnection {
  
  @JSGlobal("RTCPeerConnection")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typings.std.RTCCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCertificate")(keygenAlgorithm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.RTCCertificate]]
  
  @scala.inline
  def getDefaultIceServers(): js.Array[RTCIceServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultIceServers")().asInstanceOf[js.Array[RTCIceServer]]
}
