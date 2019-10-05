package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttDrawBarFlags extends js.Object

@JSGlobal("SP.JsGrid.GanttDrawBarFlags")
@js.native
object GanttDrawBarFlags extends js.Object {
   // 0x01,
  @js.native
  sealed trait LeftLink extends GanttDrawBarFlags
  
  @js.native
  sealed trait RightLink extends GanttDrawBarFlags
  
  /* 0 */ val LeftLink: typings.sharepoint.SP.JsGrid.GanttDrawBarFlags.LeftLink with Double = js.native
  /* 1 */ val RightLink: typings.sharepoint.SP.JsGrid.GanttDrawBarFlags.RightLink with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GanttDrawBarFlags with Double] = js.native
}

