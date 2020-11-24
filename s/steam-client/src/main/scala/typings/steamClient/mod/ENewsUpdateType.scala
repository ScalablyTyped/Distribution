package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENewsUpdateType extends js.Object
@JSImport("steam-client", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENewsUpdateType with Double] = js.native
  
  @js.native
  sealed trait AppNews extends ENewsUpdateType
  /* 0 */ @js.native
  object AppNews extends TopLevel[AppNews with Double]
  
  @js.native
  sealed trait CDDBUpdate extends ENewsUpdateType
  /* 3 */ @js.native
  object CDDBUpdate extends TopLevel[CDDBUpdate with Double]
  
  @js.native
  sealed trait ClientUpdate extends ENewsUpdateType
  /* 4 */ @js.native
  object ClientUpdate extends TopLevel[ClientUpdate with Double]
  
  @js.native
  sealed trait SteamAds extends ENewsUpdateType
  /* 1 */ @js.native
  object SteamAds extends TopLevel[SteamAds with Double]
  
  @js.native
  sealed trait SteamNews extends ENewsUpdateType
  /* 2 */ @js.native
  object SteamNews extends TopLevel[SteamNews with Double]
}
