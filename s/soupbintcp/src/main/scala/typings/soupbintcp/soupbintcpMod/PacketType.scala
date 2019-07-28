package typings.soupbintcp.soupbintcpMod

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
  sealed trait CLIENT_HEARTBEAT extends PacketType
  
   // +
  @js.native
  sealed trait DEBUG extends PacketType
  
   // Z
  @js.native
  sealed trait END_OF_SESSION extends PacketType
  
   // A
  @js.native
  sealed trait LOGIN_ACCEPTED extends PacketType
  
   // J
  @js.native
  sealed trait LOGIN_REJECTED extends PacketType
  
   // L
  @js.native
  sealed trait LOGIN_REQUEST extends PacketType
  
  @js.native
  sealed trait LOGOUT_REQUEST extends PacketType
  
   // S
  @js.native
  sealed trait SEQUENCED_DATA extends PacketType
  
   // H
  @js.native
  sealed trait SERVER_HEARTBEAT extends PacketType
  
   // U
  @js.native
  sealed trait UNSEQUENCED_DATA extends PacketType
  
  /* 0x52 */ val CLIENT_HEARTBEAT: typings.soupbintcp.soupbintcpMod.PacketType.CLIENT_HEARTBEAT with Double = js.native
  /* 0x2b */ val DEBUG: typings.soupbintcp.soupbintcpMod.PacketType.DEBUG with Double = js.native
  /* 0x5a */ val END_OF_SESSION: typings.soupbintcp.soupbintcpMod.PacketType.END_OF_SESSION with Double = js.native
  /* 0x41 */ val LOGIN_ACCEPTED: typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_ACCEPTED with Double = js.native
  /* 0x4a */ val LOGIN_REJECTED: typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_REJECTED with Double = js.native
  /* 0x4c */ val LOGIN_REQUEST: typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_REQUEST with Double = js.native
  /* 0x4f */ val LOGOUT_REQUEST: typings.soupbintcp.soupbintcpMod.PacketType.LOGOUT_REQUEST with Double = js.native
  /* 0x53 */ val SEQUENCED_DATA: typings.soupbintcp.soupbintcpMod.PacketType.SEQUENCED_DATA with Double = js.native
  /* 0x48 */ val SERVER_HEARTBEAT: typings.soupbintcp.soupbintcpMod.PacketType.SERVER_HEARTBEAT with Double = js.native
  /* 0x55 */ val UNSEQUENCED_DATA: typings.soupbintcp.soupbintcpMod.PacketType.UNSEQUENCED_DATA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PacketType with Double] = js.native
}

