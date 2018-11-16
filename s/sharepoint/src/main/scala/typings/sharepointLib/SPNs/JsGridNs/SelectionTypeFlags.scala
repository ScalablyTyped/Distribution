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
  
  val MultipleCellRanges: MultipleCellRanges with java.lang.String = js.native
  val MultipleColRanges: MultipleColRanges with java.lang.String = js.native
  val MultipleRowRanges: MultipleRowRanges with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.SelectionTypeFlags with java.lang.String] = js.native
}

