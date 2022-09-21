package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBroadcastWatchLocation extends StObject
@JSImport("steam-user", "EBroadcastWatchLocation")
@js.native
object EBroadcastWatchLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBroadcastWatchLocation & Double] = js.native
  
  @js.native
  sealed trait BigPicture
    extends StObject
       with EBroadcastWatchLocation
  /* 8 */ val BigPicture: typings.steamUser.mod.EBroadcastWatchLocation.BigPicture & Double = js.native
  
  @js.native
  sealed trait Chat_Friends
    extends StObject
       with EBroadcastWatchLocation
  /* 12 */ val Chat_Friends: typings.steamUser.mod.EBroadcastWatchLocation.Chat_Friends & Double = js.native
  
  @js.native
  sealed trait Chat_Tab
    extends StObject
       with EBroadcastWatchLocation
  /* 3 */ val Chat_Tab: typings.steamUser.mod.EBroadcastWatchLocation.Chat_Tab & Double = js.native
  
  @js.native
  sealed trait Chat_WatchParty
    extends StObject
       with EBroadcastWatchLocation
  /* 4 */ val Chat_WatchParty: typings.steamUser.mod.EBroadcastWatchLocation.Chat_WatchParty & Double = js.native
  
  @js.native
  sealed trait CommunityPage
    extends StObject
       with EBroadcastWatchLocation
  /* 5 */ val CommunityPage: typings.steamUser.mod.EBroadcastWatchLocation.CommunityPage & Double = js.native
  
  @js.native
  sealed trait CuratorPage
    extends StObject
       with EBroadcastWatchLocation
  /* 10 */ val CuratorPage: typings.steamUser.mod.EBroadcastWatchLocation.CuratorPage & Double = js.native
  
  @js.native
  sealed trait DeveloperPage
    extends StObject
       with EBroadcastWatchLocation
  /* 11 */ val DeveloperPage: typings.steamUser.mod.EBroadcastWatchLocation.DeveloperPage & Double = js.native
  
  @js.native
  sealed trait InGame
    extends StObject
       with EBroadcastWatchLocation
  /* 7 */ val InGame: typings.steamUser.mod.EBroadcastWatchLocation.InGame & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EBroadcastWatchLocation
  /* 0 */ val Invalid: typings.steamUser.mod.EBroadcastWatchLocation.Invalid & Double = js.native
  
  @js.native
  sealed trait SalesPage
    extends StObject
       with EBroadcastWatchLocation
  /* 9 */ val SalesPage: typings.steamUser.mod.EBroadcastWatchLocation.SalesPage & Double = js.native
  
  @js.native
  sealed trait SteamTV_Tab
    extends StObject
       with EBroadcastWatchLocation
  /* 1 */ val SteamTV_Tab: typings.steamUser.mod.EBroadcastWatchLocation.SteamTV_Tab & Double = js.native
  
  @js.native
  sealed trait SteamTV_WatchParty
    extends StObject
       with EBroadcastWatchLocation
  /* 2 */ val SteamTV_WatchParty: typings.steamUser.mod.EBroadcastWatchLocation.SteamTV_WatchParty & Double = js.native
  
  @js.native
  sealed trait SteamTV_Web
    extends StObject
       with EBroadcastWatchLocation
  /* 13 */ val SteamTV_Web: typings.steamUser.mod.EBroadcastWatchLocation.SteamTV_Web & Double = js.native
  
  @js.native
  sealed trait StoreAppPage
    extends StObject
       with EBroadcastWatchLocation
  /* 6 */ val StoreAppPage: typings.steamUser.mod.EBroadcastWatchLocation.StoreAppPage & Double = js.native
}
