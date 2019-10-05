package typings.sharepoint.SP

import typings.sharepoint.SP.JsGrid.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.GanttControl")
@js.native
class GanttControl () extends js.Object {
  def get_Columns(): js.Array[ColumnInfo] = js.native
}

/* static members */
@JSGlobal("SP.GanttControl")
@js.native
object GanttControl extends js.Object {
  var FnGanttCreationCallback: js.Array[js.Function1[/* control */ this.type, Unit]] = js.native
  var Instances: js.Array[GanttControl] = js.native
  def WaitForGanttCreation(callack: js.Function1[/* control */ this.type, Unit]): Unit = js.native
}

