package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorWriteType extends js.Object

@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorWriteType
  
   // 3,
  @js.native
  sealed trait DataOnly extends EditActorWriteType
  
  @js.native
  sealed trait Either extends EditActorWriteType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorWriteType
  
}

