package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERegionCode extends js.Object

@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends js.Object {
  @js.native
  sealed trait Africa extends ERegionCode
  
  @js.native
  sealed trait Asia extends ERegionCode
  
  @js.native
  sealed trait Australia extends ERegionCode
  
  @js.native
  sealed trait Europe extends ERegionCode
  
  @js.native
  sealed trait MiddleEast extends ERegionCode
  
  @js.native
  sealed trait SouthAmerica extends ERegionCode
  
  @js.native
  sealed trait USEast extends ERegionCode
  
  @js.native
  sealed trait USWest extends ERegionCode
  
  @js.native
  sealed trait World extends ERegionCode
  
  /* 0x07 */ val Africa: typings.steamDashClient.steamDashClientMod.ERegionCode.Africa with Double = js.native
  /* 0x04 */ val Asia: typings.steamDashClient.steamDashClientMod.ERegionCode.Asia with Double = js.native
  /* 0x05 */ val Australia: typings.steamDashClient.steamDashClientMod.ERegionCode.Australia with Double = js.native
  /* 0x03 */ val Europe: typings.steamDashClient.steamDashClientMod.ERegionCode.Europe with Double = js.native
  /* 0x06 */ val MiddleEast: typings.steamDashClient.steamDashClientMod.ERegionCode.MiddleEast with Double = js.native
  /* 0x02 */ val SouthAmerica: typings.steamDashClient.steamDashClientMod.ERegionCode.SouthAmerica with Double = js.native
  /* 0x00 */ val USEast: typings.steamDashClient.steamDashClientMod.ERegionCode.USEast with Double = js.native
  /* 0x01 */ val USWest: typings.steamDashClient.steamDashClientMod.ERegionCode.USWest with Double = js.native
  /* 0xFF */ val World: typings.steamDashClient.steamDashClientMod.ERegionCode.World with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode with Double] = js.native
}

