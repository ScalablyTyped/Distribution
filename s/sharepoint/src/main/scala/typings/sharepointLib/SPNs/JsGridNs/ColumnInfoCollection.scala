package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.ColumnInfoCollection")
@js.native
class ColumnInfoCollection protected () extends js.Object {
  def this(colInfoArray: js.Array[_]) = this()
  def AppendColumn(colInfo: js.Any): scala.Unit = js.native
  def GetColumnArray(): js.Array[_] = js.native
  def GetColumnArray(bVisibleOnly: scala.Boolean): js.Array[_] = js.native
  def GetColumnByKey(key: java.lang.String): js.Any = js.native
  def GetColumnMap(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /** Returns null if the specified column is not found or hidden. */
  def GetColumnPosition(key: java.lang.String): scala.Double = js.native
  def InsertColumnAt(idx: scala.Double, colInfo: js.Any): scala.Unit = js.native
  def RemoveColumn(key: java.lang.String): scala.Unit = js.native
}

