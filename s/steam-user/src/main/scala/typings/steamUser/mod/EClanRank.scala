package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRank extends StObject
@JSImport("steam-user", "EClanRank")
@js.native
object EClanRank extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank & Double] = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EClanRank
  /* 3 */ val Member: typings.steamUser.mod.EClanRank.Member & Double = js.native
  
  @js.native
  sealed trait Moderator
    extends StObject
       with EClanRank
  /* 4 */ val Moderator: typings.steamUser.mod.EClanRank.Moderator & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EClanRank
  /* 0 */ val None: typings.steamUser.mod.EClanRank.None & Double = js.native
  
  @js.native
  sealed trait Officer
    extends StObject
       with EClanRank
  /* 2 */ val Officer: typings.steamUser.mod.EClanRank.Officer & Double = js.native
  
  @js.native
  sealed trait Owner
    extends StObject
       with EClanRank
  /* 1 */ val Owner: typings.steamUser.mod.EClanRank.Owner & Double = js.native
}
