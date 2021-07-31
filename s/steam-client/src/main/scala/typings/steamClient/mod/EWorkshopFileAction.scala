package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopFileAction extends StObject
@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileAction & Double] = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with EWorkshopFileAction
  /* 1 */ val Completed: typings.steamClient.mod.EWorkshopFileAction.Completed & Double = js.native
  
  @js.native
  sealed trait Played
    extends StObject
       with EWorkshopFileAction
  /* 0 */ val Played: typings.steamClient.mod.EWorkshopFileAction.Played & Double = js.native
}
