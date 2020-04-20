package typings.rcTable

import typings.rcTable.bodyMod.default
import typings.rcTable.cellMod.CellProps
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTableComponents extends rcTableProps {
  @scala.inline
  def Body: ComponentType[BodyProps] = default.asInstanceOf[ComponentType[BodyProps]]
  @scala.inline
  def BodyRow[RecordType /* <: AnonChildren[RecordType] */]: ComponentType[BodyRowProps[RecordType]] = typings.rcTable.bodyRowMod.default.asInstanceOf[ComponentType[BodyRowProps[RecordType]]]
  @scala.inline
  def Cell: ComponentType[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]] = typings.rcTable.cellMod.default.asInstanceOf[ComponentType[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]]]
  @scala.inline
  def ColGroup[RecordType]: ComponentType[ColGroupProps[RecordType]] = typings.rcTable.colGroupMod.default.asInstanceOf[ComponentType[ColGroupProps[RecordType]]]
  @scala.inline
  def ExpandedRow[RecordType]: ComponentType[ExpandedRowProps[RecordType]] = typings.rcTable.expandedRowMod.default.asInstanceOf[ComponentType[ExpandedRowProps[RecordType]]]
  @scala.inline
  def FixedHeader[RecordType]: ComponentType[FixedHeaderProps[RecordType]] = typings.rcTable.fixedHeaderMod.default.asInstanceOf[ComponentType[FixedHeaderProps[RecordType]]]
  @scala.inline
  def Footer: ComponentType[FooterProps] = typings.rcTable.footerMod.default.asInstanceOf[ComponentType[FooterProps]]
  @scala.inline
  def Header[RecordType]: ComponentType[HeaderProps[RecordType]] = typings.rcTable.headerMod.default.asInstanceOf[ComponentType[HeaderProps[RecordType]]]
  @scala.inline
  def HeaderRow[RecordType]: ComponentType[HeaderRowProps[RecordType]] = typings.rcTable.headerRowMod.default.asInstanceOf[ComponentType[HeaderRowProps[RecordType]]]
  @scala.inline
  def Lib[RecordType /* <: DefaultRecordType */]: ComponentType[LibProps[RecordType]] = typings.rcTable.mod.default.asInstanceOf[ComponentType[LibProps[RecordType]]]
  @scala.inline
  def Panel: ComponentType[PanelProps] = typings.rcTable.panelMod.default.asInstanceOf[ComponentType[PanelProps]]
  @scala.inline
  def Table[RecordType /* <: DefaultRecordType */]: ComponentType[TableProps[RecordType]] = typings.rcTable.tableMod.default.asInstanceOf[ComponentType[TableProps[RecordType]]]
}

