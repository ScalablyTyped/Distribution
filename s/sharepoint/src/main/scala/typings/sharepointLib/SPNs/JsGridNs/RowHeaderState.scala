package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RowHeaderState")
@js.native
class RowHeaderState protected () extends js.Object {
  def this(id: java.lang.String, img: Image, priority: RowHeaderStatePriorities, tooltip: java.lang.String, fnOnClick: js.Function2[
      /* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, 
      /* recordKey */ scala.Double, 
      scala.Unit
    ]) = this()
  def GetId(): java.lang.String = js.native
  def GetImg(): Image = js.native
  def GetOnClick(): js.Function2[
    /* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, 
    /* recordKey */ scala.Double, 
    scala.Unit
  ] = js.native
  def GetPriority(): RowHeaderStatePriorities = js.native
  def GetTooltip(): java.lang.String = js.native
}

