package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopFileAction extends js.Object
@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileAction with Double] = js.native
  
  @js.native
  sealed trait Completed extends EWorkshopFileAction
  /* 1 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  @js.native
  sealed trait Played extends EWorkshopFileAction
  /* 0 */ @js.native
  object Played extends TopLevel[Played with Double]
}
