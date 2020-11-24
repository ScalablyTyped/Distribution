package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDisplayType extends js.Object
@JSImport("steam-client", "ELeaderboardDisplayType")
@js.native
object ELeaderboardDisplayType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDisplayType with Double] = js.native
  
  @js.native
  sealed trait None extends ELeaderboardDisplayType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Numeric extends ELeaderboardDisplayType
  /* 1 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  @js.native
  sealed trait TimeMilliSeconds extends ELeaderboardDisplayType
  /* 3 */ @js.native
  object TimeMilliSeconds extends TopLevel[TimeMilliSeconds with Double]
  
  @js.native
  sealed trait TimeSeconds extends ELeaderboardDisplayType
  /* 2 */ @js.native
  object TimeSeconds extends TopLevel[TimeSeconds with Double]
}
