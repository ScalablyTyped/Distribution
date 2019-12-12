package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.ENewsUpdateType.AppNews
import typings.steamDashClient.steamDashClientMod.ENewsUpdateType.CDDBUpdate
import typings.steamDashClient.steamDashClientMod.ENewsUpdateType.ClientUpdate
import typings.steamDashClient.steamDashClientMod.ENewsUpdateType.SteamAds
import typings.steamDashClient.steamDashClientMod.ENewsUpdateType.SteamNews
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ENewsUpdateType extends js.Object

@JSImport("steam-client", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends js.Object {
  @js.native
  sealed trait AppNews extends ENewsUpdateType
  
  @js.native
  sealed trait CDDBUpdate extends ENewsUpdateType
  
  @js.native
  sealed trait ClientUpdate extends ENewsUpdateType
  
  @js.native
  sealed trait SteamAds extends ENewsUpdateType
  
  @js.native
  sealed trait SteamNews extends ENewsUpdateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENewsUpdateType with Double] = js.native
  /* 0 */ @js.native
  object AppNews extends TopLevel[AppNews with Double]
  
  /* 3 */ @js.native
  object CDDBUpdate extends TopLevel[CDDBUpdate with Double]
  
  /* 4 */ @js.native
  object ClientUpdate extends TopLevel[ClientUpdate with Double]
  
  /* 1 */ @js.native
  object SteamAds extends TopLevel[SteamAds with Double]
  
  /* 2 */ @js.native
  object SteamNews extends TopLevel[SteamNews with Double]
  
}

