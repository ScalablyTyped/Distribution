package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.Ascending
import typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.Descending
import typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardSortMethod extends js.Object

@JSImport("steam-client", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends js.Object {
  @js.native
  sealed trait Ascending extends ELeaderboardSortMethod
  
  @js.native
  sealed trait Descending extends ELeaderboardSortMethod
  
  @js.native
  sealed trait None extends ELeaderboardSortMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardSortMethod with Double] = js.native
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

