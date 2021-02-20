package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRank extends StObject
@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank with Double] = js.native
  
  @js.native
  sealed trait Member extends EClanRank
  /* 3 */ val Member: typings.steamClient.mod.EClanRank.Member with Double = js.native
  
  @js.native
  sealed trait Moderator extends EClanRank
  /* 4 */ val Moderator: typings.steamClient.mod.EClanRank.Moderator with Double = js.native
  
  @js.native
  sealed trait None extends EClanRank
  /* 0 */ val None: typings.steamClient.mod.EClanRank.None with Double = js.native
  
  @js.native
  sealed trait Officer extends EClanRank
  /* 2 */ val Officer: typings.steamClient.mod.EClanRank.Officer with Double = js.native
  
  @js.native
  sealed trait Owner extends EClanRank
  /* 1 */ val Owner: typings.steamClient.mod.EClanRank.Owner with Double = js.native
}
