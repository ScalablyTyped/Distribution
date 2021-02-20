package typings.reactVirtualized

import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactVirtualized.anon.CellDataGetter
import typings.reactVirtualized.anon.CellRenderer
import typings.reactVirtualized.anon.ClassName
import typings.reactVirtualized.anon.DisableHeader
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esTableMod.ColumnProps
import typings.reactVirtualized.esTableMod.MultiSortOptions
import typings.reactVirtualized.esTableMod.MultiSortReturn
import typings.reactVirtualized.esTableMod.SortDirectionStatic
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableProps
import typings.reactVirtualized.esTableMod.TableRowRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("react-virtualized/dist/commonjs/Table", "Column")
  @js.native
  class Column protected ()
    extends typings.reactVirtualized.esTableMod.Column {
    def this(props: ColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnProps, context: js.Any) = this()
  }
  /* static members */
  object Column {
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Column.defaultProps")
    @js.native
    def defaultProps: CellRenderer = js.native
    @scala.inline
    def defaultProps_=(x: CellRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Column.propTypes")
    @js.native
    def propTypes: CellDataGetter = js.native
    @scala.inline
    def propTypes_=(x: CellDataGetter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/Table", "SortDirection")
  @js.native
  val SortDirection: SortDirectionStatic = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "SortIndicator")
  @js.native
  val SortIndicator: StatelessComponent[typings.reactVirtualized.anon.SortDirection] = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "Table")
  @js.native
  class Table protected ()
    extends typings.reactVirtualized.esTableMod.Table {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: js.Any) = this()
  }
  /* static members */
  object Table {
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Table.defaultProps")
    @js.native
    def defaultProps: DisableHeader = js.native
    @scala.inline
    def defaultProps_=(x: DisableHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/Table", "Table.propTypes")
    @js.native
    def propTypes: ClassName = js.native
    @scala.inline
    def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/Table", "createMultiSort")
  @js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = js.native
  @JSImport("react-virtualized/dist/commonjs/Table", "createMultiSort")
  @js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "defaultCellDataGetter")
  @js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "defaultCellRenderer")
  @js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "defaultHeaderRenderer")
  @js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "defaultHeaderRowRenderer")
  @js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Table", "defaultRowRenderer")
  @js.native
  val defaultRowRenderer: TableRowRenderer = js.native
}
