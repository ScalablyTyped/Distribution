package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaneLayout extends js.Object

@JSGlobal("SP.JsGrid.PaneLayout")
@js.native
object PaneLayout extends js.Object {
   // 1,
  @js.native
  sealed trait GridAndGantt extends PaneLayout
  
  @js.native
  sealed trait GridAndPivotedGrid extends PaneLayout
  
   // 0,
  @js.native
  sealed trait GridOnly extends PaneLayout
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaneLayout with Double] = js.native
  /* 1 */ @js.native
  object GridAndGantt extends TopLevel[GridAndGantt with Double]
  
  /* 2 */ @js.native
  object GridAndPivotedGrid extends TopLevel[GridAndPivotedGrid with Double]
  
  /* 0 */ @js.native
  object GridOnly extends TopLevel[GridOnly with Double]
  
}

