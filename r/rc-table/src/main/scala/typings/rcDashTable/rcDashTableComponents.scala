package typings.rcDashTable

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashTableComponents extends rcDashTableProps {
  @scala.inline
  def BodyTable[ValueType]: ComponentType[BodyTableProps[ValueType]] = typings.rcDashTable.libBodyTableMod.default.asInstanceOf[typings.react.reactMod.ComponentType[BodyTableProps[ValueType]]]
  @scala.inline
  def ColGroup: ComponentType[ColGroupProps] = typings.rcDashTable.libColGroupMod.default.asInstanceOf[typings.react.reactMod.ComponentType[ColGroupProps]]
  @scala.inline
  def Column: ComponentType[ColumnProps] = typings.rcDashTable.libColumnMod.default.asInstanceOf[typings.react.reactMod.ComponentType[ColumnProps]]
  @scala.inline
  def ColumnGroup: ComponentType[ColumnGroupProps] = js.constructorOf[typings.rcDashTable.libColumnGroupMod.default].asInstanceOf[typings.react.reactMod.ComponentType[ColumnGroupProps]]
  @scala.inline
  def ExpandIcon[ValueType]: ComponentType[ExpandIconProps[ValueType]] = js.constructorOf[typings.rcDashTable.libExpandIconMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[ExpandIconProps[ValueType]]]
  @scala.inline
  def HeadTable: ComponentType[HeadTableProps] = typings.rcDashTable.libHeadTableMod.default.asInstanceOf[typings.react.reactMod.ComponentType[HeadTableProps]]
  @scala.inline
  def Lib[ValueType]: ComponentType[LibProps[ValueType]] = js.constructorOf[typings.rcDashTable.libMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[LibProps[ValueType]]]
  @scala.inline
  def LibColumn: ComponentType[LibColumnProps] = typings.rcDashTable.libMod.default.Column.asInstanceOf[typings.react.reactMod.ComponentType[LibColumnProps]]
  @scala.inline
  def Table[ValueType]: ComponentType[TableProps[ValueType]] = js.constructorOf[typings.rcDashTable.libTableMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[TableProps[ValueType]]]
  @scala.inline
  def TableCell[ValueType]: ComponentType[TableCellProps[ValueType]] = js.constructorOf[typings.rcDashTable.libTableCellMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[TableCellProps[ValueType]]]
  @scala.inline
  def TableColumn: ComponentType[TableColumnProps] = typings.rcDashTable.libTableMod.default.Column.asInstanceOf[typings.react.reactMod.ComponentType[TableColumnProps]]
  @scala.inline
  def TableHeader: ComponentType[TableHeaderProps] = typings.rcDashTable.libTableHeaderMod.default.asInstanceOf[typings.react.reactMod.ComponentType[TableHeaderProps]]
}

