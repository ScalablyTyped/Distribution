package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowHeaderStatePriorities extends js.Object
@JSGlobal("SP.JsGrid.RowHeaderStatePriorities")
@js.native
object RowHeaderStatePriorities extends js.Object {
  
   // 40,
  @js.native
  sealed trait CellError extends RowHeaderStatePriorities
  
   // 50,
  @js.native
  sealed trait Conflict extends RowHeaderStatePriorities
  
   // 10,
  @js.native
  sealed trait Dirty extends RowHeaderStatePriorities
  
  @js.native
  sealed trait NewRow extends RowHeaderStatePriorities
  
   // 60,
  @js.native
  sealed trait RowError extends RowHeaderStatePriorities
  
   // 30,
  @js.native
  sealed trait Transfer extends RowHeaderStatePriorities
}
