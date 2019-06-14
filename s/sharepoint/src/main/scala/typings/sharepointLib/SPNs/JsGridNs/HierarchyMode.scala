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
  
  /* 2 */ val Grouping: Grouping with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.HierarchyMode with scala.Double] = js.native
}

