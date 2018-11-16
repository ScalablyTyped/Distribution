package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PacketType extends js.Object

@JSImport("soupbintcp", "PacketType")
@js.native
object PacketType extends js.Object {
   // R
  @js.native
  sealed trait CLIENT_HEARTBEAT
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // +
  @js.native
  sealed trait DEBUG
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // Z
  @js.native
  sealed trait END_OF_SESSION
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // A
  @js.native
  sealed trait LOGIN_ACCEPTED
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // J
  @js.native
  sealed trait LOGIN_REJECTED
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // L
  @js.native
  sealed trait LOGIN_REQUEST
    extends soupbintcpLib.soupbintcpMod.PacketType
  
  @js.native
  sealed trait LOGOUT_REQUEST
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // S
  @js.native
  sealed trait SEQUENCED_DATA
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // H
  @js.native
  sealed trait SERVER_HEARTBEAT
    extends soupbintcpLib.soupbintcpMod.PacketType
  
   // U
  @js.native
  sealed trait UNSEQUENCED_DATA
    extends soupbintcpLib.soupbintcpMod.PacketType
  
  /* 0x52 */ val CLIENT_HEARTBEAT: CLIENT_HEARTBEAT with scala.Double = js.native
  /* 0x2b */ val DEBUG: DEBUG with scala.Double = js.native
  /* 0x5a */ val END_OF_SESSION: END_OF_SESSION with scala.Double = js.native
  /* 0x41 */ val LOGIN_ACCEPTED: LOGIN_ACCEPTED with scala.Double = js.native
  /* 0x4a */ val LOGIN_REJECTED: LOGIN_REJECTED with scala.Double = js.native
  /* 0x4c */ val LOGIN_REQUEST: LOGIN_REQUEST with scala.Double = js.native
  /* 0x4f */ val LOGOUT_REQUEST: LOGOUT_REQUEST with scala.Double = js.native
  /* 0x53 */ val SEQUENCED_DATA: SEQUENCED_DATA with scala.Double = js.native
  /* 0x48 */ val SERVER_HEARTBEAT: SERVER_HEARTBEAT with scala.Double = js.native
  /* 0x55 */ val UNSEQUENCED_DATA: UNSEQUENCED_DATA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[soupbintcpLib.soupbintcpMod.PacketType with scala.Double] = js.native
}

