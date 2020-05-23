package typings.sharepoint.SP.JsGrid

import typings.sharepoint.SP.JsGrid.JsGridControl.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticDataSource extends js.Object {
  def AddColumn(gridField: GridField, values: js.Array[IValue]): Unit = js.native
  def InitJsGridParams(): Parameters = js.native
  def InitJsGridParams(optGridParams: Parameters): Parameters = js.native
  def RemoveColumn(fieldKey: String): Unit = js.native
}

