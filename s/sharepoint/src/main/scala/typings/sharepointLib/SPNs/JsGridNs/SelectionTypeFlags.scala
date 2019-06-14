package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionTypeFlags extends js.Object

@JSGlobal("SP.JsGrid.SelectionTypeFlags")
@js.native
object SelectionTypeFlags extends js.Object {
  @js.native
  sealed trait MultipleCellRanges
    extends sharepointLib.SPNs.JsGridNs.SelectionTypeFlags
  
  @js.native
  sealed trait MultipleColRanges
    extends sharepointLib.SPNs.JsGridNs.SelectionTypeFlags
  
  @js.native
  sealed trait MultipleRowRanges
    extends sharepointLib.SPNs.JsGridNs.SelectionTypeFlags
  
  /* 0 */ val MultipleCellRanges: MultipleCellRanges with scala.Double = js.native
  /* 2 */ val MultipleColRanges: MultipleColRanges with scala.Double = js.native
  /* 1 */ val MultipleRowRanges: MultipleRowRanges with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.SelectionTypeFlags with scala.Double] = js.native
}

