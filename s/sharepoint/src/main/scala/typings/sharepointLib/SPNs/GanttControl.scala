package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.GanttControl")
@js.native
class GanttControl () extends js.Object {
  def get_Columns(): js.Array[sharepointLib.SPNs.JsGridNs.ColumnInfo] = js.native
}

@JSGlobal("SP.GanttControl")
@js.native
object GanttControl extends js.Object {
  var FnGanttCreationCallback: js.Array[js.Function1[/* control */ this.type, scala.Unit]] = js.native
  var Instances: js.Array[sharepointLib.SPNs.GanttControl] = js.native
  def WaitForGanttCreation(callack: js.Function1[/* control */ this.type, scala.Unit]): scala.Unit = js.native
}

