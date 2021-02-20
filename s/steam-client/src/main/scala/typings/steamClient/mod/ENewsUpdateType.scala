package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENewsUpdateType extends StObject
@JSImport("steam-client", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENewsUpdateType with Double] = js.native
  
  @js.native
  sealed trait AppNews extends ENewsUpdateType
  /* 0 */ val AppNews: typings.steamClient.mod.ENewsUpdateType.AppNews with Double = js.native
  
  @js.native
  sealed trait CDDBUpdate extends ENewsUpdateType
  /* 3 */ val CDDBUpdate: typings.steamClient.mod.ENewsUpdateType.CDDBUpdate with Double = js.native
  
  @js.native
  sealed trait ClientUpdate extends ENewsUpdateType
  /* 4 */ val ClientUpdate: typings.steamClient.mod.ENewsUpdateType.ClientUpdate with Double = js.native
  
  @js.native
  sealed trait SteamAds extends ENewsUpdateType
  /* 1 */ val SteamAds: typings.steamClient.mod.ENewsUpdateType.SteamAds with Double = js.native
  
  @js.native
  sealed trait SteamNews extends ENewsUpdateType
  /* 2 */ val SteamNews: typings.steamClient.mod.ENewsUpdateType.SteamNews with Double = js.native
}
