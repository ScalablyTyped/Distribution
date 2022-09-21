package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardSortMethod extends StObject
@JSImport("steam-user", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardSortMethod & Double] = js.native
  
  @js.native
  sealed trait Ascending
    extends StObject
       with ELeaderboardSortMethod
  /* 1 */ val Ascending: typings.steamUser.mod.ELeaderboardSortMethod.Ascending & Double = js.native
  
  @js.native
  sealed trait Descending
    extends StObject
       with ELeaderboardSortMethod
  /* 2 */ val Descending: typings.steamUser.mod.ELeaderboardSortMethod.Descending & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELeaderboardSortMethod
  /* 0 */ val None: typings.steamUser.mod.ELeaderboardSortMethod.None & Double = js.native
}
