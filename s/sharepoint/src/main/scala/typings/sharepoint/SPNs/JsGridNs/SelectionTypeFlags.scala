package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionTypeFlags extends js.Object

@JSGlobal("SP.JsGrid.SelectionTypeFlags")
@js.native
object SelectionTypeFlags extends js.Object {
  @js.native
  sealed trait MultipleCellRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleColRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleRowRanges extends SelectionTypeFlags
  
  /* 0 */ val MultipleCellRanges: typings.sharepoint.SPNs.JsGridNs.SelectionTypeFlags.MultipleCellRanges with Double = js.native
  /* 2 */ val MultipleColRanges: typings.sharepoint.SPNs.JsGridNs.SelectionTypeFlags.MultipleColRanges with Double = js.native
  /* 1 */ val MultipleRowRanges: typings.sharepoint.SPNs.JsGridNs.SelectionTypeFlags.MultipleRowRanges with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionTypeFlags with Double] = js.native
}

