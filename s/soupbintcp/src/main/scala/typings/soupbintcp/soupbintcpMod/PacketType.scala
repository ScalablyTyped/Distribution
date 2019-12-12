package typings.soupbintcp.soupbintcpMod

import org.scalablytyped.runtime.TopLevel
import typings.soupbintcp.soupbintcpMod.PacketType.CLIENT_HEARTBEAT
import typings.soupbintcp.soupbintcpMod.PacketType.DEBUG
import typings.soupbintcp.soupbintcpMod.PacketType.END_OF_SESSION
import typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_ACCEPTED
import typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_REJECTED
import typings.soupbintcp.soupbintcpMod.PacketType.LOGIN_REQUEST
import typings.soupbintcp.soupbintcpMod.PacketType.LOGOUT_REQUEST
import typings.soupbintcp.soupbintcpMod.PacketType.SEQUENCED_DATA
import typings.soupbintcp.soupbintcpMod.PacketType.SERVER_HEARTBEAT
import typings.soupbintcp.soupbintcpMod.PacketType.UNSEQUENCED_DATA
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PacketType with Double] = js.native
  /* 0x52 */ @js.native
  object CLIENT_HEARTBEAT extends TopLevel[CLIENT_HEARTBEAT with Double]
  
  /* 0x2b */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 0x5a */ @js.native
  object END_OF_SESSION extends TopLevel[END_OF_SESSION with Double]
  
  /* 0x41 */ @js.native
  object LOGIN_ACCEPTED extends TopLevel[LOGIN_ACCEPTED with Double]
  
  /* 0x4a */ @js.native
  object LOGIN_REJECTED extends TopLevel[LOGIN_REJECTED with Double]
  
  /* 0x4c */ @js.native
  object LOGIN_REQUEST extends TopLevel[LOGIN_REQUEST with Double]
  
  /* 0x4f */ @js.native
  object LOGOUT_REQUEST extends TopLevel[LOGOUT_REQUEST with Double]
  
  /* 0x53 */ @js.native
  object SEQUENCED_DATA extends TopLevel[SEQUENCED_DATA with Double]
  
  /* 0x48 */ @js.native
  object SERVER_HEARTBEAT extends TopLevel[SERVER_HEARTBEAT with Double]
  
  /* 0x55 */ @js.native
  object UNSEQUENCED_DATA extends TopLevel[UNSEQUENCED_DATA with Double]
  
}

