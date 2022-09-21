package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnInfoCollection extends StObject {
  
  def AppendColumn(colInfo: Any): Unit = js.native
  
  def GetColumnArray(): js.Array[Any] = js.native
  def GetColumnArray(bVisibleOnly: Boolean): js.Array[Any] = js.native
  
  def GetColumnByKey(key: String): Any = js.native
  
  def GetColumnMap(): StringDictionary[Any] = js.native
  
  /** Returns null if the specified column is not found or hidden. */
  def GetColumnPosition(key: String): Double = js.native
  
  def InsertColumnAt(idx: Double, colInfo: Any): Unit = js.native
  
  def RemoveColumn(key: String): Unit = js.native
}
