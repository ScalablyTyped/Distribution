package typings.rcTable

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTableComponents extends rcTableProps {
  @scala.inline
  def BodyTable[ValueType]: ComponentType[BodyTableProps[ValueType]] = typings.rcTable.bodyTableMod.default.asInstanceOf[typings.react.mod.ComponentType[BodyTableProps[ValueType]]]
  @scala.inline
  def ColGroup: ComponentType[ColGroupProps] = typings.rcTable.colGroupMod.default.asInstanceOf[typings.react.mod.ComponentType[ColGroupProps]]
  @scala.inline
  def Column: ComponentType[ColumnProps] = typings.rcTable.columnMod.default.asInstanceOf[typings.react.mod.ComponentType[ColumnProps]]
  @scala.inline
  def ColumnGroup: ComponentType[ColumnGroupProps] = js.constructorOf[typings.rcTable.columnGroupMod.default].asInstanceOf[typings.react.mod.ComponentType[ColumnGroupProps]]
  @scala.inline
  def ExpandIcon[ValueType]: ComponentType[ExpandIconProps[ValueType]] = js.constructorOf[typings.rcTable.expandIconMod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[ExpandIconProps[ValueType]]]
  @scala.inline
  def HeadTable: ComponentType[HeadTableProps] = typings.rcTable.headTableMod.default.asInstanceOf[typings.react.mod.ComponentType[HeadTableProps]]
  @scala.inline
  def Lib[ValueType]: ComponentType[LibProps[ValueType]] = js.constructorOf[typings.rcTable.mod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[LibProps[ValueType]]]
  @scala.inline
  def LibColumn: ComponentType[LibColumnProps] = typings.rcTable.mod.default.Column.asInstanceOf[typings.react.mod.ComponentType[LibColumnProps]]
  @scala.inline
  def Table[ValueType]: ComponentType[TableProps[ValueType]] = js.constructorOf[typings.rcTable.tableMod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[TableProps[ValueType]]]
  @scala.inline
  def TableCell[ValueType]: ComponentType[TableCellProps[ValueType]] = js.constructorOf[typings.rcTable.tableCellMod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[TableCellProps[ValueType]]]
  @scala.inline
  def TableColumn: ComponentType[TableColumnProps] = typings.rcTable.tableMod.default.Column.asInstanceOf[typings.react.mod.ComponentType[TableColumnProps]]
  @scala.inline
  def TableHeader: ComponentType[TableHeaderProps] = typings.rcTable.tableHeaderMod.default.asInstanceOf[typings.react.mod.ComponentType[TableHeaderProps]]
}

