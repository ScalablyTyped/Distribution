package typings.sharepoint.SPNs.JsGridNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.ColumnInfoCollection")
@js.native
class ColumnInfoCollection protected () extends js.Object {
  def this(colInfoArray: js.Array[_]) = this()
  def AppendColumn(colInfo: js.Any): Unit = js.native
  def GetColumnArray(): js.Array[_] = js.native
  def GetColumnArray(bVisibleOnly: Boolean): js.Array[_] = js.native
  def GetColumnByKey(key: String): js.Any = js.native
  def GetColumnMap(): StringDictionary[js.Any] = js.native
  /** Returns null if the specified column is not found or hidden. */
  def GetColumnPosition(key: String): Double = js.native
  def InsertColumnAt(idx: Double, colInfo: js.Any): Unit = js.native
  def RemoveColumn(key: String): Unit = js.native
}

