package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EWorkshopFileAction extends js.Object

@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends js.Object {
  @js.native
  sealed trait Completed
    extends steamDashClientLib.steamDashClientMod.EWorkshopFileAction
  
  @js.native
  sealed trait Played
    extends steamDashClientLib.steamDashClientMod.EWorkshopFileAction
  
  /* 1 */ val Completed: Completed with scala.Double = js.native
  /* 0 */ val Played: Played with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EWorkshopFileAction with scala.Double] = js.native
}

