package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ trait IDataView
  extends StObject
     with IContainer {
  
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
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  
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
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of inline
    * @returns Boolean/Object
    */
  var getInline: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns an item at the specified index
    * @param index Number Index of the item.
    * @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
    */
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] Returns the value of itemCls
    * @returns String
    */
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of itemConfig
    * @returns Object
    */
  var getItemConfig: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns an index for the specified item
    * @param item Number The item to locate.
    * @returns Number Index for the specified item.
    */
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[Double], Double]] = js.undefined
  
  /** [Method] Returns the value of itemTpl
    * @returns String/String[]/Ext.XTemplate
    */
  var getItemTpl: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the array of previously selected items
    * @returns Array The previous selection.
    */
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of loadingText
    * @returns String/Boolean
    */
  var getLoadingText: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of maxItemCache
    * @returns Number
    */
  var getMaxItemCache: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of mode
    * @returns String
    */
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
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
  var getSelectedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
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
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of store
    * @returns Ext.data.Store/Object
    */
  var getStore: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getUseComponents: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns an array of the current items in the DataView
    * @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
    */
  var getViewItems: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  
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
  var mode: js.UndefOr[java.lang.String] = js.undefined
  
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
      js.Any
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  
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
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  
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
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of inline
    * @param inline Boolean/Object The new value.
    */
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of itemCls
    * @param itemCls String The new value.
    */
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
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
  var setMode: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
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
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of store
    * @param store Ext.data.Store/Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of triggerCtEvent
    * @param triggerCtEvent String The new value.
    */
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of triggerEvent
    * @param triggerEvent String The new value.
    */
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
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
  var triggerCtEvent: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets a record as the last focused record
    * @param newRecord Ext.data.Record
    * @param oldRecord Ext.data.Record
    */
  var updateLastFocused: js.UndefOr[js.Function2[js.UndefOr[IRecord], js.UndefOr[IRecord], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[Boolean] = js.undefined
}
object IDataView {
  
  inline def apply(): IDataView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataView]
  }
  
  extension [Self <: IDataView](x: Self) {
    
    inline def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
    
    inline def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
    
    inline def setBindStore(value: () => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction0(value))
    
    inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    inline def setBlockRefresh(value: Boolean): Self = StObject.set(x, "blockRefresh", value.asInstanceOf[js.Any])
    
    inline def setBlockRefreshUndefined: Self = StObject.set(x, "blockRefresh", js.undefined)
    
    inline def setClearSelections(value: () => Unit): Self = StObject.set(x, "clearSelections", js.Any.fromFunction0(value))
    
    inline def setClearSelectionsUndefined: Self = StObject.set(x, "clearSelections", js.undefined)
    
    inline def setCollectData(value: () => Unit): Self = StObject.set(x, "collectData", js.Any.fromFunction0(value))
    
    inline def setCollectDataUndefined: Self = StObject.set(x, "collectData", js.undefined)
    
    inline def setData(value: Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeferEmptyText(value: Boolean): Self = StObject.set(x, "deferEmptyText", value.asInstanceOf[js.Any])
    
    inline def setDeferEmptyTextUndefined: Self = StObject.set(x, "deferEmptyText", js.undefined)
    
    inline def setDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction2(value))
    
    inline def setDeselectAll(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
    
    inline def setDeselectAllUndefined: Self = StObject.set(x, "deselectAll", js.undefined)
    
    inline def setDeselectOnContainerClick(value: Boolean): Self = StObject.set(x, "deselectOnContainerClick", value.asInstanceOf[js.Any])
    
    inline def setDeselectOnContainerClickUndefined: Self = StObject.set(x, "deselectOnContainerClick", js.undefined)
    
    inline def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
    
    inline def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
    
    inline def setDoDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "doDeselect", js.Any.fromFunction2(value))
    
    inline def setDoDeselectUndefined: Self = StObject.set(x, "doDeselect", js.undefined)
    
    inline def setDoSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "doSelect", js.Any.fromFunction3(value))
    
    inline def setDoSelectUndefined: Self = StObject.set(x, "doSelect", js.undefined)
    
    inline def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    inline def setFindItemByChild(value: () => Unit): Self = StObject.set(x, "findItemByChild", js.Any.fromFunction0(value))
    
    inline def setFindItemByChildUndefined: Self = StObject.set(x, "findItemByChild", js.undefined)
    
    inline def setFindTargetByEvent(value: () => Unit): Self = StObject.set(x, "findTargetByEvent", js.Any.fromFunction0(value))
    
    inline def setFindTargetByEventUndefined: Self = StObject.set(x, "findTargetByEvent", js.undefined)
    
    inline def setGetAllowDeselect(value: () => Boolean): Self = StObject.set(x, "getAllowDeselect", js.Any.fromFunction0(value))
    
    inline def setGetAllowDeselectUndefined: Self = StObject.set(x, "getAllowDeselect", js.undefined)
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetData(value: () => Array): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetDeferEmptyText(value: () => Boolean): Self = StObject.set(x, "getDeferEmptyText", js.Any.fromFunction0(value))
    
    inline def setGetDeferEmptyTextUndefined: Self = StObject.set(x, "getDeferEmptyText", js.undefined)
    
    inline def setGetDeselectOnContainerClick(value: () => Boolean): Self = StObject.set(x, "getDeselectOnContainerClick", js.Any.fromFunction0(value))
    
    inline def setGetDeselectOnContainerClickUndefined: Self = StObject.set(x, "getDeselectOnContainerClick", js.undefined)
    
    inline def setGetDisableSelection(value: () => Boolean): Self = StObject.set(x, "getDisableSelection", js.Any.fromFunction0(value))
    
    inline def setGetDisableSelectionUndefined: Self = StObject.set(x, "getDisableSelection", js.undefined)
    
    inline def setGetEmptyText(value: () => java.lang.String): Self = StObject.set(x, "getEmptyText", js.Any.fromFunction0(value))
    
    inline def setGetEmptyTextUndefined: Self = StObject.set(x, "getEmptyText", js.undefined)
    
    inline def setGetInline(value: () => js.Any): Self = StObject.set(x, "getInline", js.Any.fromFunction0(value))
    
    inline def setGetInlineUndefined: Self = StObject.set(x, "getInline", js.undefined)
    
    inline def setGetItemAt(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getItemAt", js.Any.fromFunction1(value))
    
    inline def setGetItemAtUndefined: Self = StObject.set(x, "getItemAt", js.undefined)
    
    inline def setGetItemCls(value: () => java.lang.String): Self = StObject.set(x, "getItemCls", js.Any.fromFunction0(value))
    
    inline def setGetItemClsUndefined: Self = StObject.set(x, "getItemCls", js.undefined)
    
    inline def setGetItemConfig(value: () => js.Any): Self = StObject.set(x, "getItemConfig", js.Any.fromFunction0(value))
    
    inline def setGetItemConfigUndefined: Self = StObject.set(x, "getItemConfig", js.undefined)
    
    inline def setGetItemIndex(value: /* item */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getItemIndex", js.Any.fromFunction1(value))
    
    inline def setGetItemIndexUndefined: Self = StObject.set(x, "getItemIndex", js.undefined)
    
    inline def setGetItemTpl(value: () => js.Any): Self = StObject.set(x, "getItemTpl", js.Any.fromFunction0(value))
    
    inline def setGetItemTplUndefined: Self = StObject.set(x, "getItemTpl", js.undefined)
    
    inline def setGetLastSelected(value: () => Array): Self = StObject.set(x, "getLastSelected", js.Any.fromFunction0(value))
    
    inline def setGetLastSelectedUndefined: Self = StObject.set(x, "getLastSelected", js.undefined)
    
    inline def setGetLoadingText(value: () => js.Any): Self = StObject.set(x, "getLoadingText", js.Any.fromFunction0(value))
    
    inline def setGetLoadingTextUndefined: Self = StObject.set(x, "getLoadingText", js.undefined)
    
    inline def setGetMaxItemCache(value: () => Double): Self = StObject.set(x, "getMaxItemCache", js.Any.fromFunction0(value))
    
    inline def setGetMaxItemCacheUndefined: Self = StObject.set(x, "getMaxItemCache", js.undefined)
    
    inline def setGetMode(value: () => java.lang.String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    inline def setGetModeUndefined: Self = StObject.set(x, "getMode", js.undefined)
    
    inline def setGetNode(value: () => Unit): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
    
    inline def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
    
    inline def setGetNodes(value: () => Unit): Self = StObject.set(x, "getNodes", js.Any.fromFunction0(value))
    
    inline def setGetNodesUndefined: Self = StObject.set(x, "getNodes", js.undefined)
    
    inline def setGetPressedCls(value: () => java.lang.String): Self = StObject.set(x, "getPressedCls", js.Any.fromFunction0(value))
    
    inline def setGetPressedClsUndefined: Self = StObject.set(x, "getPressedCls", js.undefined)
    
    inline def setGetPressedDelay(value: () => Double): Self = StObject.set(x, "getPressedDelay", js.Any.fromFunction0(value))
    
    inline def setGetPressedDelayUndefined: Self = StObject.set(x, "getPressedDelay", js.undefined)
    
    inline def setGetRecords(value: () => Unit): Self = StObject.set(x, "getRecords", js.Any.fromFunction0(value))
    
    inline def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    inline def setGetScrollToTopOnRefresh(value: () => Boolean): Self = StObject.set(x, "getScrollToTopOnRefresh", js.Any.fromFunction0(value))
    
    inline def setGetScrollToTopOnRefreshUndefined: Self = StObject.set(x, "getScrollToTopOnRefresh", js.undefined)
    
    inline def setGetSelectedCls(value: () => java.lang.String): Self = StObject.set(x, "getSelectedCls", js.Any.fromFunction0(value))
    
    inline def setGetSelectedClsUndefined: Self = StObject.set(x, "getSelectedCls", js.undefined)
    
    inline def setGetSelectedNodes(value: () => Unit): Self = StObject.set(x, "getSelectedNodes", js.Any.fromFunction0(value))
    
    inline def setGetSelectedNodesUndefined: Self = StObject.set(x, "getSelectedNodes", js.undefined)
    
    inline def setGetSelectedRecords(value: () => Unit): Self = StObject.set(x, "getSelectedRecords", js.Any.fromFunction0(value))
    
    inline def setGetSelectedRecordsUndefined: Self = StObject.set(x, "getSelectedRecords", js.undefined)
    
    inline def setGetSelection(value: () => Array): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    inline def setGetSelectionCount(value: () => Double): Self = StObject.set(x, "getSelectionCount", js.Any.fromFunction0(value))
    
    inline def setGetSelectionCountUndefined: Self = StObject.set(x, "getSelectionCount", js.undefined)
    
    inline def setGetSelectionMode(value: () => java.lang.String): Self = StObject.set(x, "getSelectionMode", js.Any.fromFunction0(value))
    
    inline def setGetSelectionModeUndefined: Self = StObject.set(x, "getSelectionMode", js.undefined)
    
    inline def setGetSelectionUndefined: Self = StObject.set(x, "getSelection", js.undefined)
    
    inline def setGetStore(value: () => js.Any): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setGetTriggerCtEvent(value: () => java.lang.String): Self = StObject.set(x, "getTriggerCtEvent", js.Any.fromFunction0(value))
    
    inline def setGetTriggerCtEventUndefined: Self = StObject.set(x, "getTriggerCtEvent", js.undefined)
    
    inline def setGetTriggerEvent(value: () => java.lang.String): Self = StObject.set(x, "getTriggerEvent", js.Any.fromFunction0(value))
    
    inline def setGetTriggerEventUndefined: Self = StObject.set(x, "getTriggerEvent", js.undefined)
    
    inline def setGetUseComponents(value: () => Boolean): Self = StObject.set(x, "getUseComponents", js.Any.fromFunction0(value))
    
    inline def setGetUseComponentsUndefined: Self = StObject.set(x, "getUseComponents", js.undefined)
    
    inline def setGetViewItems(value: () => js.Any): Self = StObject.set(x, "getViewItems", js.Any.fromFunction0(value))
    
    inline def setGetViewItemsUndefined: Self = StObject.set(x, "getViewItems", js.undefined)
    
    inline def setHandleException(value: () => Unit): Self = StObject.set(x, "handleException", js.Any.fromFunction0(value))
    
    inline def setHandleExceptionUndefined: Self = StObject.set(x, "handleException", js.undefined)
    
    inline def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    inline def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
    
    inline def setIndexOf(value: () => Unit): Self = StObject.set(x, "indexOf", js.Any.fromFunction0(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setInline(value: js.Any): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
    
    inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    inline def setIsSelected(value: js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    inline def setItemConfig(value: js.Any): Self = StObject.set(x, "itemConfig", value.asInstanceOf[js.Any])
    
    inline def setItemConfigUndefined: Self = StObject.set(x, "itemConfig", js.undefined)
    
    inline def setItemSelector(value: Boolean): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    inline def setItemTpl(value: js.Any): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    inline def setLoadingText(value: js.Any): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMaxItemCache(value: Double): Self = StObject.set(x, "maxItemCache", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCacheUndefined: Self = StObject.set(x, "maxItemCache", js.undefined)
    
    inline def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    inline def setOverItemCls(value: Boolean): Self = StObject.set(x, "overItemCls", value.asInstanceOf[js.Any])
    
    inline def setOverItemClsUndefined: Self = StObject.set(x, "overItemCls", js.undefined)
    
    inline def setPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => js.Any
    ): Self = StObject.set(x, "prepareData", js.Any.fromFunction3(value))
    
    inline def setPrepareDataUndefined: Self = StObject.set(x, "prepareData", js.undefined)
    
    inline def setPressedCls(value: java.lang.String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    inline def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    inline def setPressedDelay(value: Double): Self = StObject.set(x, "pressedDelay", value.asInstanceOf[js.Any])
    
    inline def setPressedDelayUndefined: Self = StObject.set(x, "pressedDelay", js.undefined)
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRefreshNode(value: () => Unit): Self = StObject.set(x, "refreshNode", js.Any.fromFunction0(value))
    
    inline def setRefreshNodeUndefined: Self = StObject.set(x, "refreshNode", js.undefined)
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setScrollToTopOnRefresh(value: Boolean): Self = StObject.set(x, "scrollToTopOnRefresh", value.asInstanceOf[js.Any])
    
    inline def setScrollToTopOnRefreshUndefined: Self = StObject.set(x, "scrollToTopOnRefresh", js.undefined)
    
    inline def setSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    inline def setSelectAll(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelectRange(value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "selectRange", js.Any.fromFunction3(value))
    
    inline def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
    
    inline def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
    
    inline def setSelectedItemCls(value: Boolean): Self = StObject.set(x, "selectedItemCls", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemClsUndefined: Self = StObject.set(x, "selectedItemCls", js.undefined)
    
    inline def setSetAllowDeselect(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDeselect", js.Any.fromFunction1(value))
    
    inline def setSetAllowDeselectUndefined: Self = StObject.set(x, "setAllowDeselect", js.undefined)
    
    inline def setSetData(value: /* data */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetDeferEmptyText(value: /* deferEmptyText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDeferEmptyText", js.Any.fromFunction1(value))
    
    inline def setSetDeferEmptyTextUndefined: Self = StObject.set(x, "setDeferEmptyText", js.undefined)
    
    inline def setSetDeselectOnContainerClick(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDeselectOnContainerClick", js.Any.fromFunction1(value))
    
    inline def setSetDeselectOnContainerClickUndefined: Self = StObject.set(x, "setDeselectOnContainerClick", js.undefined)
    
    inline def setSetDisableSelection(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableSelection", js.Any.fromFunction1(value))
    
    inline def setSetDisableSelectionUndefined: Self = StObject.set(x, "setDisableSelection", js.undefined)
    
    inline def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEmptyText", js.Any.fromFunction1(value))
    
    inline def setSetEmptyTextUndefined: Self = StObject.set(x, "setEmptyText", js.undefined)
    
    inline def setSetInline(value: /* inline */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInline", js.Any.fromFunction1(value))
    
    inline def setSetInlineUndefined: Self = StObject.set(x, "setInline", js.undefined)
    
    inline def setSetItemCls(value: /* itemCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemCls", js.Any.fromFunction1(value))
    
    inline def setSetItemClsUndefined: Self = StObject.set(x, "setItemCls", js.undefined)
    
    inline def setSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemConfig", js.Any.fromFunction1(value))
    
    inline def setSetItemConfigUndefined: Self = StObject.set(x, "setItemConfig", js.undefined)
    
    inline def setSetItemTpl(value: /* itemTpl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemTpl", js.Any.fromFunction1(value))
    
    inline def setSetItemTplUndefined: Self = StObject.set(x, "setItemTpl", js.undefined)
    
    inline def setSetLastFocused(value: () => Unit): Self = StObject.set(x, "setLastFocused", js.Any.fromFunction0(value))
    
    inline def setSetLastFocusedUndefined: Self = StObject.set(x, "setLastFocused", js.undefined)
    
    inline def setSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
    
    inline def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
    
    inline def setSetMaxItemCache(value: /* maxItemCache */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxItemCache", js.Any.fromFunction1(value))
    
    inline def setSetMaxItemCacheUndefined: Self = StObject.set(x, "setMaxItemCache", js.undefined)
    
    inline def setSetMode(value: js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    inline def setSetModeUndefined: Self = StObject.set(x, "setMode", js.undefined)
    
    inline def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPressedCls", js.Any.fromFunction1(value))
    
    inline def setSetPressedClsUndefined: Self = StObject.set(x, "setPressedCls", js.undefined)
    
    inline def setSetPressedDelay(value: /* pressedDelay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPressedDelay", js.Any.fromFunction1(value))
    
    inline def setSetPressedDelayUndefined: Self = StObject.set(x, "setPressedDelay", js.undefined)
    
    inline def setSetScrollToTopOnRefresh(value: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setScrollToTopOnRefresh", js.Any.fromFunction1(value))
    
    inline def setSetScrollToTopOnRefreshUndefined: Self = StObject.set(x, "setScrollToTopOnRefresh", js.undefined)
    
    inline def setSetSelectedCls(value: /* selectedCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSelectedCls", js.Any.fromFunction1(value))
    
    inline def setSetSelectedClsUndefined: Self = StObject.set(x, "setSelectedCls", js.undefined)
    
    inline def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    inline def setSetTriggerCtEvent(value: /* triggerCtEvent */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTriggerCtEvent", js.Any.fromFunction1(value))
    
    inline def setSetTriggerCtEventUndefined: Self = StObject.set(x, "setTriggerCtEvent", js.undefined)
    
    inline def setSetTriggerEvent(value: /* triggerEvent */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTriggerEvent", js.Any.fromFunction1(value))
    
    inline def setSetTriggerEventUndefined: Self = StObject.set(x, "setTriggerEvent", js.undefined)
    
    inline def setSetUseComponents(value: /* useComponents */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseComponents", js.Any.fromFunction1(value))
    
    inline def setSetUseComponentsUndefined: Self = StObject.set(x, "setUseComponents", js.undefined)
    
    inline def setSimpleSelect(value: Boolean): Self = StObject.set(x, "simpleSelect", value.asInstanceOf[js.Any])
    
    inline def setSimpleSelectUndefined: Self = StObject.set(x, "simpleSelect", js.undefined)
    
    inline def setSingleSelect(value: Boolean): Self = StObject.set(x, "singleSelect", value.asInstanceOf[js.Any])
    
    inline def setSingleSelectUndefined: Self = StObject.set(x, "singleSelect", js.undefined)
    
    inline def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTrackOver(value: Boolean): Self = StObject.set(x, "trackOver", value.asInstanceOf[js.Any])
    
    inline def setTrackOverUndefined: Self = StObject.set(x, "trackOver", js.undefined)
    
    inline def setTriggerCtEvent(value: java.lang.String): Self = StObject.set(x, "triggerCtEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerCtEventUndefined: Self = StObject.set(x, "triggerCtEvent", js.undefined)
    
    inline def setTriggerEvent(value: java.lang.String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    inline def setUpdateLastFocused(value: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Unit): Self = StObject.set(x, "updateLastFocused", js.Any.fromFunction2(value))
    
    inline def setUpdateLastFocusedUndefined: Self = StObject.set(x, "updateLastFocused", js.undefined)
    
    inline def setUseComponents(value: Boolean): Self = StObject.set(x, "useComponents", value.asInstanceOf[js.Any])
    
    inline def setUseComponentsUndefined: Self = StObject.set(x, "useComponents", js.undefined)
  }
}
