package typings.sharepoint.SPNs.JsGridNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.JsGridNs.JsGridControlNs.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.StaticDataSource")
@js.native
class StaticDataSource protected () extends js.Object {
  def this(jsGridData: IGridData) = this()
  def this(
    jsGridData: IGridData,
    optFnGetPropType: js.Function3[
        /* recordKey */ String, 
        /* key */ String, 
        /* dataPropMap */ StringDictionary[js.Any], 
        _
      ]
  ) = this()
  def AddColumn(gridField: GridField, values: js.Array[IValue]): Unit = js.native
  def InitJsGridParams(): Parameters = js.native
  def InitJsGridParams(optGridParams: Parameters): Parameters = js.native
  def RemoveColumn(fieldKey: String): Unit = js.native
}

