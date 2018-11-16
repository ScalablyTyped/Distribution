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
  
  val Ascending: Ascending with java.lang.String = js.native
  val Descending: Descending with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.SortMode with java.lang.String] = js.native
}

