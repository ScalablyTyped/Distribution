package typings.reactMdTable

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTable.captionMod.CaptionProps
import typings.reactMdTable.tableBodyMod.TableBodyProps
import typings.reactMdTable.tableCellContentMod.TableCellContentProps
import typings.reactMdTable.tableCellMod.TableCellElement
import typings.reactMdTable.tableCellMod.TableCellProps
import typings.reactMdTable.tableCheckboxMod.TableCheckboxProps
import typings.reactMdTable.tableContainerMod.TableContainerProps
import typings.reactMdTable.tableFooterMod.TableFooterProps
import typings.reactMdTable.tableHeaderMod.TableHeaderProps
import typings.reactMdTable.tableMod.TableProps
import typings.reactMdTable.tableRowMod.TableRowProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLTableCaptionElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Caption: ForwardRefExoticComponent[CaptionProps with RefAttributes[HTMLTableCaptionElement]] = js.native
  
  val Table: ForwardRefExoticComponent[TableProps with RefAttributes[HTMLTableElement]] = js.native
  
  val TableBody: ForwardRefExoticComponent[TableBodyProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableCell: ForwardRefExoticComponent[TableCellProps with RefAttributes[TableCellElement]] = js.native
  
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps with RefAttributes[HTMLButtonElement]] = js.native
  
  val TableCheckbox: ForwardRefExoticComponent[TableCheckboxProps with RefAttributes[HTMLTableDataCellElement]] = js.native
  
  val TableContainer: ForwardRefExoticComponent[TableContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  val TableFooter: ForwardRefExoticComponent[TableFooterProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableHeader: ForwardRefExoticComponent[TableHeaderProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableRow: ForwardRefExoticComponent[TableRowProps with RefAttributes[HTMLTableRowElement]] = js.native
}
