package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EWorkshopFileAction extends js.Object

@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends js.Object {
  @js.native
  sealed trait Completed extends EWorkshopFileAction
  
  @js.native
  sealed trait Played extends EWorkshopFileAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileAction with Double] = js.native
  /* 1 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 0 */ @js.native
  object Played extends TopLevel[Played with Double]
  
}

