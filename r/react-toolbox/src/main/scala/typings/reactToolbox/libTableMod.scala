package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.libTableTableMod.TableProps
import typings.reactToolbox.tableTableCellMod.TableCellProps
import typings.reactToolbox.tableTableHeadMod.TableHeadProps
import typings.reactToolbox.tableTableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/table", JSImport.Namespace)
@js.native
object libTableMod extends js.Object {
  @js.native
  class Table ()
    extends Component[TableProps, js.Object, js.Any]
  
  @js.native
  class TableCell ()
    extends Component[TableCellProps, js.Object, js.Any]
  
  @js.native
  class TableHead ()
    extends Component[TableHeadProps, js.Object, js.Any]
  
  @js.native
  class TableRow ()
    extends Component[TableRowProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[TableProps, js.Object, js.Any]
  
}

