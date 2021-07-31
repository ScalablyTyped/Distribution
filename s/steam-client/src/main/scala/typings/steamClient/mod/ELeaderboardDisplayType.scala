package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDisplayType extends StObject
@JSImport("steam-client", "ELeaderboardDisplayType")
@js.native
object ELeaderboardDisplayType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDisplayType & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELeaderboardDisplayType
  /* 0 */ val None: typings.steamClient.mod.ELeaderboardDisplayType.None & Double = js.native
  
  @js.native
  sealed trait Numeric
    extends StObject
       with ELeaderboardDisplayType
  /* 1 */ val Numeric: typings.steamClient.mod.ELeaderboardDisplayType.Numeric & Double = js.native
  
  @js.native
  sealed trait TimeMilliSeconds
    extends StObject
       with ELeaderboardDisplayType
  /* 3 */ val TimeMilliSeconds: typings.steamClient.mod.ELeaderboardDisplayType.TimeMilliSeconds & Double = js.native
  
  @js.native
  sealed trait TimeSeconds
    extends StObject
       with ELeaderboardDisplayType
  /* 2 */ val TimeSeconds: typings.steamClient.mod.ELeaderboardDisplayType.TimeSeconds & Double = js.native
}
