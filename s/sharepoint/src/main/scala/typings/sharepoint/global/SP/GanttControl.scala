package typings.sharepoint.global.SP

import typings.sharepoint.SP.JsGrid.ColumnInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.GanttControl")
@js.native
class GanttControl ()
  extends StObject
     with typings.sharepoint.SP.GanttControl {
  
  /* CompleteClass */
  override def get_Columns(): js.Array[ColumnInfo] = js.native
}
object GanttControl {
  
  @JSGlobal("SP.GanttControl")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.GanttControl.FnGanttCreationCallback")
  @js.native
  def FnGanttCreationCallback: js.Array[js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]] = js.native
  inline def FnGanttCreationCallback_=(x: js.Array[js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FnGanttCreationCallback")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.GanttControl.Instances")
  @js.native
  def Instances: js.Array[typings.sharepoint.SP.GanttControl] = js.native
  inline def Instances_=(x: js.Array[typings.sharepoint.SP.GanttControl]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def WaitForGanttCreation(callack: js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForGanttCreation")(callack.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
