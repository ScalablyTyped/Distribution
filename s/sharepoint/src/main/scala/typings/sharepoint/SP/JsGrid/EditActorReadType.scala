package typings.sharepoint.SP.JsGrid

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
  
}

