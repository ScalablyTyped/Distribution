package typings.rcDashTable

import typings.rcDashTable.esInterfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rcDashTableProps {
  type ColumnProps = typings.rcDashTable.esColumnMod.ColumnProps
  @scala.inline
  def ColumnGroupProps: typings.rcDashTable.esColumnGroupMod.ColumnGroupProps.type = typings.rcDashTable.esColumnGroupMod.ColumnGroupProps
  type ColumnGroupProps = typings.rcDashTable.esColumnGroupMod.ColumnGroupProps
  @scala.inline
  def EsProps: typings.rcDashTable.esTableMod.TableProps.type = typings.rcDashTable.esTableMod.TableProps
  type EsProps[ValueType] = typings.rcDashTable.esTableMod.TableProps[ValueType]
  @scala.inline
  def EsColumnProps: ColumnType.type = typings.rcDashTable.esInterfaceMod.ColumnType
  type EsColumnProps[ValueType] = ColumnType[ValueType]
  @scala.inline
  def LibProps: typings.rcDashTable.libTableMod.TableProps.type = typings.rcDashTable.libTableMod.TableProps
  type LibProps[ValueType] = typings.rcDashTable.libTableMod.TableProps[ValueType]
  @scala.inline
  def LibColumnProps: typings.rcDashTable.libInterfaceMod.ColumnType.type = typings.rcDashTable.libInterfaceMod.ColumnType
  type LibColumnProps[ValueType] = typings.rcDashTable.libInterfaceMod.ColumnType[ValueType]
  @scala.inline
  def TableProps: typings.rcDashTable.esTableMod.TableProps.type = typings.rcDashTable.esTableMod.TableProps
  type TableProps[ValueType] = typings.rcDashTable.esTableMod.TableProps[ValueType]
  @scala.inline
  def TableColumnProps: ColumnType.type = typings.rcDashTable.esInterfaceMod.ColumnType
  type TableColumnProps[ValueType] = ColumnType[ValueType]
}

