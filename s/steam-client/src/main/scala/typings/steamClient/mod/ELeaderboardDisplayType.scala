package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDisplayType extends StObject
@JSImport("steam-client", "ELeaderboardDisplayType")
@js.native
object ELeaderboardDisplayType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDisplayType with Double] = js.native
  
  @js.native
  sealed trait None extends ELeaderboardDisplayType
  /* 0 */ val None: typings.steamClient.mod.ELeaderboardDisplayType.None with Double = js.native
  
  @js.native
  sealed trait Numeric extends ELeaderboardDisplayType
  /* 1 */ val Numeric: typings.steamClient.mod.ELeaderboardDisplayType.Numeric with Double = js.native
  
  @js.native
  sealed trait TimeMilliSeconds extends ELeaderboardDisplayType
  /* 3 */ val TimeMilliSeconds: typings.steamClient.mod.ELeaderboardDisplayType.TimeMilliSeconds with Double = js.native
  
  @js.native
  sealed trait TimeSeconds extends ELeaderboardDisplayType
  /* 2 */ val TimeSeconds: typings.steamClient.mod.ELeaderboardDisplayType.TimeSeconds with Double = js.native
}
