package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardSortMethod extends StObject
@JSImport("steam-client", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardSortMethod with Double] = js.native
  
  @js.native
  sealed trait Ascending extends ELeaderboardSortMethod
  /* 1 */ val Ascending: typings.steamClient.mod.ELeaderboardSortMethod.Ascending with Double = js.native
  
  @js.native
  sealed trait Descending extends ELeaderboardSortMethod
  /* 2 */ val Descending: typings.steamClient.mod.ELeaderboardSortMethod.Descending with Double = js.native
  
  @js.native
  sealed trait None extends ELeaderboardSortMethod
  /* 0 */ val None: typings.steamClient.mod.ELeaderboardSortMethod.None with Double = js.native
}
