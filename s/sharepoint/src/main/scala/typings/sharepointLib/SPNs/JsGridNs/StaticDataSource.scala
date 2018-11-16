package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.StaticDataSource")
@js.native
class StaticDataSource protected () extends js.Object {
  def this(jsGridData: IGridData) = this()
  def this(jsGridData: IGridData, optFnGetPropType: js.Function3[
      /* recordKey */ java.lang.String, 
      /* key */ java.lang.String, 
      /* dataPropMap */ ScalablyTyped.runtime.StringDictionary[js.Any], 
      _
    ]) = this()
  def AddColumn(gridField: GridField, values: js.Array[IValue]): scala.Unit = js.native
  def InitJsGridParams(): sharepointLib.SPNs.JsGridNs.JsGridControlNs.Parameters = js.native
  def InitJsGridParams(optGridParams: sharepointLib.SPNs.JsGridNs.JsGridControlNs.Parameters): sharepointLib.SPNs.JsGridNs.JsGridControlNs.Parameters = js.native
  def RemoveColumn(fieldKey: java.lang.String): scala.Unit = js.native
}

