package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.GanttControl")
@js.native
class GanttControl ()
  extends typings.sharepoint.SP.GanttControl
object GanttControl {
  
  @JSGlobal("SP.GanttControl")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.GanttControl.FnGanttCreationCallback")
  @js.native
  def FnGanttCreationCallback: js.Array[js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]] = js.native
  @scala.inline
  def FnGanttCreationCallback_=(x: js.Array[js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FnGanttCreationCallback")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.GanttControl.Instances")
  @js.native
  def Instances: js.Array[typings.sharepoint.SP.GanttControl] = js.native
  @scala.inline
  def Instances_=(x: js.Array[typings.sharepoint.SP.GanttControl]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.GanttControl.WaitForGanttCreation")
  @js.native
  def WaitForGanttCreation(callack: js.Function1[/* control */ typings.sharepoint.SP.GanttControl, Unit]): Unit = js.native
}
