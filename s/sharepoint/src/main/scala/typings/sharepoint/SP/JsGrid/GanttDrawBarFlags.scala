package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GanttDrawBarFlags extends StObject
@JSGlobal("SP.JsGrid.GanttDrawBarFlags")
@js.native
object GanttDrawBarFlags extends StObject {
  
  @js.native
  sealed trait LeftLink
    extends StObject
       with GanttDrawBarFlags
  
  // 0x01,
  @js.native
  sealed trait RightLink
    extends StObject
       with GanttDrawBarFlags
}
