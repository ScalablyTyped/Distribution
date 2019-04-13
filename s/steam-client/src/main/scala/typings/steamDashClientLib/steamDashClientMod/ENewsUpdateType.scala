package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ENewsUpdateType extends js.Object

@JSImport("steam-client", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends js.Object {
  @js.native
  sealed trait AppNews
    extends steamDashClientLib.steamDashClientMod.ENewsUpdateType
  
  @js.native
  sealed trait CDDBUpdate
    extends steamDashClientLib.steamDashClientMod.ENewsUpdateType
  
  @js.native
  sealed trait ClientUpdate
    extends steamDashClientLib.steamDashClientMod.ENewsUpdateType
  
  @js.native
  sealed trait SteamAds
    extends steamDashClientLib.steamDashClientMod.ENewsUpdateType
  
  @js.native
  sealed trait SteamNews
    extends steamDashClientLib.steamDashClientMod.ENewsUpdateType
  
  /* 0 */ val AppNews: AppNews with scala.Double = js.native
  /* 3 */ val CDDBUpdate: CDDBUpdate with scala.Double = js.native
  /* 4 */ val ClientUpdate: ClientUpdate with scala.Double = js.native
  /* 1 */ val SteamAds: SteamAds with scala.Double = js.native
  /* 2 */ val SteamNews: SteamNews with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ENewsUpdateType with scala.Double] = js.native
}

