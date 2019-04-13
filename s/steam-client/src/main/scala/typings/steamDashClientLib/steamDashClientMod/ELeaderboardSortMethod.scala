package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardSortMethod extends js.Object

@JSImport("steam-client", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends js.Object {
  @js.native
  sealed trait Ascending
    extends steamDashClientLib.steamDashClientMod.ELeaderboardSortMethod
  
  @js.native
  sealed trait Descending
    extends steamDashClientLib.steamDashClientMod.ELeaderboardSortMethod
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.ELeaderboardSortMethod
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 2 */ val Descending: Descending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ELeaderboardSortMethod with scala.Double] = js.native
}

