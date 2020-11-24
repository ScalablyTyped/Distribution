package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
