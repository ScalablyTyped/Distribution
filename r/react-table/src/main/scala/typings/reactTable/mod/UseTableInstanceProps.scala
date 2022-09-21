package typings.reactTable.mod

import typings.reactTable.anon.PartialTableToggleHideAll
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableInstanceProps[D /* <: js.Object */] extends StObject {
  
  var allColumns: js.Array[ColumnInstance[D]] = js.native
  
  var allColumnsHidden: Boolean = js.native
  
  var columns: js.Array[ColumnInstance[D]] = js.native
  
  var dispatch: TableDispatch[Any] = js.native
  
  var flatHeaders: js.Array[ColumnInstance[D]] = js.native
  
  var flatRows: js.Array[Row[D]] = js.native
  
  var footerGroups: js.Array[HeaderGroup[D]] = js.native
  
  def getHooks(): Hooks[D] = js.native
  
  def getTableBodyProps(): TableBodyProps = js.native
  def getTableBodyProps(propGetter: TableBodyPropGetter[D]): TableBodyProps = js.native
  
  def getTableProps(): TableProps = js.native
  def getTableProps(propGetter: TablePropGetter[D]): TableProps = js.native
  
  def getToggleHideAllColumnsProps(): TableToggleHideAllColumnProps = js.native
  def getToggleHideAllColumnsProps(props: PartialTableToggleHideAll): TableToggleHideAllColumnProps = js.native
  
  var headerGroups: js.Array[HeaderGroup[D]] = js.native
  
  var headers: js.Array[ColumnInstance[D]] = js.native
  
  var plugins: js.Array[PluginHook[D]] = js.native
  
  def prepareRow(row: Row[D]): Unit = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  var rowsById: Record[String, Row[D]] = js.native
  
  def setHiddenColumns(param: js.Array[IdType[D]]): Unit = js.native
  def setHiddenColumns(param: UpdateHiddenColumns[D]): Unit = js.native
  
  var state: TableState[D] = js.native
  
  def toggleHideAllColumns(): Unit = js.native
  def toggleHideAllColumns(value: Boolean): Unit = js.native
  
  def toggleHideColumn(columnId: IdType[D]): Unit = js.native
  def toggleHideColumn(columnId: IdType[D], value: Boolean): Unit = js.native
  
  var totalColumnsWidth: Double = js.native
  
  var visibleColumns: js.Array[ColumnInstance[D]] = js.native
}
