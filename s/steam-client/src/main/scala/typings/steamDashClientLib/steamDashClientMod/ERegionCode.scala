package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERegionCode extends js.Object

@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends js.Object {
  @js.native
  sealed trait Africa
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait Asia
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait Australia
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait Europe
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait MiddleEast
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait SouthAmerica
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait USEast
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait USWest
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  @js.native
  sealed trait World
    extends steamDashClientLib.steamDashClientMod.ERegionCode
  
  /* 0x07 */ val Africa: Africa with scala.Double = js.native
  /* 0x04 */ val Asia: Asia with scala.Double = js.native
  /* 0x05 */ val Australia: Australia with scala.Double = js.native
  /* 0x03 */ val Europe: Europe with scala.Double = js.native
  /* 0x06 */ val MiddleEast: MiddleEast with scala.Double = js.native
  /* 0x02 */ val SouthAmerica: SouthAmerica with scala.Double = js.native
  /* 0x00 */ val USEast: USEast with scala.Double = js.native
  /* 0x01 */ val USWest: USWest with scala.Double = js.native
  /* 0xFF */ val World: World with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ERegionCode with scala.Double] = js.native
}

