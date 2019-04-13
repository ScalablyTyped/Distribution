package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatFlags extends js.Object

@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends js.Object {
  @js.native
  sealed trait InvisibleToFriends
    extends steamDashClientLib.steamDashClientMod.EChatFlags
  
  @js.native
  sealed trait Locked
    extends steamDashClientLib.steamDashClientMod.EChatFlags
  
  @js.native
  sealed trait Moderated
    extends steamDashClientLib.steamDashClientMod.EChatFlags
  
  @js.native
  sealed trait Unjoinable
    extends steamDashClientLib.steamDashClientMod.EChatFlags
  
  /* 2 */ val InvisibleToFriends: InvisibleToFriends with scala.Double = js.native
  /* 1 */ val Locked: Locked with scala.Double = js.native
  /* 4 */ val Moderated: Moderated with scala.Double = js.native
  /* 8 */ val Unjoinable: Unjoinable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatFlags with scala.Double] = js.native
}

