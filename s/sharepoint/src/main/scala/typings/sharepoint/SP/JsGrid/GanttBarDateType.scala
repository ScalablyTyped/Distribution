package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttBarDateType extends js.Object

@JSGlobal("SP.JsGrid.GanttBarDateType")
@js.native
object GanttBarDateType extends js.Object {
  @js.native
  sealed trait End extends GanttBarDateType
  
   // 0,
  @js.native
  sealed trait Start extends GanttBarDateType
  
  /* 1 */ val End: typings.sharepoint.SP.JsGrid.GanttBarDateType.End with Double = js.native
  /* 0 */ val Start: typings.sharepoint.SP.JsGrid.GanttBarDateType.Start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GanttBarDateType with Double] = js.native
}

