package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.mixinNs.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ trait IDataView extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]
  		*/
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of deferEmptyText
  		* @returns Boolean
  		*/
  var getDeferEmptyText: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean/Object
  		*/
  var getInline: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an item at the specified index
  		* @param index Number Index of the item.
  		* @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
  		*/
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an index for the specified item
  		* @param item Number The item to locate.
  		* @returns Number Index for the specified item.
  		*/
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
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
  var getMaxItemCache: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pressedDelay
  		* @returns Number
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of scrollToTopOnRefresh
  		* @returns Boolean
  		*/
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of selectedCls
  		* @returns String
  		*/
  var getSelectedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of triggerCtEvent
  		* @returns String
  		*/
  var getTriggerCtEvent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of triggerEvent
  		* @returns String
  		*/
  var getTriggerEvent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useComponents
  		* @returns Boolean
  		*/
  var getUseComponents: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns an array of the current items in the DataView
  		* @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
  		*/
  var getViewItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param index Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRecord */ js.UndefOr[scala.Double], 
      /* endRecord */ js.UndefOr[scala.Double], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[] The new value.
  		*/
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the value of deferEmptyText
  		* @param deferEmptyText Boolean The new value.
  		*/
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[
    js.Function1[/* deselectOnContainerClick */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean/Object The new value.
  		*/
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String/String[]/Ext.XTemplate The new value.
  		*/
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Boolean The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxItemCache
  		* @param maxItemCache Number The new value.
  		*/
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scrollToTopOnRefresh
  		* @param scrollToTopOnRefresh Boolean The new value.
  		*/
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of selectedCls
  		* @param selectedCls String The new value.
  		*/
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of triggerCtEvent
  		* @param triggerCtEvent String The new value.
  		*/
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of triggerEvent
  		* @param triggerEvent String The new value.
  		*/
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useComponents
  		* @param useComponents Boolean The new value.
  		*/
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[
    js.Function2[
      /* newRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      /* oldRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[scala.Boolean] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    ISelectable: senchaUnderscoreTouchLib.ExtNs.mixinNs.ISelectable = null,
    baseCls: java.lang.String = null,
    bindStore: js.Function0[scala.Unit] = null,
    blockRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    clearSelections: js.Function0[scala.Unit] = null,
    collectData: js.Function0[scala.Unit] = null,
    data: Array = null,
    defaultType: java.lang.String = null,
    deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined,
    deselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    deselectAll: js.Function1[/* supress */ js.UndefOr[js.Any], scala.Unit] = null,
    deselectOnContainerClick: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.Function0[scala.Unit] = null,
    doDeselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    doSelect: js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    emptyText: java.lang.String = null,
    findItemByChild: js.Function0[scala.Unit] = null,
    findTargetByEvent: js.Function0[scala.Unit] = null,
    getAllowDeselect: js.Function0[scala.Boolean] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getCount: js.Function0[scala.Double] = null,
    getData: js.Function0[Array] = null,
    getDefaultType: js.Function0[java.lang.String] = null,
    getDeferEmptyText: js.Function0[scala.Boolean] = null,
    getDeselectOnContainerClick: js.Function0[scala.Boolean] = null,
    getDisableSelection: js.Function0[scala.Boolean] = null,
    getEmptyText: js.Function0[java.lang.String] = null,
    getInline: js.Function0[_] = null,
    getItemAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getItemCls: js.Function0[java.lang.String] = null,
    getItemConfig: js.Function0[_] = null,
    getItemIndex: js.Function1[/* item */ js.UndefOr[scala.Double], scala.Double] = null,
    getItemTpl: js.Function0[_] = null,
    getLastSelected: js.Function0[Array] = null,
    getLoadingText: js.Function0[_] = null,
    getMaxItemCache: js.Function0[scala.Double] = null,
    getMode: js.Function0[java.lang.String] = null,
    getNode: js.Function0[scala.Unit] = null,
    getNodes: js.Function0[scala.Unit] = null,
    getPressedCls: js.Function0[java.lang.String] = null,
    getPressedDelay: js.Function0[scala.Double] = null,
    getRecords: js.Function0[scala.Unit] = null,
    getScrollToTopOnRefresh: js.Function0[scala.Boolean] = null,
    getScrollable: js.Function0[senchaUnderscoreTouchLib.ExtNs.scrollNs.IView] = null,
    getSelectedCls: js.Function0[java.lang.String] = null,
    getSelectedNodes: js.Function0[scala.Unit] = null,
    getSelectedRecords: js.Function0[scala.Unit] = null,
    getSelection: js.Function0[Array] = null,
    getSelectionCount: js.Function0[scala.Double] = null,
    getSelectionMode: js.Function0[java.lang.String] = null,
    getStore: js.Function0[_] = null,
    getTriggerCtEvent: js.Function0[java.lang.String] = null,
    getTriggerEvent: js.Function0[java.lang.String] = null,
    getUseComponents: js.Function0[scala.Boolean] = null,
    getViewItems: js.Function0[_] = null,
    handleException: js.Function0[scala.Unit] = null,
    hasSelection: js.Function0[scala.Boolean] = null,
    indexOf: js.Function0[scala.Unit] = null,
    initialize: js.Function0[scala.Unit] = null,
    `inline`: js.Any = null,
    isLocked: js.Function0[scala.Boolean] = null,
    isSelected: js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean] = null,
    itemCls: java.lang.String = null,
    itemConfig: js.Any = null,
    itemSelector: js.UndefOr[scala.Boolean] = js.undefined,
    itemTpl: js.Any = null,
    loadingText: js.Any = null,
    maxItemCache: scala.Int | scala.Double = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    overItemCls: js.UndefOr[scala.Boolean] = js.undefined,
    prepareData: js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], 
      _
    ] = null,
    pressedCls: java.lang.String = null,
    pressedDelay: scala.Int | scala.Double = null,
    refresh: js.Function0[scala.Unit] = null,
    refreshNode: js.Function0[scala.Unit] = null,
    scrollToTopOnRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    scrollable: js.Any = null,
    select: js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selectAll: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    selectRange: js.Function3[
      /* startRecord */ js.UndefOr[scala.Double], 
      /* endRecord */ js.UndefOr[scala.Double], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selectedCls: java.lang.String = null,
    selectedItemCls: js.UndefOr[scala.Boolean] = js.undefined,
    setAllowDeselect: js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[Array], scala.Unit] = null,
    setDefaultType: js.Function1[/* defaultType */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDeferEmptyText: js.Function1[/* deferEmptyText */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDeselectOnContainerClick: js.Function1[/* deselectOnContainerClick */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDisableSelection: js.Function1[/* disableSelection */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEmptyText: js.Function1[/* emptyText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setInline: js.Function1[/* inline */ js.UndefOr[js.Any], scala.Unit] = null,
    setItemCls: js.Function1[/* itemCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setItemConfig: js.Function1[/* itemConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setItemTpl: js.Function1[/* itemTpl */ js.UndefOr[js.Any], scala.Unit] = null,
    setLastFocused: js.Function0[scala.Unit] = null,
    setLoadingText: js.Function1[/* loadingText */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxItemCache: js.Function1[/* maxItemCache */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMode: js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPressedCls: js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPressedDelay: js.Function1[/* pressedDelay */ js.UndefOr[scala.Double], scala.Unit] = null,
    setScrollToTopOnRefresh: js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSelectedCls: js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setTriggerCtEvent: js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTriggerEvent: js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUseComponents: js.Function1[/* useComponents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    simpleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    singleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    store: js.Any = null,
    trackOver: js.UndefOr[scala.Boolean] = js.undefined,
    triggerCtEvent: java.lang.String = null,
    triggerEvent: java.lang.String = null,
    updateLastFocused: js.Function2[
      /* newRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      /* oldRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      scala.Unit
    ] = null,
    useComponents: js.UndefOr[scala.Boolean] = js.undefined
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    js.Dynamic.global.Object.assign(__obj, ISelectable)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh)
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(clearSelections)
    if (collectData != null) __obj.updateDynamic("collectData")(collectData)
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText)
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(deselectAll)
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(doDeselect)
    if (doSelect != null) __obj.updateDynamic("doSelect")(doSelect)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(findItemByChild)
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(findTargetByEvent)
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(getAllowDeselect)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(getDefaultType)
    if (getDeferEmptyText != null) __obj.updateDynamic("getDeferEmptyText")(getDeferEmptyText)
    if (getDeselectOnContainerClick != null) __obj.updateDynamic("getDeselectOnContainerClick")(getDeselectOnContainerClick)
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(getDisableSelection)
    if (getEmptyText != null) __obj.updateDynamic("getEmptyText")(getEmptyText)
    if (getInline != null) __obj.updateDynamic("getInline")(getInline)
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(getItemAt)
    if (getItemCls != null) __obj.updateDynamic("getItemCls")(getItemCls)
    if (getItemConfig != null) __obj.updateDynamic("getItemConfig")(getItemConfig)
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(getItemIndex)
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(getItemTpl)
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(getLastSelected)
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(getLoadingText)
    if (getMaxItemCache != null) __obj.updateDynamic("getMaxItemCache")(getMaxItemCache)
    if (getMode != null) __obj.updateDynamic("getMode")(getMode)
    if (getNode != null) __obj.updateDynamic("getNode")(getNode)
    if (getNodes != null) __obj.updateDynamic("getNodes")(getNodes)
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(getPressedCls)
    if (getPressedDelay != null) __obj.updateDynamic("getPressedDelay")(getPressedDelay)
    if (getRecords != null) __obj.updateDynamic("getRecords")(getRecords)
    if (getScrollToTopOnRefresh != null) __obj.updateDynamic("getScrollToTopOnRefresh")(getScrollToTopOnRefresh)
    if (getScrollable != null) __obj.updateDynamic("getScrollable")(getScrollable)
    if (getSelectedCls != null) __obj.updateDynamic("getSelectedCls")(getSelectedCls)
    if (getSelectedNodes != null) __obj.updateDynamic("getSelectedNodes")(getSelectedNodes)
    if (getSelectedRecords != null) __obj.updateDynamic("getSelectedRecords")(getSelectedRecords)
    if (getSelection != null) __obj.updateDynamic("getSelection")(getSelection)
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(getSelectionCount)
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(getSelectionMode)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getTriggerCtEvent != null) __obj.updateDynamic("getTriggerCtEvent")(getTriggerCtEvent)
    if (getTriggerEvent != null) __obj.updateDynamic("getTriggerEvent")(getTriggerEvent)
    if (getUseComponents != null) __obj.updateDynamic("getUseComponents")(getUseComponents)
    if (getViewItems != null) __obj.updateDynamic("getViewItems")(getViewItems)
    if (handleException != null) __obj.updateDynamic("handleException")(handleException)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(hasSelection)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (isLocked != null) __obj.updateDynamic("isLocked")(isLocked)
    if (isSelected != null) __obj.updateDynamic("isSelected")(isSelected)
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (itemConfig != null) __obj.updateDynamic("itemConfig")(itemConfig)
    if (!js.isUndefined(itemSelector)) __obj.updateDynamic("itemSelector")(itemSelector)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (maxItemCache != null) __obj.updateDynamic("maxItemCache")(maxItemCache.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (!js.isUndefined(overItemCls)) __obj.updateDynamic("overItemCls")(overItemCls)
    if (prepareData != null) __obj.updateDynamic("prepareData")(prepareData)
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (pressedDelay != null) __obj.updateDynamic("pressedDelay")(pressedDelay.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(refreshNode)
    if (!js.isUndefined(scrollToTopOnRefresh)) __obj.updateDynamic("scrollToTopOnRefresh")(scrollToTopOnRefresh)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll)
    if (selectRange != null) __obj.updateDynamic("selectRange")(selectRange)
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls)
    if (!js.isUndefined(selectedItemCls)) __obj.updateDynamic("selectedItemCls")(selectedItemCls)
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(setAllowDeselect)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(setDefaultType)
    if (setDeferEmptyText != null) __obj.updateDynamic("setDeferEmptyText")(setDeferEmptyText)
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(setDeselectOnContainerClick)
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(setDisableSelection)
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(setEmptyText)
    if (setInline != null) __obj.updateDynamic("setInline")(setInline)
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(setItemCls)
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(setItemConfig)
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(setItemTpl)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(setLastFocused)
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(setLoadingText)
    if (setMaxItemCache != null) __obj.updateDynamic("setMaxItemCache")(setMaxItemCache)
    if (setMode != null) __obj.updateDynamic("setMode")(setMode)
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(setPressedCls)
    if (setPressedDelay != null) __obj.updateDynamic("setPressedDelay")(setPressedDelay)
    if (setScrollToTopOnRefresh != null) __obj.updateDynamic("setScrollToTopOnRefresh")(setScrollToTopOnRefresh)
    if (setSelectedCls != null) __obj.updateDynamic("setSelectedCls")(setSelectedCls)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setTriggerCtEvent != null) __obj.updateDynamic("setTriggerCtEvent")(setTriggerCtEvent)
    if (setTriggerEvent != null) __obj.updateDynamic("setTriggerEvent")(setTriggerEvent)
    if (setUseComponents != null) __obj.updateDynamic("setUseComponents")(setUseComponents)
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (store != null) __obj.updateDynamic("store")(store)
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver)
    if (triggerCtEvent != null) __obj.updateDynamic("triggerCtEvent")(triggerCtEvent)
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(updateLastFocused)
    if (!js.isUndefined(useComponents)) __obj.updateDynamic("useComponents")(useComponents)
    __obj.asInstanceOf[IDataView]
  }
}

