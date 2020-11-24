package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardSortMethod extends js.Object
@JSImport("steam-client", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardSortMethod with Double] = js.native
  
  @js.native
  sealed trait Ascending extends ELeaderboardSortMethod
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  @js.native
  sealed trait Descending extends ELeaderboardSortMethod
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  @js.native
  sealed trait None extends ELeaderboardSortMethod
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
