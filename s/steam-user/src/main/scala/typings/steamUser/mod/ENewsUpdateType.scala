package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENewsUpdateType extends StObject
@JSImport("steam-user", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENewsUpdateType & Double] = js.native
  
  @js.native
  sealed trait AppNews
    extends StObject
       with ENewsUpdateType
  /* 0 */ val AppNews: typings.steamUser.mod.ENewsUpdateType.AppNews & Double = js.native
  
  @js.native
  sealed trait CDDBUpdate
    extends StObject
       with ENewsUpdateType
  /* 3 */ val CDDBUpdate: typings.steamUser.mod.ENewsUpdateType.CDDBUpdate & Double = js.native
  
  @js.native
  sealed trait ClientUpdate
    extends StObject
       with ENewsUpdateType
  /* 4 */ val ClientUpdate: typings.steamUser.mod.ENewsUpdateType.ClientUpdate & Double = js.native
  
  @js.native
  sealed trait SteamAds
    extends StObject
       with ENewsUpdateType
  /* 1 */ val SteamAds: typings.steamUser.mod.ENewsUpdateType.SteamAds & Double = js.native
  
  @js.native
  sealed trait SteamNews
    extends StObject
       with ENewsUpdateType
  /* 2 */ val SteamNews: typings.steamUser.mod.ENewsUpdateType.SteamNews & Double = js.native
}
