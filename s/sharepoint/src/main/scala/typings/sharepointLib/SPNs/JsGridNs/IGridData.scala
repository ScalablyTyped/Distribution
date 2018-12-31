package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IGridData extends js.Object {
  var AdditionalParams: js.UndefOr[js.Any] = js.undefined
  var AutoFilterEntries: js.UndefOr[js.Any] = js.undefined
  var AutoFilterState: js.UndefOr[js.Any] = js.undefined
  var AutoFilterableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var CellStyles: js.UndefOr[js.Any] = js.undefined
  var Columns: js.Array[IColumnInfo]
  var Fields: js.Array[IFieldInfo]
  var GanttInfo: js.UndefOr[js.Any] = js.undefined
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[_]] = js.undefined
  var HierarchyState: js.UndefOr[js.Any] = js.undefined
  var LocalizedTable: js.Array[_]
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.undefined
  var MetaData: IGridMetadata
  var MultiValueSeparator: js.UndefOr[java.lang.String] = js.undefined
  var PaneLayout: js.UndefOr[PaneLayout] = js.undefined
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.undefined
  var RecordCount: js.UndefOr[scala.Double] = js.undefined
  var SortState: js.UndefOr[js.Array[_]] = js.undefined
  var TopRecord: js.UndefOr[scala.Double] = js.undefined
  var UnfilteredHierarchy: js.UndefOr[js.Any] = js.undefined
  var UnlocalizedTable: js.Array[_]
  var ViewDepKeys: js.UndefOr[js.Array[_]] = js.undefined
  var ViewInfo: js.Array[_]
}

