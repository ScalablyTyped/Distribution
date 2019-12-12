package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.JsGrid.PaneId.Gantt
import typings.sharepoint.SP.JsGrid.PaneId.MainGrid
import typings.sharepoint.SP.JsGrid.PaneId.PivotedGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaneId extends js.Object

@JSGlobal("SP.JsGrid.PaneId")
@js.native
object PaneId extends js.Object {
  @js.native
  sealed trait Gantt extends PaneId
  
   // 0,
  @js.native
  sealed trait MainGrid extends PaneId
  
   // 1,
  @js.native
  sealed trait PivotedGrid extends PaneId
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaneId with Double] = js.native
  /* 2 */ @js.native
  object Gantt extends TopLevel[Gantt with Double]
  
  /* 0 */ @js.native
  object MainGrid extends TopLevel[MainGrid with Double]
  
  /* 1 */ @js.native
  object PivotedGrid extends TopLevel[PivotedGrid with Double]
  
}

