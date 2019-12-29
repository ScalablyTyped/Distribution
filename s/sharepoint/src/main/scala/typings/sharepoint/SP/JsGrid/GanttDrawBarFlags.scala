package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GanttDrawBarFlags with Double] = js.native
  /* 0 */ @js.native
  object LeftLink extends TopLevel[LeftLink with Double]
  
  /* 1 */ @js.native
  object RightLink extends TopLevel[RightLink with Double]
  
}

