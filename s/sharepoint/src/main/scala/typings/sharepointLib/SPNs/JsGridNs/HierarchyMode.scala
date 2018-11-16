package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HierarchyMode extends js.Object

@JSGlobal("SP.JsGrid.HierarchyMode")
@js.native
object HierarchyMode extends js.Object {
  @js.native
  sealed trait Grouping
    extends sharepointLib.SPNs.JsGridNs.HierarchyMode
  
   // 0,
  @js.native
  sealed trait None
    extends sharepointLib.SPNs.JsGridNs.HierarchyMode
  
   // 1,
  @js.native
  sealed trait Standard
    extends sharepointLib.SPNs.JsGridNs.HierarchyMode
  
  val Grouping: Grouping with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.HierarchyMode with java.lang.String] = js.native
}

