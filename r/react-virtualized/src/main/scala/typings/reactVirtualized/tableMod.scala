package typings.reactVirtualized

import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactVirtualized.anon.CellDataGetter
import typings.reactVirtualized.anon.CellRenderer
import typings.reactVirtualized.anon.ClassName
import typings.reactVirtualized.anon.DisableHeader
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esTableMod.MultiSortOptions
import typings.reactVirtualized.esTableMod.MultiSortReturn
import typings.reactVirtualized.esTableMod.SortDirectionStatic
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  
  val SortDirection: SortDirectionStatic = js.native
  
  val SortIndicator: StatelessComponent[typings.reactVirtualized.anon.SortDirection] = js.native
  
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  
  val defaultCellDataGetter: TableCellDataGetter = js.native
  
  val defaultCellRenderer: TableCellRenderer = js.native
  
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  
  val defaultRowRenderer: TableRowRenderer = js.native
  
  @js.native
  class Column ()
    extends typings.reactVirtualized.esTableMod.Column
  /* static members */
  @js.native
  object Column extends js.Object {
    
    var defaultProps: CellRenderer = js.native
    
    var propTypes: CellDataGetter = js.native
  }
  
  @js.native
  class Table ()
    extends typings.reactVirtualized.esTableMod.Table
  /* static members */
  @js.native
  object Table extends js.Object {
    
    var defaultProps: DisableHeader = js.native
    
    var propTypes: ClassName = js.native
  }
}
