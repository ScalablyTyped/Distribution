package typings.sdp

import typings.sdp.mod.SDPDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdpStrings {
  
  @js.native
  sealed trait host extends StObject
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait inactive
    extends StObject
       with SDPDirection
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait prflx extends StObject
  inline def prflx: prflx = "prflx".asInstanceOf[prflx]
  
  @js.native
  sealed trait recvonly
    extends StObject
       with SDPDirection
  inline def recvonly: recvonly = "recvonly".asInstanceOf[recvonly]
  
  @js.native
  sealed trait relay extends StObject
  inline def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait rtcp extends StObject
  inline def rtcp: rtcp = "rtcp".asInstanceOf[rtcp]
  
  @js.native
  sealed trait rtp extends StObject
  inline def rtp: rtp = "rtp".asInstanceOf[rtp]
  
  @js.native
  sealed trait sendonly
    extends StObject
       with SDPDirection
  inline def sendonly: sendonly = "sendonly".asInstanceOf[sendonly]
  
  @js.native
  sealed trait sendrecv
    extends StObject
       with SDPDirection
  inline def sendrecv: sendrecv = "sendrecv".asInstanceOf[sendrecv]
  
  @js.native
  sealed trait srflx extends StObject
  inline def srflx: srflx = "srflx".asInstanceOf[srflx]
  
  @js.native
  sealed trait tcp extends StObject
  inline def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait udp extends StObject
  inline def udp: udp = "udp".asInstanceOf[udp]
}
