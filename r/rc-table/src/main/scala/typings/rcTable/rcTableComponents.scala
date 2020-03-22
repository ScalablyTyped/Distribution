package typings.rcTable

import typings.rcTable.interfaceMod.DefaultRecordType
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTableComponents extends rcTableProps {
  @scala.inline
  def Body: ComponentType[BodyProps] = typings.rcTable.bodyMod.default.asInstanceOf[typings.react.mod.ComponentType[BodyProps]]
  @scala.inline
  def BodyRow[RecordType /* <: AnonChildren[RecordType] */]: ComponentType[BodyRowProps[RecordType]] = typings.rcTable.bodyRowMod.default.asInstanceOf[typings.react.mod.ComponentType[BodyRowProps[RecordType]]]
  @scala.inline
  def Cell: ComponentType[
    CellProps[
      (typings.rcTable.cellMod.CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]
    ]
  ] = typings.rcTable.cellMod.default.asInstanceOf[typings.react.mod.ComponentType[
  CellProps[
    (typings.rcTable.cellMod.CellProps[typings.std.Record[java.lang.String, js.Any]]) with typings.react.mod.RefAttributes[js.Any]
  ]]]
  @scala.inline
  def ColGroup[RecordType]: ComponentType[ColGroupProps[RecordType]] = typings.rcTable.colGroupMod.default.asInstanceOf[typings.react.mod.ComponentType[ColGroupProps[RecordType]]]
  @scala.inline
  def ExpandedRow[RecordType]: ComponentType[ExpandedRowProps[RecordType]] = typings.rcTable.expandedRowMod.default.asInstanceOf[typings.react.mod.ComponentType[ExpandedRowProps[RecordType]]]
  @scala.inline
  def FixedHeader[RecordType]: ComponentType[FixedHeaderProps[RecordType]] = typings.rcTable.fixedHeaderMod.default.asInstanceOf[typings.react.mod.ComponentType[FixedHeaderProps[RecordType]]]
  @scala.inline
  def Footer: ComponentType[FooterProps] = typings.rcTable.footerMod.default.asInstanceOf[typings.react.mod.ComponentType[FooterProps]]
  @scala.inline
  def Header[RecordType]: ComponentType[HeaderProps[RecordType]] = typings.rcTable.headerMod.default.asInstanceOf[typings.react.mod.ComponentType[HeaderProps[RecordType]]]
  @scala.inline
  def HeaderRow[RecordType]: ComponentType[HeaderRowProps[RecordType]] = typings.rcTable.headerRowMod.default.asInstanceOf[typings.react.mod.ComponentType[HeaderRowProps[RecordType]]]
  @scala.inline
  def Lib[RecordType /* <: DefaultRecordType */]: ComponentType[LibProps[RecordType]] = typings.rcTable.mod.default.asInstanceOf[typings.react.mod.ComponentType[LibProps[RecordType]]]
  @scala.inline
  def Panel: ComponentType[PanelProps] = typings.rcTable.panelMod.default.asInstanceOf[typings.react.mod.ComponentType[PanelProps]]
  @scala.inline
  def Table[RecordType /* <: DefaultRecordType */]: ComponentType[TableProps[RecordType]] = typings.rcTable.tableMod.default.asInstanceOf[typings.react.mod.ComponentType[TableProps[RecordType]]]
}

