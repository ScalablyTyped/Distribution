package typings.reactDashToolbox

import typings.react.reactMod.Component
import typings.reactDashToolbox.libTableTableCellMod.TableCellProps
import typings.reactDashToolbox.libTableTableHeadMod.TableHeadProps
import typings.reactDashToolbox.libTableTableMod.TableProps
import typings.reactDashToolbox.libTableTableRowMod.TableRowProps
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

