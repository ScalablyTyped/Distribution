package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRank extends js.Object
@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank with Double] = js.native
  
  @js.native
  sealed trait Member extends EClanRank
  /* 3 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  @js.native
  sealed trait Moderator extends EClanRank
  /* 4 */ @js.native
  object Moderator extends TopLevel[Moderator with Double]
  
  @js.native
  sealed trait None extends EClanRank
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Officer extends EClanRank
  /* 2 */ @js.native
  object Officer extends TopLevel[Officer with Double]
  
  @js.native
  sealed trait Owner extends EClanRank
  /* 1 */ @js.native
  object Owner extends TopLevel[Owner with Double]
}
