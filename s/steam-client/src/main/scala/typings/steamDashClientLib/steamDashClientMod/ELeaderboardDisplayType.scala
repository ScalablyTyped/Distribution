package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardDisplayType extends js.Object

@JSImport("steam-client", "ELeaderboardDisplayType")
@js.native
object ELeaderboardDisplayType extends js.Object {
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDisplayType
  
  @js.native
  sealed trait Numeric
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDisplayType
  
  @js.native
  sealed trait TimeMilliSeconds
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDisplayType
  
  @js.native
  sealed trait TimeSeconds
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDisplayType
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Numeric: Numeric with scala.Double = js.native
  /* 3 */ val TimeMilliSeconds: TimeMilliSeconds with scala.Double = js.native
  /* 2 */ val TimeSeconds: TimeSeconds with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ELeaderboardDisplayType with scala.Double] = js.native
}

