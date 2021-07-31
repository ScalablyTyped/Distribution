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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/table", "Caption")
  @js.native
  val Caption: ForwardRefExoticComponent[CaptionProps & RefAttributes[HTMLTableCaptionElement]] = js.native
  
  @JSImport("@react-md/table", "Table")
  @js.native
  val Table: ForwardRefExoticComponent[TableProps & RefAttributes[HTMLTableElement]] = js.native
  
  @JSImport("@react-md/table", "TableBody")
  @js.native
  val TableBody: ForwardRefExoticComponent[TableBodyProps & RefAttributes[HTMLTableSectionElement]] = js.native
  
  @JSImport("@react-md/table", "TableCell")
  @js.native
  val TableCell: ForwardRefExoticComponent[TableCellProps & RefAttributes[TableCellElement]] = js.native
  
  @JSImport("@react-md/table", "TableCellContent")
  @js.native
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/table", "TableCheckbox")
  @js.native
  val TableCheckbox: ForwardRefExoticComponent[TableCheckboxProps & RefAttributes[HTMLTableDataCellElement]] = js.native
  
  @JSImport("@react-md/table", "TableContainer")
  @js.native
  val TableContainer: ForwardRefExoticComponent[TableContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/table", "TableFooter")
  @js.native
  val TableFooter: ForwardRefExoticComponent[TableFooterProps & RefAttributes[HTMLTableSectionElement]] = js.native
  
  @JSImport("@react-md/table", "TableHeader")
  @js.native
  val TableHeader: ForwardRefExoticComponent[TableHeaderProps & RefAttributes[HTMLTableSectionElement]] = js.native
  
  @JSImport("@react-md/table", "TableRow")
  @js.native
  val TableRow: ForwardRefExoticComponent[TableRowProps & RefAttributes[HTMLTableRowElement]] = js.native
}
