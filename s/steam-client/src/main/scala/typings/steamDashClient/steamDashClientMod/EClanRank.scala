package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EClanRank.Member
import typings.steamDashClient.steamDashClientMod.EClanRank.Moderator
import typings.steamDashClient.steamDashClientMod.EClanRank.None
import typings.steamDashClient.steamDashClientMod.EClanRank.Officer
import typings.steamDashClient.steamDashClientMod.EClanRank.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRank extends js.Object

@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends js.Object {
  @js.native
  sealed trait Member extends EClanRank
  
  @js.native
  sealed trait Moderator extends EClanRank
  
  @js.native
  sealed trait None extends EClanRank
  
  @js.native
  sealed trait Officer extends EClanRank
  
  @js.native
  sealed trait Owner extends EClanRank
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank with Double] = js.native
  /* 3 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  /* 4 */ @js.native
  object Moderator extends TopLevel[Moderator with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Officer extends TopLevel[Officer with Double]
  
  /* 1 */ @js.native
  object Owner extends TopLevel[Owner with Double]
  
}

