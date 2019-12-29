package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatFlags extends js.Object

@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends js.Object {
  @js.native
  sealed trait InvisibleToFriends extends EChatFlags
  
  @js.native
  sealed trait Locked extends EChatFlags
  
  @js.native
  sealed trait Moderated extends EChatFlags
  
  @js.native
  sealed trait Unjoinable extends EChatFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatFlags with Double] = js.native
  /* 2 */ @js.native
  object InvisibleToFriends extends TopLevel[InvisibleToFriends with Double]
  
  /* 1 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  /* 4 */ @js.native
  object Moderated extends TopLevel[Moderated with Double]
  
  /* 8 */ @js.native
  object Unjoinable extends TopLevel[Unjoinable with Double]
  
}

