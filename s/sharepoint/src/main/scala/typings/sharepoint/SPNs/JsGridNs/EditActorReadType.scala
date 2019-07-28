package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorReadType extends js.Object

@JSGlobal("SP.JsGrid.EditActorReadType")
@js.native
object EditActorReadType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorReadType
  
  @js.native
  sealed trait DataOnly extends EditActorReadType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorReadType
  
  /* 0 */ val Both: typings.sharepoint.SPNs.JsGridNs.EditActorReadType.Both with Double = js.native
  /* 2 */ val DataOnly: typings.sharepoint.SPNs.JsGridNs.EditActorReadType.DataOnly with Double = js.native
  /* 1 */ val LocalizedOnly: typings.sharepoint.SPNs.JsGridNs.EditActorReadType.LocalizedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorReadType with Double] = js.native
}

