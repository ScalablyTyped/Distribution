package typings.sdp

import typings.sdp.mod.SDPDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdpStrings {
  
  @js.native
  sealed trait host extends StObject
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait inactive extends SDPDirection
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait prflx extends StObject
  @scala.inline
  def prflx: prflx = "prflx".asInstanceOf[prflx]
  
  @js.native
  sealed trait recvonly extends SDPDirection
  @scala.inline
  def recvonly: recvonly = "recvonly".asInstanceOf[recvonly]
  
  @js.native
  sealed trait relay extends StObject
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait rtcp extends StObject
  @scala.inline
  def rtcp: rtcp = "rtcp".asInstanceOf[rtcp]
  
  @js.native
  sealed trait rtp extends StObject
  @scala.inline
  def rtp: rtp = "rtp".asInstanceOf[rtp]
  
  @js.native
  sealed trait sendonly extends SDPDirection
  @scala.inline
  def sendonly: sendonly = "sendonly".asInstanceOf[sendonly]
  
  @js.native
  sealed trait sendrecv extends SDPDirection
  @scala.inline
  def sendrecv: sendrecv = "sendrecv".asInstanceOf[sendrecv]
  
  @js.native
  sealed trait srflx extends StObject
  @scala.inline
  def srflx: srflx = "srflx".asInstanceOf[srflx]
  
  @js.native
  sealed trait tcp extends StObject
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait udp extends StObject
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
}
