package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowHeaderStatePriorities extends StObject
@JSGlobal("SP.JsGrid.RowHeaderStatePriorities")
@js.native
object RowHeaderStatePriorities extends StObject {
  
  // 30,
  @js.native
  sealed trait CellError extends RowHeaderStatePriorities
  
  // 40,
  @js.native
  sealed trait Conflict extends RowHeaderStatePriorities
  
  @js.native
  sealed trait Dirty extends RowHeaderStatePriorities
  
  // 60,
  @js.native
  sealed trait NewRow extends RowHeaderStatePriorities
  
  // 50,
  @js.native
  sealed trait RowError extends RowHeaderStatePriorities
  
  // 10,
  @js.native
  sealed trait Transfer extends RowHeaderStatePriorities
}
