package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.CellError
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.Conflict
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.Dirty
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.NewRow
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.RowError
import typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities.Transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowHeaderStatePriorities with Double] = js.native
  /* 2 */ @js.native
  object CellError extends TopLevel[CellError with Double]
  
  /* 3 */ @js.native
  object Conflict extends TopLevel[Conflict with Double]
  
  /* 0 */ @js.native
  object Dirty extends TopLevel[Dirty with Double]
  
  /* 5 */ @js.native
  object NewRow extends TopLevel[NewRow with Double]
  
  /* 4 */ @js.native
  object RowError extends TopLevel[RowError with Double]
  
  /* 1 */ @js.native
  object Transfer extends TopLevel[Transfer with Double]
  
}

