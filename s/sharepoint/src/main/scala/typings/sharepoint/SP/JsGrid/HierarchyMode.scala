package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HierarchyMode with Double] = js.native
  /* 2 */ @js.native
  object Grouping extends TopLevel[Grouping with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

