package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortMode extends js.Object

@JSGlobal("SP.JsGrid.SortMode")
@js.native
object SortMode extends js.Object {
   // 1,
  @js.native
  sealed trait Ascending
    extends sharepointLib.SPNs.JsGridNs.SortMode
  
   // -1,
  @js.native
  sealed trait Descending
    extends sharepointLib.SPNs.JsGridNs.SortMode
  
  @js.native
  sealed trait None
    extends sharepointLib.SPNs.JsGridNs.SortMode
  
  /* 0 */ val Ascending: Ascending with scala.Double = js.native
  /* 1 */ val Descending: Descending with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.SortMode with scala.Double] = js.native
}

