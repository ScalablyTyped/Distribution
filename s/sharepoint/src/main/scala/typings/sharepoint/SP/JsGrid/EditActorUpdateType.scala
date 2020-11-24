package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
