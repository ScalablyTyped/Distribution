package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.tableCellMod.TableCellProps
import typings.reactToolbox.tableHeadMod.TableHeadProps
import typings.reactToolbox.tableRowMod.TableRowProps
import typings.reactToolbox.tableTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
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

