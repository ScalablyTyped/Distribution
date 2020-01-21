package typings.semanticUiReact.tableTableMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.tableBodyMod.TableBodyProps
import typings.semanticUiReact.tableCellMod.TableCellProps
import typings.semanticUiReact.tableFooterMod.TableFooterProps
import typings.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import typings.semanticUiReact.tableHeaderMod.TableHeaderProps
import typings.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponent extends FunctionComponent[TableProps] {
  var Body: StatelessComponent[TableBodyProps] = js.native
  var Cell: StatelessComponent[TableCellProps] = js.native
  var Footer: StatelessComponent[TableFooterProps] = js.native
  var Header: StatelessComponent[TableHeaderProps] = js.native
  var HeaderCell: StatelessComponent[TableHeaderCellProps] = js.native
  var Row: StatelessComponent[TableRowProps] = js.native
}

