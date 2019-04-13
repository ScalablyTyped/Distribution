package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPublishedFileVisibility extends js.Object

@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends js.Object {
  @js.native
  sealed trait FriendsOnly
    extends steamDashClientLib.steamDashClientMod.EPublishedFileVisibility
  
  @js.native
  sealed trait Private
    extends steamDashClientLib.steamDashClientMod.EPublishedFileVisibility
  
  @js.native
  sealed trait Public
    extends steamDashClientLib.steamDashClientMod.EPublishedFileVisibility
  
  /* 1 */ val FriendsOnly: FriendsOnly with scala.Double = js.native
  /* 2 */ val Private: Private with scala.Double = js.native
  /* 0 */ val Public: Public with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EPublishedFileVisibility with scala.Double] = js.native
}

