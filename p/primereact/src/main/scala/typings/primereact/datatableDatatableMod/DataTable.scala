package typings.primereact.datatableDatatableMod

import typings.primereact.anon.SelectionOnly
import typings.primereact.primereactStrings.between
import typings.primereact.primereactStrings.contains
import typings.primereact.primereactStrings.custom
import typings.primereact.primereactStrings.dateAfter
import typings.primereact.primereactStrings.dateBefore
import typings.primereact.primereactStrings.dateIs
import typings.primereact.primereactStrings.dateIsNot
import typings.primereact.primereactStrings.endsWith
import typings.primereact.primereactStrings.equals
import typings.primereact.primereactStrings.gt
import typings.primereact.primereactStrings.gte
import typings.primereact.primereactStrings.in
import typings.primereact.primereactStrings.lt
import typings.primereact.primereactStrings.lte
import typings.primereact.primereactStrings.notContains
import typings.primereact.primereactStrings.notEquals
import typings.primereact.primereactStrings.startsWith
import typings.primereact.virtualscrollerVirtualscrollerMod.VirtualScroller
import typings.react.mod.Component
import typings.std.HTMLDivElement
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/datatable/datatable", "DataTable")
@js.native
open class DataTable[TValue /* <: DataTableValueArray */] protected () extends Component[DataTableProps[TValue], Any, Any] {
  def this(props: DataTableProps[TValue]) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: DataTableProps[TValue], context: Any) = this()
  
  /**
    * Clears the table state.
    */
  def clearState(): Unit = js.native
  
  /**
    * Closes the current editing cell when incell editing is enabled.
    */
  def closeEditingCell(): Unit = js.native
  
  /**
    * Exports the data to CSV format.
    * @param {object} options - Options to export
    */
  def exportCSV(): Unit = js.native
  def exportCSV(options: SelectionOnly): Unit = js.native
  
  /**
    * Filters the data.
    * @param {T} value - The filter value
    * @param {string} field - The filter field
    * @param {'startsWith' | 'contains' | 'notContains' | 'endsWith' | 'equals' | 'notEquals' | 'in' | 'lt' | 'lte' | 'gt' | 'gte' | 'between' | 'dateIs' | 'dateIsNot' | 'dateBefore' | 'dateAfter' | 'custom'} mode - Filter match mode
    * @param  {number} index - Index of the filter
    */
  def filter[T](
    /**
    * The filter value.
    */
  value: T,
    /**
    * The filter field.
    */
  field: String,
    /**
    * Filter match mode.
    */
  mode: startsWith | contains | notContains | endsWith | equals | notEquals | in | lt | lte | gt | gte | between | dateIs | dateIsNot | dateBefore | dateAfter | custom
  ): Unit = js.native
  def filter[T](
    /**
    * The filter value.
    */
  value: T,
    /**
    * The filter field.
    */
  field: String,
    /**
    * Filter match mode.
    */
  mode: startsWith | contains | notContains | endsWith | equals | notEquals | in | lt | lte | gt | gte | between | dateIs | dateIsNot | dateBefore | dateAfter | custom,
    /**
    * Index of the filter.
    */
  index: Double
  ): Unit = js.native
  
  /**
    * Used to get container element.
    * @return {HTMLDivElement} Container element
    */
  def getElement(): HTMLDivElement = js.native
  
  /**
    * Used to get container element.
    * @return {HTMLDivElement} Container element
    */
  def getTable(): HTMLTableElement = js.native
  
  /**
    * Used to get the virtual scroller.
    */
  def getVirtualScroller(): VirtualScroller = js.native
  
  /**
    * Resets sort, filter, paginator and columnorder state.
    */
  def reset(): Unit = js.native
  
  /**
    * Resets column order when reorderableColumns is enabled.
    */
  def resetColumnOrder(): Unit = js.native
  
  /**
    * Resets scroll position.
    */
  def resetScroll(): Unit = js.native
  
  /**
    * Restores the column widths.
    */
  def restoreColumnWidths(): Unit = js.native
  
  /**
    * Restores the table state.
    */
  def restoreState(): Unit = js.native
  
  /**
    * Stored states can be loaded at any time using this method if there is a stateStorage property.
    * @param {*} state - The state to restore
    */
  def restoreTableState(state: Any): Unit = js.native
  
  /**
    * Saves the state.
    */
  def saveState(): Unit = js.native
}
