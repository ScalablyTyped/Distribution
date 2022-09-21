package typings.std.global

import typings.std.RTCIceCandidateInit
import typings.std.RTCIceCandidateType
import typings.std.RTCIceComponent
import typings.std.RTCIceProtocol
import typings.std.RTCIceTcpCandidateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCIceCandidate")
@js.native
/* standard dom */
open class RTCIceCandidate ()
  extends StObject
     with typings.std.RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val address: java.lang.String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val component: RTCIceComponent | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val foundation: java.lang.String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val port: Double | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val priority: Double | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val protocol: RTCIceProtocol | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val relatedAddress: java.lang.String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val relatedPort: Double | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val sdpMLineIndex: Double | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val sdpMid: java.lang.String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val usernameFragment: java.lang.String | Null = js.native
}
