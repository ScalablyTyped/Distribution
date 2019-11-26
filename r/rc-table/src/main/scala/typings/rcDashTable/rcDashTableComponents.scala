package typings.rcDashTable

import typings.react.reactMod.ComponentType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashTableComponents extends rcDashTableProps {
  @scala.inline
  def Column: ComponentType[ColumnProps] = typings.rcDashTable.esColumnMod.default.asInstanceOf[typings.react.reactMod.ComponentType[ColumnProps]]
  @scala.inline
  def ColumnGroup: ComponentType[ColumnGroupProps] = js.constructorOf[typings.rcDashTable.esColumnGroupMod.default].asInstanceOf[typings.react.reactMod.ComponentType[ColumnGroupProps]]
  @scala.inline
  def Es[ValueType]: ComponentType[EsProps[ValueType]] = js.constructorOf[typings.rcDashTable.esMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[EsProps[ValueType]]]
  @scala.inline
  def EsColumn: ComponentType[EsColumnProps[Record[String, js.Any]]] = typings.rcDashTable.esMod.default.Column.asInstanceOf[typings.react.reactMod.ComponentType[EsColumnProps[typings.std.Record[java.lang.String, js.Any]]]]
  @scala.inline
  def Lib[ValueType]: ComponentType[LibProps[ValueType]] = js.constructorOf[typings.rcDashTable.libMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[LibProps[ValueType]]]
  @scala.inline
  def LibColumn: ComponentType[LibColumnProps[Record[String, js.Any]]] = typings.rcDashTable.libMod.default.Column.asInstanceOf[typings.react.reactMod.ComponentType[LibColumnProps[typings.std.Record[java.lang.String, js.Any]]]]
  @scala.inline
  def Table[ValueType]: ComponentType[TableProps[ValueType]] = js.constructorOf[typings.rcDashTable.esTableMod.default[ValueType]].asInstanceOf[typings.react.reactMod.ComponentType[TableProps[ValueType]]]
  @scala.inline
  def TableColumn: ComponentType[TableColumnProps[Record[String, js.Any]]] = typings.rcDashTable.esTableMod.default.Column.asInstanceOf[typings.react.reactMod.ComponentType[TableColumnProps[typings.std.Record[java.lang.String, js.Any]]]]
}

