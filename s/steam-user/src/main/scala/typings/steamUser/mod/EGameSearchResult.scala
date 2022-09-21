package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EGameSearchResult extends StObject
@JSImport("steam-user", "EGameSearchResult")
@js.native
object EGameSearchResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EGameSearchResult & Double] = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EGameSearchResult
  /* 0 */ val Invalid: typings.steamUser.mod.EGameSearchResult.Invalid & Double = js.native
  
  @js.native
  sealed trait SearchCanceled
    extends StObject
       with EGameSearchResult
  /* 6 */ val SearchCanceled: typings.steamUser.mod.EGameSearchResult.SearchCanceled & Double = js.native
  
  @js.native
  sealed trait SearchCompleteAccepted
    extends StObject
       with EGameSearchResult
  /* 4 */ val SearchCompleteAccepted: typings.steamUser.mod.EGameSearchResult.SearchCompleteAccepted & Double = js.native
  
  @js.native
  sealed trait SearchCompleteDeclined
    extends StObject
       with EGameSearchResult
  /* 5 */ val SearchCompleteDeclined: typings.steamUser.mod.EGameSearchResult.SearchCompleteDeclined & Double = js.native
  
  @js.native
  sealed trait SearchFailedNoHosts
    extends StObject
       with EGameSearchResult
  /* 2 */ val SearchFailedNoHosts: typings.steamUser.mod.EGameSearchResult.SearchFailedNoHosts & Double = js.native
  
  @js.native
  sealed trait SearchGameFound
    extends StObject
       with EGameSearchResult
  /* 3 */ val SearchGameFound: typings.steamUser.mod.EGameSearchResult.SearchGameFound & Double = js.native
  
  @js.native
  sealed trait SearchInProgress
    extends StObject
       with EGameSearchResult
  /* 1 */ val SearchInProgress: typings.steamUser.mod.EGameSearchResult.SearchInProgress & Double = js.native
}
