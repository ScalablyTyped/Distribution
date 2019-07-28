package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HierarchyMode extends js.Object

@JSGlobal("SP.JsGrid.HierarchyMode")
@js.native
object HierarchyMode extends js.Object {
  @js.native
  sealed trait Grouping extends HierarchyMode
  
   // 0,
  @js.native
  sealed trait None extends HierarchyMode
  
   // 1,
  @js.native
  sealed trait Standard extends HierarchyMode
  
  /* 2 */ val Grouping: typings.sharepoint.SPNs.JsGridNs.HierarchyMode.Grouping with Double = js.native
  /* 0 */ val None: typings.sharepoint.SPNs.JsGridNs.HierarchyMode.None with Double = js.native
  /* 1 */ val Standard: typings.sharepoint.SPNs.JsGridNs.HierarchyMode.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HierarchyMode with Double] = js.native
}

