package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps[D, ResolvedData]
  extends TextProps
     with ComponentDecoratorProps
     with ControlledStateCallbackProps
     with PivotingProps
     with ControlledStateOverrideProps
     with ComponentProps {
  /**
    * Default: string
    * Adding a -striped className to ReactTable will slightly color odd numbered rows for legibility
    * Adding a -highlight className to ReactTable will highlight any row as you hover over it
    */
  var className: java.lang.String = js.native
  /** Default: true */
  var collapseOnDataChange: scala.Boolean = js.native
  /** Default: true */
  var collapseOnPageChange: scala.Boolean = js.native
  /** Default: true */
  var collapseOnSortingChange: scala.Boolean = js.native
  /** Global Column Defaults */
  var column: stdLib.Partial[GlobalColumn] = js.native
  /** Array of all Available Columns */
  var columns: js.UndefOr[js.Array[Column[ResolvedData]]] = js.native
  /** Default: [] */
  var data: js.Array[D] = js.native
  /** Default: ... */
  @JSName("defaultFilterMethod")
  var defaultFilterMethod_Original: DefaultFilterFunction = js.native
  /** Default: [] */
  var defaultFiltered: js.Array[Filter] = js.native
  /** Default: [] */
  var defaultFiltering: js.Array[Filter] = js.native
  /** Default: 20 */
  var defaultPageSize: scala.Double = js.native
  /** Default: [] */
  var defaultResized: js.Array[Resize] = js.native
  /** Default: [] */
  var defaultResizing: js.Array[Resize] = js.native
  /** Default: false */
  var defaultSortDesc: scala.Boolean = js.native
  /** Default: ... */
  @JSName("defaultSortMethod")
  var defaultSortMethod_Original: SortFunction = js.native
  /** Default: [] */
  var defaultSorted: js.Array[SortingRule] = js.native
  /** Default: [] */
  var defaultSorting: js.Array[SortingRule] = js.native
  /** Expander defaults. */
  var expanderDefaults: stdLib.Partial[ExpanderDefaults] = js.native
  /** Default: false */
  var filterable: scala.Boolean = js.native
  /** Default: false */
  var freezeWhenExpanded: scala.Boolean = js.native
  /** Default: false */
  var loading: scala.Boolean = js.native
  /** Default: false */
  var manual: scala.Boolean = js.native
  /**
    * Default: undefined
    * Otherwise take value from 'pageSize' if defined
    * @TODO: add minRows to react-table defaultProps even if undefined
    */
  var minRows: js.UndefOr[scala.Double] = js.native
  /** Default: true */
  var multiSort: scala.Boolean = js.native
  /** On change. */
  @JSName("onChange")
  var onChange_Original: ReactTableFunction = js.native
  /** Default: [5, 10, 20, 25, 50, 100] */
  var pageSizeOptions: js.Array[scala.Double] = js.native
  /** Privot defaults. */
  var pivotDefaults: stdLib.Partial[PivotDefaults] = js.native
  /** Default: true */
  var resizable: scala.Boolean = js.native
  var resolveData: js.UndefOr[js.Function1[/* data */ js.Array[D], js.Array[ResolvedData]]] = js.native
  /** Default: false */
  var showFilters: scala.Boolean = js.native
  /** Default: true */
  var showPageJump: scala.Boolean = js.native
  /** Default: true */
  var showPageSizeOptions: scala.Boolean = js.native
  /** Default: true */
  var showPagination: scala.Boolean = js.native
  /** Default: true  */
  var showPaginationBottom: scala.Boolean = js.native
  /** Default: false */
  var showPaginationTop: scala.Boolean = js.native
  /** Default: true */
  var sortable: scala.Boolean = js.native
  /** Default: {} */
  var style: js.Object = js.native
  /** The content rendered inside of a padding row */
  def PadRowComponent(): reactLib.reactMod.ReactNs.ReactNode = js.native
  /** Control callback for functional rendering */
  def children(
    state: FinalState[ResolvedData],
    makeTable: js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]],
    instance: Instance[ResolvedData]
  ): reactLib.reactMod.ReactNs.ReactNode = js.native
  /** Default: ... */
  def defaultFilterMethod(filter: Filter, row: js.Any, column: js.Any): scala.Boolean = js.native
  /** Default: ... */
  def defaultSortMethod(a: js.Any, b: js.Any, desc: js.Any): scala.Double = js.native
  /** On change. */
  def onChange(): scala.Unit = js.native
  def onChange(value: js.Any): scala.Unit = js.native
  /** Server-side callbacks */
  def onFetchData(state: js.Any, instance: js.Any): scala.Unit = js.native
}

