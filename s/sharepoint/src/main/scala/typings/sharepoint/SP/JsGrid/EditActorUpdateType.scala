package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorUpdateType extends js.Object

@JSGlobal("SP.JsGrid.EditActorUpdateType")
@js.native
object EditActorUpdateType extends js.Object {
   // 0,
  @js.native
  sealed trait Committed extends EditActorUpdateType
  
   // 1
  @js.native
  sealed trait Uncommitted extends EditActorUpdateType
  
  /* 0 */ val Committed: typings.sharepoint.SP.JsGrid.EditActorUpdateType.Committed with Double = js.native
  /* 1 */ val Uncommitted: typings.sharepoint.SP.JsGrid.EditActorUpdateType.Uncommitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorUpdateType with Double] = js.native
}

