package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDisplayType with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  /* 3 */ @js.native
  object TimeMilliSeconds extends TopLevel[TimeMilliSeconds with Double]
  
  /* 2 */ @js.native
  object TimeSeconds extends TopLevel[TimeSeconds with Double]
  
}

