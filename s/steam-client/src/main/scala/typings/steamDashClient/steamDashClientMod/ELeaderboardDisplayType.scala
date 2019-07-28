package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardDisplayType extends js.Object

@JSImport("steam-client", "ELeaderboardDisplayType")
@js.native
object ELeaderboardDisplayType extends js.Object {
  @js.native
  sealed trait None extends ELeaderboardDisplayType
  
  @js.native
  sealed trait Numeric extends ELeaderboardDisplayType
  
  @js.native
  sealed trait TimeMilliSeconds extends ELeaderboardDisplayType
  
  @js.native
  sealed trait TimeSeconds extends ELeaderboardDisplayType
  
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.ELeaderboardDisplayType.None with Double = js.native
  /* 1 */ val Numeric: typings.steamDashClient.steamDashClientMod.ELeaderboardDisplayType.Numeric with Double = js.native
  /* 3 */ val TimeMilliSeconds: typings.steamDashClient.steamDashClientMod.ELeaderboardDisplayType.TimeMilliSeconds with Double = js.native
  /* 2 */ val TimeSeconds: typings.steamDashClient.steamDashClientMod.ELeaderboardDisplayType.TimeSeconds with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDisplayType with Double] = js.native
}

