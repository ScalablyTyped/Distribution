package typings.rcTable

import typings.rcTable.headerRowMod.RowProps
import typings.rcTable.panelMod.TitleProps
import typings.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rcTableProps {
  type BodyProps = FnCall
  @scala.inline
  def BodyRowProps: typings.rcTable.bodyRowMod.BodyRowProps.type = typings.rcTable.bodyRowMod.BodyRowProps
  type BodyRowProps[RecordType] = typings.rcTable.bodyRowMod.BodyRowProps[RecordType]
  type CellProps[P] = ForwardRefExoticComponent[P]
  @scala.inline
  def ColGroupProps: typings.rcTable.colGroupMod.ColGroupProps.type = typings.rcTable.colGroupMod.ColGroupProps
  type ColGroupProps[RecordType] = typings.rcTable.colGroupMod.ColGroupProps[RecordType]
  @scala.inline
  def ExpandedRowProps: typings.rcTable.expandedRowMod.ExpandedRowProps.type = typings.rcTable.expandedRowMod.ExpandedRowProps
  type ExpandedRowProps[RecordType] = typings.rcTable.expandedRowMod.ExpandedRowProps[RecordType]
  @scala.inline
  def FixedHeaderProps: typings.rcTable.fixedHeaderMod.FixedHeaderProps.type = typings.rcTable.fixedHeaderMod.FixedHeaderProps
  type FixedHeaderProps[RecordType] = typings.rcTable.fixedHeaderMod.FixedHeaderProps[RecordType]
  @scala.inline
  def FooterProps: typings.rcTable.footerMod.FooterProps.type = typings.rcTable.footerMod.FooterProps
  type FooterProps = typings.rcTable.footerMod.FooterProps
  @scala.inline
  def HeaderProps: typings.rcTable.headerMod.HeaderProps.type = typings.rcTable.headerMod.HeaderProps
  type HeaderProps[RecordType] = typings.rcTable.headerMod.HeaderProps[RecordType]
  @scala.inline
  def HeaderRowProps: RowProps.type = typings.rcTable.headerRowMod.RowProps
  type HeaderRowProps[RecordType] = RowProps[RecordType]
  @scala.inline
  def LibProps: typings.rcTable.tableMod.TableProps.type = typings.rcTable.tableMod.TableProps
  type LibProps[RecordType] = typings.rcTable.tableMod.TableProps[RecordType]
  @scala.inline
  def PanelProps: TitleProps.type = typings.rcTable.panelMod.TitleProps
  type PanelProps = TitleProps
  @scala.inline
  def TableProps: typings.rcTable.tableMod.TableProps.type = typings.rcTable.tableMod.TableProps
  type TableProps[RecordType] = typings.rcTable.tableMod.TableProps[RecordType]
}

