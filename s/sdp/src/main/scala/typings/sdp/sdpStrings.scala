package typings.sdp

import typings.sdp.mod.SDPDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdpStrings {
  
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @scala.inline
  def prflx: prflx = "prflx".asInstanceOf[prflx]
  
  @scala.inline
  def recvonly: recvonly = "recvonly".asInstanceOf[recvonly]
  
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @scala.inline
  def rtcp: rtcp = "rtcp".asInstanceOf[rtcp]
  
  @scala.inline
  def rtp: rtp = "rtp".asInstanceOf[rtp]
  
  @scala.inline
  def sendonly: sendonly = "sendonly".asInstanceOf[sendonly]
  
  @scala.inline
  def sendrecv: sendrecv = "sendrecv".asInstanceOf[sendrecv]
  
  @scala.inline
  def srflx: srflx = "srflx".asInstanceOf[srflx]
  
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait host extends js.Object
  
  @js.native
  sealed trait inactive extends SDPDirection
  
  @js.native
  sealed trait prflx extends js.Object
  
  @js.native
  sealed trait recvonly extends SDPDirection
  
  @js.native
  sealed trait relay extends js.Object
  
  @js.native
  sealed trait rtcp extends js.Object
  
  @js.native
  sealed trait rtp extends js.Object
  
  @js.native
  sealed trait sendonly extends SDPDirection
  
  @js.native
  sealed trait sendrecv extends SDPDirection
  
  @js.native
  sealed trait srflx extends js.Object
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait udp extends js.Object
}
