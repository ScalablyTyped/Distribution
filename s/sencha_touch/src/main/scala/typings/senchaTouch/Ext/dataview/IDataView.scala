package typings.senchaTouch.Ext.dataview

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IContainer
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ trait IDataView extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]
  		*/
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of deferEmptyText
  		* @returns Boolean
  		*/
  var getDeferEmptyText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean/Object
  		*/
  var getInline: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an item at the specified index
  		* @param index Number Index of the item.
  		* @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
  		*/
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an index for the specified item
  		* @param item Number The item to locate.
  		* @returns Number Index for the specified item.
  		*/
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Returns the value of itemTpl
  		* @returns String/String[]/Ext.XTemplate
  		*/
  var getItemTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String/Boolean
  		*/
  var getLoadingText: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxItemCache
  		* @returns Number
  		*/
  var getMaxItemCache: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of pressedDelay
  		* @returns Number
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of scrollToTopOnRefresh
  		* @returns Boolean
  		*/
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of selectedCls
  		* @returns String
  		*/
  var getSelectedCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of triggerCtEvent
  		* @returns String
  		*/
  var getTriggerCtEvent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of triggerEvent
  		* @returns String
  		*/
  var getTriggerEvent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of useComponents
  		* @returns Boolean
  		*/
  var getUseComponents: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns an array of the current items in the DataView
  		* @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
  		*/
  var getViewItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[Boolean] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param index Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[js.Function3[js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[] The new value.
  		*/
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of deferEmptyText
  		* @param deferEmptyText Boolean The new value.
  		*/
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean/Object The new value.
  		*/
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String/String[]/Ext.XTemplate The new value.
  		*/
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Boolean The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxItemCache
  		* @param maxItemCache Number The new value.
  		*/
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of scrollToTopOnRefresh
  		* @param scrollToTopOnRefresh Boolean The new value.
  		*/
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of selectedCls
  		* @param selectedCls String The new value.
  		*/
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of triggerCtEvent
  		* @param triggerCtEvent String The new value.
  		*/
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of triggerEvent
  		* @param triggerEvent String The new value.
  		*/
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of useComponents
  		* @param useComponents Boolean The new value.
  		*/
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[String] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[js.Function2[js.UndefOr[IRecord], js.UndefOr[IRecord], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[Boolean] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    bindStore: () => Unit = null,
    blockRefresh: js.UndefOr[Boolean] = js.undefined,
    clearSelections: () => Unit = null,
    collectData: () => Unit = null,
    data: Array = null,
    deferEmptyText: js.UndefOr[Boolean] = js.undefined,
    deselect: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit = null,
    deselectAll: js.UndefOr[js.Any] => Unit = null,
    deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    doDeselect: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit = null,
    doSelect: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit = null,
    emptyText: String = null,
    findItemByChild: () => Unit = null,
    findTargetByEvent: () => Unit = null,
    getAllowDeselect: () => Boolean = null,
    getCount: () => Double = null,
    getData: () => Array = null,
    getDeferEmptyText: () => Boolean = null,
    getDeselectOnContainerClick: () => Boolean = null,
    getDisableSelection: () => Boolean = null,
    getEmptyText: () => String = null,
    getInline: () => _ = null,
    getItemAt: /* index */ js.UndefOr[Double] => _ = null,
    getItemCls: () => String = null,
    getItemConfig: () => _ = null,
    getItemIndex: /* item */ js.UndefOr[Double] => Double = null,
    getItemTpl: () => _ = null,
    getLastSelected: () => Array = null,
    getLoadingText: () => _ = null,
    getMaxItemCache: () => Double = null,
    getMode: () => String = null,
    getNode: () => Unit = null,
    getNodes: () => Unit = null,
    getPressedCls: () => String = null,
    getPressedDelay: () => Double = null,
    getRecords: () => Unit = null,
    getScrollToTopOnRefresh: () => Boolean = null,
    getSelectedCls: () => String = null,
    getSelectedNodes: () => Unit = null,
    getSelectedRecords: () => Unit = null,
    getSelection: () => Array = null,
    getSelectionCount: () => Double = null,
    getSelectionMode: () => String = null,
    getStore: () => _ = null,
    getTriggerCtEvent: () => String = null,
    getTriggerEvent: () => String = null,
    getUseComponents: () => Boolean = null,
    getViewItems: () => _ = null,
    handleException: () => Unit = null,
    hasSelection: () => Boolean = null,
    indexOf: () => Unit = null,
    `inline`: js.Any = null,
    isLocked: () => Boolean = null,
    isSelected: js.UndefOr[js.Any] => Boolean = null,
    itemCls: String = null,
    itemConfig: js.Any = null,
    itemSelector: js.UndefOr[Boolean] = js.undefined,
    itemTpl: js.Any = null,
    loadingText: js.Any = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxItemCache: Int | Double = null,
    mode: String = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    overItemCls: js.UndefOr[Boolean] = js.undefined,
    prepareData: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _ = null,
    pressedCls: String = null,
    pressedDelay: Int | Double = null,
    refresh: () => Unit = null,
    refreshNode: () => Unit = null,
    scrollToTopOnRefresh: js.UndefOr[Boolean] = js.undefined,
    select: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit = null,
    selectAll: js.UndefOr[Boolean] => Unit = null,
    selectRange: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit = null,
    selectedCls: String = null,
    selectedItemCls: js.UndefOr[Boolean] = js.undefined,
    setAllowDeselect: js.UndefOr[Boolean] => Unit = null,
    setData: /* data */ js.UndefOr[Array] => Unit = null,
    setDeferEmptyText: /* deferEmptyText */ js.UndefOr[Boolean] => Unit = null,
    setDeselectOnContainerClick: js.UndefOr[Boolean] => Unit = null,
    setDisableSelection: js.UndefOr[Boolean] => Unit = null,
    setEmptyText: /* emptyText */ js.UndefOr[String] => Unit = null,
    setInline: /* inline */ js.UndefOr[js.Any] => Unit = null,
    setItemCls: /* itemCls */ js.UndefOr[String] => Unit = null,
    setItemConfig: /* itemConfig */ js.UndefOr[js.Any] => Unit = null,
    setItemTpl: /* itemTpl */ js.UndefOr[js.Any] => Unit = null,
    setLastFocused: () => Unit = null,
    setLoadingText: /* loadingText */ js.UndefOr[js.Any] => Unit = null,
    setMaxItemCache: /* maxItemCache */ js.UndefOr[Double] => Unit = null,
    setMode: js.UndefOr[String] => Unit = null,
    setPressedCls: /* pressedCls */ js.UndefOr[String] => Unit = null,
    setPressedDelay: /* pressedDelay */ js.UndefOr[Double] => Unit = null,
    setScrollToTopOnRefresh: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Unit = null,
    setSelectedCls: /* selectedCls */ js.UndefOr[String] => Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    setTriggerCtEvent: /* triggerCtEvent */ js.UndefOr[String] => Unit = null,
    setTriggerEvent: /* triggerEvent */ js.UndefOr[String] => Unit = null,
    setUseComponents: /* useComponents */ js.UndefOr[Boolean] => Unit = null,
    simpleSelect: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    store: js.Any = null,
    trackOver: js.UndefOr[Boolean] = js.undefined,
    triggerCtEvent: String = null,
    triggerEvent: String = null,
    updateLastFocused: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Unit = null,
    useComponents: js.UndefOr[Boolean] = js.undefined
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction0(bindStore))
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh.asInstanceOf[js.Any])
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(js.Any.fromFunction0(clearSelections))
    if (collectData != null) __obj.updateDynamic("collectData")(js.Any.fromFunction0(collectData))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(js.Any.fromFunction2(doDeselect))
    if (doSelect != null) __obj.updateDynamic("doSelect")(js.Any.fromFunction3(doSelect))
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(js.Any.fromFunction0(findItemByChild))
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(js.Any.fromFunction0(findTargetByEvent))
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(js.Any.fromFunction0(getAllowDeselect))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDeferEmptyText != null) __obj.updateDynamic("getDeferEmptyText")(js.Any.fromFunction0(getDeferEmptyText))
    if (getDeselectOnContainerClick != null) __obj.updateDynamic("getDeselectOnContainerClick")(js.Any.fromFunction0(getDeselectOnContainerClick))
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(js.Any.fromFunction0(getDisableSelection))
    if (getEmptyText != null) __obj.updateDynamic("getEmptyText")(js.Any.fromFunction0(getEmptyText))
    if (getInline != null) __obj.updateDynamic("getInline")(js.Any.fromFunction0(getInline))
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(js.Any.fromFunction1(getItemAt))
    if (getItemCls != null) __obj.updateDynamic("getItemCls")(js.Any.fromFunction0(getItemCls))
    if (getItemConfig != null) __obj.updateDynamic("getItemConfig")(js.Any.fromFunction0(getItemConfig))
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(js.Any.fromFunction1(getItemIndex))
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(js.Any.fromFunction0(getItemTpl))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(js.Any.fromFunction0(getLoadingText))
    if (getMaxItemCache != null) __obj.updateDynamic("getMaxItemCache")(js.Any.fromFunction0(getMaxItemCache))
    if (getMode != null) __obj.updateDynamic("getMode")(js.Any.fromFunction0(getMode))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction0(getNode))
    if (getNodes != null) __obj.updateDynamic("getNodes")(js.Any.fromFunction0(getNodes))
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(js.Any.fromFunction0(getPressedCls))
    if (getPressedDelay != null) __obj.updateDynamic("getPressedDelay")(js.Any.fromFunction0(getPressedDelay))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction0(getRecords))
    if (getScrollToTopOnRefresh != null) __obj.updateDynamic("getScrollToTopOnRefresh")(js.Any.fromFunction0(getScrollToTopOnRefresh))
    if (getSelectedCls != null) __obj.updateDynamic("getSelectedCls")(js.Any.fromFunction0(getSelectedCls))
    if (getSelectedNodes != null) __obj.updateDynamic("getSelectedNodes")(js.Any.fromFunction0(getSelectedNodes))
    if (getSelectedRecords != null) __obj.updateDynamic("getSelectedRecords")(js.Any.fromFunction0(getSelectedRecords))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(js.Any.fromFunction0(getSelectionCount))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getTriggerCtEvent != null) __obj.updateDynamic("getTriggerCtEvent")(js.Any.fromFunction0(getTriggerCtEvent))
    if (getTriggerEvent != null) __obj.updateDynamic("getTriggerEvent")(js.Any.fromFunction0(getTriggerEvent))
    if (getUseComponents != null) __obj.updateDynamic("getUseComponents")(js.Any.fromFunction0(getUseComponents))
    if (getViewItems != null) __obj.updateDynamic("getViewItems")(js.Any.fromFunction0(getViewItems))
    if (handleException != null) __obj.updateDynamic("handleException")(js.Any.fromFunction0(handleException))
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction0(indexOf))
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (itemConfig != null) __obj.updateDynamic("itemConfig")(itemConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(itemSelector)) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxItemCache != null) __obj.updateDynamic("maxItemCache")(maxItemCache.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(overItemCls)) __obj.updateDynamic("overItemCls")(overItemCls.asInstanceOf[js.Any])
    if (prepareData != null) __obj.updateDynamic("prepareData")(js.Any.fromFunction3(prepareData))
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls.asInstanceOf[js.Any])
    if (pressedDelay != null) __obj.updateDynamic("pressedDelay")(pressedDelay.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(js.Any.fromFunction0(refreshNode))
    if (!js.isUndefined(scrollToTopOnRefresh)) __obj.updateDynamic("scrollToTopOnRefresh")(scrollToTopOnRefresh.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedItemCls)) __obj.updateDynamic("selectedItemCls")(selectedItemCls.asInstanceOf[js.Any])
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1(setAllowDeselect))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDeferEmptyText != null) __obj.updateDynamic("setDeferEmptyText")(js.Any.fromFunction1(setDeferEmptyText))
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1(setDeselectOnContainerClick))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1(setDisableSelection))
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(js.Any.fromFunction1(setEmptyText))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1(setInline))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1(setItemCls))
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(js.Any.fromFunction1(setItemConfig))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1(setItemTpl))
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction0(setLastFocused))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1(setLoadingText))
    if (setMaxItemCache != null) __obj.updateDynamic("setMaxItemCache")(js.Any.fromFunction1(setMaxItemCache))
    if (setMode != null) __obj.updateDynamic("setMode")(js.Any.fromFunction1(setMode))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1(setPressedCls))
    if (setPressedDelay != null) __obj.updateDynamic("setPressedDelay")(js.Any.fromFunction1(setPressedDelay))
    if (setScrollToTopOnRefresh != null) __obj.updateDynamic("setScrollToTopOnRefresh")(js.Any.fromFunction1(setScrollToTopOnRefresh))
    if (setSelectedCls != null) __obj.updateDynamic("setSelectedCls")(js.Any.fromFunction1(setSelectedCls))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setTriggerCtEvent != null) __obj.updateDynamic("setTriggerCtEvent")(js.Any.fromFunction1(setTriggerCtEvent))
    if (setTriggerEvent != null) __obj.updateDynamic("setTriggerEvent")(js.Any.fromFunction1(setTriggerEvent))
    if (setUseComponents != null) __obj.updateDynamic("setUseComponents")(js.Any.fromFunction1(setUseComponents))
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver.asInstanceOf[js.Any])
    if (triggerCtEvent != null) __obj.updateDynamic("triggerCtEvent")(triggerCtEvent.asInstanceOf[js.Any])
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(js.Any.fromFunction2(updateLastFocused))
    if (!js.isUndefined(useComponents)) __obj.updateDynamic("useComponents")(useComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataView]
  }
}

