package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRank extends StObject
@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank & Double] = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EClanRank
  /* 3 */ val Member: typings.steamClient.mod.EClanRank.Member & Double = js.native
  
  @js.native
  sealed trait Moderator
    extends StObject
       with EClanRank
  /* 4 */ val Moderator: typings.steamClient.mod.EClanRank.Moderator & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EClanRank
  /* 0 */ val None: typings.steamClient.mod.EClanRank.None & Double = js.native
  
  @js.native
  sealed trait Officer
    extends StObject
       with EClanRank
  /* 2 */ val Officer: typings.steamClient.mod.EClanRank.Officer & Double = js.native
  
  @js.native
  sealed trait Owner
    extends StObject
       with EClanRank
  /* 1 */ val Owner: typings.steamClient.mod.EClanRank.Owner & Double = js.native
}
