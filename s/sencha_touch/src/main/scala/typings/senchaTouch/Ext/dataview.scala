package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.INodeInterface
import typings.senchaTouch.Ext.data.IRecord
import typings.senchaTouch.Ext.event.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataview {
  
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
    
    inline def apply(): typings.senchaTouch.Ext.dataview.IDataView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.IDataView]
    }
    
    extension [Self <: typings.senchaTouch.Ext.dataview.IDataView](x: Self) {
      
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
  
  trait IIndexBar
    extends StObject
       with IComponent {
    
    /** [Config Option] (Boolean) */
    var alphabet: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of letters
      * @returns Array
      */
    var getLetters: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of listPrefix
      * @returns String
      */
    var getListPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns true when direction is horizontal  */
    var isHorizontal: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns true when direction is vertical  */
    var isVertical: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var itemSelector: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Array) */
    var letters: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var listPrefix: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
    var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of letters
      * @param letters Array The new value.
      */
    var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of listPrefix
      * @param listPrefix String The new value.
      */
    var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object IIndexBar {
    
    inline def apply(): typings.senchaTouch.Ext.dataview.IIndexBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.IIndexBar]
    }
    
    extension [Self <: typings.senchaTouch.Ext.dataview.IIndexBar](x: Self) {
      
      inline def setAlphabet(value: Boolean): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      inline def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
      
      inline def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetLetters(value: () => Array): Self = StObject.set(x, "getLetters", js.Any.fromFunction0(value))
      
      inline def setGetLettersUndefined: Self = StObject.set(x, "getLetters", js.undefined)
      
      inline def setGetListPrefix(value: () => java.lang.String): Self = StObject.set(x, "getListPrefix", js.Any.fromFunction0(value))
      
      inline def setGetListPrefixUndefined: Self = StObject.set(x, "getListPrefix", js.undefined)
      
      inline def setIsHorizontal(value: () => Unit): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
      
      inline def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      inline def setIsVertical(value: () => Unit): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setItemSelector(value: Boolean): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setLetters(value: Array): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
      
      inline def setLettersUndefined: Self = StObject.set(x, "letters", js.undefined)
      
      inline def setListPrefix(value: java.lang.String): Self = StObject.set(x, "listPrefix", value.asInstanceOf[js.Any])
      
      inline def setListPrefixUndefined: Self = StObject.set(x, "listPrefix", js.undefined)
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetLetters(value: /* letters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setLetters", js.Any.fromFunction1(value))
      
      inline def setSetLettersUndefined: Self = StObject.set(x, "setLetters", js.undefined)
      
      inline def setSetListPrefix(value: /* listPrefix */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setListPrefix", js.Any.fromFunction1(value))
      
      inline def setSetListPrefixUndefined: Self = StObject.set(x, "setListPrefix", js.undefined)
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait IList
    extends StObject
       with typings.senchaTouch.Ext.dataview.IDataView {
    
    /** [Property] (Number) */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var disclosureProperty: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of disclosureProperty
      * @returns String
      */
    var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of grouped
      * @returns Boolean
      */
    var getGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of icon
      * @returns Object
      */
    var getIcon: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of indexBar
      * @returns Boolean/Object
      */
    var getIndexBar: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of infinite
      * @returns Boolean
      */
    var getInfinite: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of itemHeight
      * @returns Number
      */
    var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minimumBufferDistance
      * @returns Number
      */
    var getMinimumBufferDistance: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of onItemDisclosure
      * @returns Boolean/Function/Object
      */
    var getOnItemDisclosure: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of pinHeaders
      * @returns Boolean
      */
    var getPinHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of preventSelectionOnDisclose
      * @returns Boolean
      */
    var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of refreshHeightOnUpdate
      * @returns Boolean
      */
    var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns all the items that are docked in the scroller in this list
      * @returns Array An array of the scrollDock items
      */
    var getScrollDockedItems: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of striped
      * @returns Boolean
      */
    var getStriped: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useHeaders
      * @returns Boolean
      */
    var getUseHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useSimpleItems
      * @returns Boolean
      */
    var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of variableHeights
      * @returns Boolean
      */
    var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var grouped: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var indexBar: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean/Function/Object) */
    var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var pinHeaders: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preventSelectionOnDisclose: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var refreshHeightOnUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Scrolls the list so that the specified record is at the top
      * @param record Object {Ext.data.Model} Record in the lists store to scroll to
      * @param animate Object {Boolean} Determines if scrolling is animated to a cut
      * @param overscroll Object {Boolean} Determines if list can be overscrolled
      */
    var scrollToRecord: js.UndefOr[
        js.Function3[
          /* record */ js.UndefOr[js.Any], 
          /* animate */ js.UndefOr[js.Any], 
          /* overscroll */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of disclosureProperty
      * @param disclosureProperty String The new value.
      */
    var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of grouped
      * @param grouped Boolean The new value.
      */
    var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of icon
      * @param icon Object The new value.
      */
    var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of indexBar
      * @param indexBar Boolean/Object The new value.
      */
    var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of infinite
      * @param infinite Boolean The new value.
      */
    var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of itemHeight
      * @param itemHeight Number The new value.
      */
    var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minimumBufferDistance
      * @param minimumBufferDistance Number The new value.
      */
    var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of onItemDisclosure
      * @param onItemDisclosure Boolean/Function/Object The new value.
      */
    var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of pinHeaders
      * @param pinHeaders Boolean The new value.
      */
    var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of preventSelectionOnDisclose
      * @param preventSelectionOnDisclose Boolean The new value.
      */
    var setPreventSelectionOnDisclose: js.UndefOr[js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of refreshHeightOnUpdate
      * @param refreshHeightOnUpdate Boolean The new value.
      */
    var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of striped
      * @param striped Boolean The new value.
      */
    var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useHeaders
      * @param useHeaders Boolean The new value.
      */
    var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useSimpleItems
      * @param useSimpleItems Boolean The new value.
      */
    var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of variableHeights
      * @param variableHeights Boolean The new value.
      */
    var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var striped: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useSimpleItems: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var variableHeights: js.UndefOr[Boolean] = js.undefined
  }
  object IList {
    
    inline def apply(): typings.senchaTouch.Ext.dataview.IList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.IList]
    }
    
    extension [Self <: typings.senchaTouch.Ext.dataview.IList](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setDisclosureProperty(value: java.lang.String): Self = StObject.set(x, "disclosureProperty", value.asInstanceOf[js.Any])
      
      inline def setDisclosurePropertyUndefined: Self = StObject.set(x, "disclosureProperty", js.undefined)
      
      inline def setGetDisclosureProperty(value: () => java.lang.String): Self = StObject.set(x, "getDisclosureProperty", js.Any.fromFunction0(value))
      
      inline def setGetDisclosurePropertyUndefined: Self = StObject.set(x, "getDisclosureProperty", js.undefined)
      
      inline def setGetGrouped(value: () => Boolean): Self = StObject.set(x, "getGrouped", js.Any.fromFunction0(value))
      
      inline def setGetGroupedUndefined: Self = StObject.set(x, "getGrouped", js.undefined)
      
      inline def setGetIcon(value: () => js.Any): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
      
      inline def setGetIconUndefined: Self = StObject.set(x, "getIcon", js.undefined)
      
      inline def setGetIndexBar(value: () => js.Any): Self = StObject.set(x, "getIndexBar", js.Any.fromFunction0(value))
      
      inline def setGetIndexBarUndefined: Self = StObject.set(x, "getIndexBar", js.undefined)
      
      inline def setGetInfinite(value: () => Boolean): Self = StObject.set(x, "getInfinite", js.Any.fromFunction0(value))
      
      inline def setGetInfiniteUndefined: Self = StObject.set(x, "getInfinite", js.undefined)
      
      inline def setGetItemHeight(value: () => Double): Self = StObject.set(x, "getItemHeight", js.Any.fromFunction0(value))
      
      inline def setGetItemHeightUndefined: Self = StObject.set(x, "getItemHeight", js.undefined)
      
      inline def setGetMinimumBufferDistance(value: () => Double): Self = StObject.set(x, "getMinimumBufferDistance", js.Any.fromFunction0(value))
      
      inline def setGetMinimumBufferDistanceUndefined: Self = StObject.set(x, "getMinimumBufferDistance", js.undefined)
      
      inline def setGetOnItemDisclosure(value: () => js.Any): Self = StObject.set(x, "getOnItemDisclosure", js.Any.fromFunction0(value))
      
      inline def setGetOnItemDisclosureUndefined: Self = StObject.set(x, "getOnItemDisclosure", js.undefined)
      
      inline def setGetPinHeaders(value: () => Boolean): Self = StObject.set(x, "getPinHeaders", js.Any.fromFunction0(value))
      
      inline def setGetPinHeadersUndefined: Self = StObject.set(x, "getPinHeaders", js.undefined)
      
      inline def setGetPreventSelectionOnDisclose(value: () => Boolean): Self = StObject.set(x, "getPreventSelectionOnDisclose", js.Any.fromFunction0(value))
      
      inline def setGetPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "getPreventSelectionOnDisclose", js.undefined)
      
      inline def setGetRefreshHeightOnUpdate(value: () => Boolean): Self = StObject.set(x, "getRefreshHeightOnUpdate", js.Any.fromFunction0(value))
      
      inline def setGetRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "getRefreshHeightOnUpdate", js.undefined)
      
      inline def setGetScrollDockedItems(value: () => Array): Self = StObject.set(x, "getScrollDockedItems", js.Any.fromFunction0(value))
      
      inline def setGetScrollDockedItemsUndefined: Self = StObject.set(x, "getScrollDockedItems", js.undefined)
      
      inline def setGetStriped(value: () => Boolean): Self = StObject.set(x, "getStriped", js.Any.fromFunction0(value))
      
      inline def setGetStripedUndefined: Self = StObject.set(x, "getStriped", js.undefined)
      
      inline def setGetUseHeaders(value: () => Boolean): Self = StObject.set(x, "getUseHeaders", js.Any.fromFunction0(value))
      
      inline def setGetUseHeadersUndefined: Self = StObject.set(x, "getUseHeaders", js.undefined)
      
      inline def setGetUseSimpleItems(value: () => Boolean): Self = StObject.set(x, "getUseSimpleItems", js.Any.fromFunction0(value))
      
      inline def setGetUseSimpleItemsUndefined: Self = StObject.set(x, "getUseSimpleItems", js.undefined)
      
      inline def setGetVariableHeights(value: () => Boolean): Self = StObject.set(x, "getVariableHeights", js.Any.fromFunction0(value))
      
      inline def setGetVariableHeightsUndefined: Self = StObject.set(x, "getVariableHeights", js.undefined)
      
      inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
      
      inline def setIndexBar(value: js.Any): Self = StObject.set(x, "indexBar", value.asInstanceOf[js.Any])
      
      inline def setIndexBarUndefined: Self = StObject.set(x, "indexBar", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setOnItemDisclosure(value: js.Any): Self = StObject.set(x, "onItemDisclosure", value.asInstanceOf[js.Any])
      
      inline def setOnItemDisclosureUndefined: Self = StObject.set(x, "onItemDisclosure", js.undefined)
      
      inline def setPinHeaders(value: Boolean): Self = StObject.set(x, "pinHeaders", value.asInstanceOf[js.Any])
      
      inline def setPinHeadersUndefined: Self = StObject.set(x, "pinHeaders", js.undefined)
      
      inline def setPreventSelectionOnDisclose(value: Boolean): Self = StObject.set(x, "preventSelectionOnDisclose", value.asInstanceOf[js.Any])
      
      inline def setPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "preventSelectionOnDisclose", js.undefined)
      
      inline def setRefreshHeightOnUpdate(value: Boolean): Self = StObject.set(x, "refreshHeightOnUpdate", value.asInstanceOf[js.Any])
      
      inline def setRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "refreshHeightOnUpdate", js.undefined)
      
      inline def setScrollToRecord(
        value: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "scrollToRecord", js.Any.fromFunction3(value))
      
      inline def setScrollToRecordUndefined: Self = StObject.set(x, "scrollToRecord", js.undefined)
      
      inline def setSetDisclosureProperty(value: /* disclosureProperty */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisclosureProperty", js.Any.fromFunction1(value))
      
      inline def setSetDisclosurePropertyUndefined: Self = StObject.set(x, "setDisclosureProperty", js.undefined)
      
      inline def setSetGrouped(value: /* grouped */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setGrouped", js.Any.fromFunction1(value))
      
      inline def setSetGroupedUndefined: Self = StObject.set(x, "setGrouped", js.undefined)
      
      inline def setSetIcon(value: /* icon */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      inline def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      inline def setSetIndexBar(value: /* indexBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIndexBar", js.Any.fromFunction1(value))
      
      inline def setSetIndexBarUndefined: Self = StObject.set(x, "setIndexBar", js.undefined)
      
      inline def setSetInfinite(value: /* infinite */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setInfinite", js.Any.fromFunction1(value))
      
      inline def setSetInfiniteUndefined: Self = StObject.set(x, "setInfinite", js.undefined)
      
      inline def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setItemHeight", js.Any.fromFunction1(value))
      
      inline def setSetItemHeightUndefined: Self = StObject.set(x, "setItemHeight", js.undefined)
      
      inline def setSetMinimumBufferDistance(value: /* minimumBufferDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinimumBufferDistance", js.Any.fromFunction1(value))
      
      inline def setSetMinimumBufferDistanceUndefined: Self = StObject.set(x, "setMinimumBufferDistance", js.undefined)
      
      inline def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnItemDisclosure", js.Any.fromFunction1(value))
      
      inline def setSetOnItemDisclosureUndefined: Self = StObject.set(x, "setOnItemDisclosure", js.undefined)
      
      inline def setSetPinHeaders(value: /* pinHeaders */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPinHeaders", js.Any.fromFunction1(value))
      
      inline def setSetPinHeadersUndefined: Self = StObject.set(x, "setPinHeaders", js.undefined)
      
      inline def setSetPreventSelectionOnDisclose(value: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPreventSelectionOnDisclose", js.Any.fromFunction1(value))
      
      inline def setSetPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "setPreventSelectionOnDisclose", js.undefined)
      
      inline def setSetRefreshHeightOnUpdate(value: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRefreshHeightOnUpdate", js.Any.fromFunction1(value))
      
      inline def setSetRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "setRefreshHeightOnUpdate", js.undefined)
      
      inline def setSetStriped(value: /* striped */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStriped", js.Any.fromFunction1(value))
      
      inline def setSetStripedUndefined: Self = StObject.set(x, "setStriped", js.undefined)
      
      inline def setSetUseHeaders(value: /* useHeaders */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseHeaders", js.Any.fromFunction1(value))
      
      inline def setSetUseHeadersUndefined: Self = StObject.set(x, "setUseHeaders", js.undefined)
      
      inline def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleItems", js.Any.fromFunction1(value))
      
      inline def setSetUseSimpleItemsUndefined: Self = StObject.set(x, "setUseSimpleItems", js.undefined)
      
      inline def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setVariableHeights", js.Any.fromFunction1(value))
      
      inline def setSetVariableHeightsUndefined: Self = StObject.set(x, "setVariableHeights", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      inline def setUseSimpleItems(value: Boolean): Self = StObject.set(x, "useSimpleItems", value.asInstanceOf[js.Any])
      
      inline def setUseSimpleItemsUndefined: Self = StObject.set(x, "useSimpleItems", js.undefined)
      
      inline def setVariableHeights(value: Boolean): Self = StObject.set(x, "variableHeights", value.asInstanceOf[js.Any])
      
      inline def setVariableHeightsUndefined: Self = StObject.set(x, "variableHeights", js.undefined)
    }
  }
  
  trait IListItemHeader
    extends StObject
       with IComponent
  object IListItemHeader {
    
    inline def apply(): IListItemHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListItemHeader]
    }
  }
  
  trait INestedList
    extends StObject
       with IContainer {
    
    /** [Config Option] (Boolean) */
    var allowDeselect: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var backButton: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var backText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var clearSelectionDelay: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Ext.Component) */
    var detailCard: js.UndefOr[IComponent] = js.undefined
    
    /** [Config Option] (Ext.Container) */
    var detailContainer: js.UndefOr[IContainer] = js.undefined
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var emptyText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of allowDeselect
      * @returns Boolean
      */
    var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of backButton
      * @returns Object
      */
    var getBackButton: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of backText
      * @returns String
      */
    var getBackText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of clearSelectionOnListChange
      * @returns Boolean
      */
    var getClearSelectionOnListChange: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of detailCard
      * @returns Ext.Component
      */
    var getDetailCard: js.UndefOr[js.Function0[IComponent]] = js.undefined
    
    /** [Method] Returns the value of detailContainer
      * @returns Ext.Container
      */
    var getDetailContainer: js.UndefOr[js.Function0[IContainer]] = js.undefined
    
    /** [Method] Returns the value of displayField
      * @returns String
      */
    var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of emptyText
      * @returns String
      */
    var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of itemHeight
      * @returns Number
      */
    var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Override this method to provide custom template rendering of individual nodes
      * @param node Ext.data.Record
      * @returns String
      */
    var getItemTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of listConfig
      * @returns Object
      */
    var getListConfig: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of loadingText
      * @returns String
      */
    var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of onItemDisclosure
      * @returns Boolean/Function
      */
    var getOnItemDisclosure: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of store
      * @returns Ext.data.TreeStore/String
      */
    var getStore: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the subList for a specified node  */
    var getSubList: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the value of title
      * @returns String
      */
    var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
      * @param node Ext.data.Record
      * @returns String
      */
    var getTitleTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of toolbar
      * @returns Ext.Toolbar/Object/Boolean
      */
    var getToolbar: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of updateTitleText
      * @returns Boolean
      */
    var getUpdateTitleText: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useSimpleItems
      * @returns Boolean
      */
    var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useTitleAsBackText
      * @returns Boolean
      */
    var getUseTitleAsBackText: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useToolbar
      * @returns Boolean
      */
    var getUseToolbar: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of variableHeights
      * @returns Boolean
      */
    var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] The leaf you want to navigate to
      * @param node Ext.data.NodeInterface The specified node to navigate to.
      */
    var goToLeaf: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
    
    /** [Method] Method to handle going to a specific node within this nested list
      * @param node Ext.data.NodeInterface The specified node to navigate to.
      */
    var goToNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var listConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var loadingText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Called when the backButton has been tapped  */
    var onBackTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean/Function) */
    var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Called when an list item has been tapped
      * @param list Ext.List The subList the item is on.
      * @param index Number The id of the item tapped.
      * @param target Ext.Element The list item tapped.
      * @param record Ext.data.Record The record which as tapped.
      * @param e Ext.event.Event The event.
      */
    var onItemTap: js.UndefOr[
        js.Function5[
          /* list */ js.UndefOr[typings.senchaTouch.Ext.IList], 
          /* index */ js.UndefOr[Double], 
          /* target */ js.UndefOr[IElement], 
          /* record */ js.UndefOr[IRecord], 
          /* e */ js.UndefOr[IEvent], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of allowDeselect
      * @param allowDeselect Boolean The new value.
      */
    var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of backButton
      * @param backButton Object The new value.
      */
    var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of backText
      * @param backText String The new value.
      */
    var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of clearSelectionOnListChange
      * @param clearSelectionOnListChange Boolean The new value.
      */
    var setClearSelectionOnListChange: js.UndefOr[js.Function1[/* clearSelectionOnListChange */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of detailCard
      * @param detailCard Ext.Component The new value.
      */
    var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Method] Sets the value of detailContainer
      * @param detailContainer Ext.Container The new value.
      */
    var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], Unit]] = js.undefined
    
    /** [Method] Sets the value of displayField
      * @param displayField String The new value.
      */
    var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of emptyText
      * @param emptyText String The new value.
      */
    var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of itemHeight
      * @param itemHeight Number The new value.
      */
    var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of listConfig
      * @param listConfig Object The new value.
      */
    var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of loadingText
      * @param loadingText String The new value.
      */
    var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of onItemDisclosure
      * @param onItemDisclosure Boolean/Function The new value.
      */
    var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of store
      * @param store Ext.data.TreeStore/String The new value.
      */
    var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of title
      * @param title String The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of toolbar
      * @param toolbar Ext.Toolbar/Object/Boolean The new value.
      */
    var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of ui
      * @param ui Object The new value.
      */
    @JSName("setUi")
    var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of updateTitleText
      * @param updateTitleText Boolean The new value.
      */
    var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useSimpleItems
      * @param useSimpleItems Boolean The new value.
      */
    var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useTitleAsBackText
      * @param useTitleAsBackText Boolean The new value.
      */
    var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useToolbar
      * @param useToolbar Boolean The new value.
      */
    var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of variableHeights
      * @param variableHeights Boolean The new value.
      */
    var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (Ext.data.TreeStore/String) */
    var store: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Ext.Toolbar/Object/Boolean) */
    var toolbar: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var updateTitleText: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useSimpleItems: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useTitleAsBackText: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var variableHeights: js.UndefOr[Boolean] = js.undefined
  }
  object INestedList {
    
    inline def apply(): typings.senchaTouch.Ext.dataview.INestedList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.INestedList]
    }
    
    extension [Self <: typings.senchaTouch.Ext.dataview.INestedList](x: Self) {
      
      inline def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
      
      inline def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
      
      inline def setBackButton(value: js.Any): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
      
      inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
      
      inline def setBackText(value: java.lang.String): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
      
      inline def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
      
      inline def setClearSelectionDelay(value: Double): Self = StObject.set(x, "clearSelectionDelay", value.asInstanceOf[js.Any])
      
      inline def setClearSelectionDelayUndefined: Self = StObject.set(x, "clearSelectionDelay", js.undefined)
      
      inline def setDetailCard(value: IComponent): Self = StObject.set(x, "detailCard", value.asInstanceOf[js.Any])
      
      inline def setDetailCardUndefined: Self = StObject.set(x, "detailCard", js.undefined)
      
      inline def setDetailContainer(value: IContainer): Self = StObject.set(x, "detailContainer", value.asInstanceOf[js.Any])
      
      inline def setDetailContainerUndefined: Self = StObject.set(x, "detailContainer", js.undefined)
      
      inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      inline def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setGetAllowDeselect(value: () => Boolean): Self = StObject.set(x, "getAllowDeselect", js.Any.fromFunction0(value))
      
      inline def setGetAllowDeselectUndefined: Self = StObject.set(x, "getAllowDeselect", js.undefined)
      
      inline def setGetBackButton(value: () => js.Any): Self = StObject.set(x, "getBackButton", js.Any.fromFunction0(value))
      
      inline def setGetBackButtonUndefined: Self = StObject.set(x, "getBackButton", js.undefined)
      
      inline def setGetBackText(value: () => java.lang.String): Self = StObject.set(x, "getBackText", js.Any.fromFunction0(value))
      
      inline def setGetBackTextUndefined: Self = StObject.set(x, "getBackText", js.undefined)
      
      inline def setGetClearSelectionOnListChange(value: () => Boolean): Self = StObject.set(x, "getClearSelectionOnListChange", js.Any.fromFunction0(value))
      
      inline def setGetClearSelectionOnListChangeUndefined: Self = StObject.set(x, "getClearSelectionOnListChange", js.undefined)
      
      inline def setGetDetailCard(value: () => IComponent): Self = StObject.set(x, "getDetailCard", js.Any.fromFunction0(value))
      
      inline def setGetDetailCardUndefined: Self = StObject.set(x, "getDetailCard", js.undefined)
      
      inline def setGetDetailContainer(value: () => IContainer): Self = StObject.set(x, "getDetailContainer", js.Any.fromFunction0(value))
      
      inline def setGetDetailContainerUndefined: Self = StObject.set(x, "getDetailContainer", js.undefined)
      
      inline def setGetDisplayField(value: () => java.lang.String): Self = StObject.set(x, "getDisplayField", js.Any.fromFunction0(value))
      
      inline def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
      
      inline def setGetEmptyText(value: () => java.lang.String): Self = StObject.set(x, "getEmptyText", js.Any.fromFunction0(value))
      
      inline def setGetEmptyTextUndefined: Self = StObject.set(x, "getEmptyText", js.undefined)
      
      inline def setGetItemHeight(value: () => Double): Self = StObject.set(x, "getItemHeight", js.Any.fromFunction0(value))
      
      inline def setGetItemHeightUndefined: Self = StObject.set(x, "getItemHeight", js.undefined)
      
      inline def setGetItemTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = StObject.set(x, "getItemTextTpl", js.Any.fromFunction1(value))
      
      inline def setGetItemTextTplUndefined: Self = StObject.set(x, "getItemTextTpl", js.undefined)
      
      inline def setGetListConfig(value: () => js.Any): Self = StObject.set(x, "getListConfig", js.Any.fromFunction0(value))
      
      inline def setGetListConfigUndefined: Self = StObject.set(x, "getListConfig", js.undefined)
      
      inline def setGetLoadingText(value: () => java.lang.String): Self = StObject.set(x, "getLoadingText", js.Any.fromFunction0(value))
      
      inline def setGetLoadingTextUndefined: Self = StObject.set(x, "getLoadingText", js.undefined)
      
      inline def setGetOnItemDisclosure(value: () => js.Any): Self = StObject.set(x, "getOnItemDisclosure", js.Any.fromFunction0(value))
      
      inline def setGetOnItemDisclosureUndefined: Self = StObject.set(x, "getOnItemDisclosure", js.undefined)
      
      inline def setGetStore(value: () => js.Any): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
      
      inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      inline def setGetSubList(value: () => Unit): Self = StObject.set(x, "getSubList", js.Any.fromFunction0(value))
      
      inline def setGetSubListUndefined: Self = StObject.set(x, "getSubList", js.undefined)
      
      inline def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTitleTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = StObject.set(x, "getTitleTextTpl", js.Any.fromFunction1(value))
      
      inline def setGetTitleTextTplUndefined: Self = StObject.set(x, "getTitleTextTpl", js.undefined)
      
      inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      inline def setGetToolbar(value: () => js.Any): Self = StObject.set(x, "getToolbar", js.Any.fromFunction0(value))
      
      inline def setGetToolbarUndefined: Self = StObject.set(x, "getToolbar", js.undefined)
      
      inline def setGetUpdateTitleText(value: () => Boolean): Self = StObject.set(x, "getUpdateTitleText", js.Any.fromFunction0(value))
      
      inline def setGetUpdateTitleTextUndefined: Self = StObject.set(x, "getUpdateTitleText", js.undefined)
      
      inline def setGetUseSimpleItems(value: () => Boolean): Self = StObject.set(x, "getUseSimpleItems", js.Any.fromFunction0(value))
      
      inline def setGetUseSimpleItemsUndefined: Self = StObject.set(x, "getUseSimpleItems", js.undefined)
      
      inline def setGetUseTitleAsBackText(value: () => Boolean): Self = StObject.set(x, "getUseTitleAsBackText", js.Any.fromFunction0(value))
      
      inline def setGetUseTitleAsBackTextUndefined: Self = StObject.set(x, "getUseTitleAsBackText", js.undefined)
      
      inline def setGetUseToolbar(value: () => Boolean): Self = StObject.set(x, "getUseToolbar", js.Any.fromFunction0(value))
      
      inline def setGetUseToolbarUndefined: Self = StObject.set(x, "getUseToolbar", js.undefined)
      
      inline def setGetVariableHeights(value: () => Boolean): Self = StObject.set(x, "getVariableHeights", js.Any.fromFunction0(value))
      
      inline def setGetVariableHeightsUndefined: Self = StObject.set(x, "getVariableHeights", js.undefined)
      
      inline def setGoToLeaf(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = StObject.set(x, "goToLeaf", js.Any.fromFunction1(value))
      
      inline def setGoToLeafUndefined: Self = StObject.set(x, "goToLeaf", js.undefined)
      
      inline def setGoToNode(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = StObject.set(x, "goToNode", js.Any.fromFunction1(value))
      
      inline def setGoToNodeUndefined: Self = StObject.set(x, "goToNode", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setListConfig(value: js.Any): Self = StObject.set(x, "listConfig", value.asInstanceOf[js.Any])
      
      inline def setListConfigUndefined: Self = StObject.set(x, "listConfig", js.undefined)
      
      inline def setLoadingText(value: java.lang.String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      inline def setOnBackTap(value: () => Unit): Self = StObject.set(x, "onBackTap", js.Any.fromFunction0(value))
      
      inline def setOnBackTapUndefined: Self = StObject.set(x, "onBackTap", js.undefined)
      
      inline def setOnItemDisclosure(value: js.Any): Self = StObject.set(x, "onItemDisclosure", value.asInstanceOf[js.Any])
      
      inline def setOnItemDisclosureUndefined: Self = StObject.set(x, "onItemDisclosure", js.undefined)
      
      inline def setOnItemTap(
        value: (/* list */ js.UndefOr[typings.senchaTouch.Ext.IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Unit
      ): Self = StObject.set(x, "onItemTap", js.Any.fromFunction5(value))
      
      inline def setOnItemTapUndefined: Self = StObject.set(x, "onItemTap", js.undefined)
      
      inline def setSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDeselect", js.Any.fromFunction1(value))
      
      inline def setSetAllowDeselectUndefined: Self = StObject.set(x, "setAllowDeselect", js.undefined)
      
      inline def setSetBackButton(value: /* backButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBackButton", js.Any.fromFunction1(value))
      
      inline def setSetBackButtonUndefined: Self = StObject.set(x, "setBackButton", js.undefined)
      
      inline def setSetBackText(value: /* backText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBackText", js.Any.fromFunction1(value))
      
      inline def setSetBackTextUndefined: Self = StObject.set(x, "setBackText", js.undefined)
      
      inline def setSetClearSelectionOnListChange(value: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setClearSelectionOnListChange", js.Any.fromFunction1(value))
      
      inline def setSetClearSelectionOnListChangeUndefined: Self = StObject.set(x, "setClearSelectionOnListChange", js.undefined)
      
      inline def setSetDetailCard(value: /* detailCard */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "setDetailCard", js.Any.fromFunction1(value))
      
      inline def setSetDetailCardUndefined: Self = StObject.set(x, "setDetailCard", js.undefined)
      
      inline def setSetDetailContainer(value: /* detailContainer */ js.UndefOr[IContainer] => Unit): Self = StObject.set(x, "setDetailContainer", js.Any.fromFunction1(value))
      
      inline def setSetDetailContainerUndefined: Self = StObject.set(x, "setDetailContainer", js.undefined)
      
      inline def setSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1(value))
      
      inline def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
      
      inline def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEmptyText", js.Any.fromFunction1(value))
      
      inline def setSetEmptyTextUndefined: Self = StObject.set(x, "setEmptyText", js.undefined)
      
      inline def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setItemHeight", js.Any.fromFunction1(value))
      
      inline def setSetItemHeightUndefined: Self = StObject.set(x, "setItemHeight", js.undefined)
      
      inline def setSetListConfig(value: /* listConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setListConfig", js.Any.fromFunction1(value))
      
      inline def setSetListConfigUndefined: Self = StObject.set(x, "setListConfig", js.undefined)
      
      inline def setSetLoadingText(value: /* loadingText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
      
      inline def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
      
      inline def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnItemDisclosure", js.Any.fromFunction1(value))
      
      inline def setSetOnItemDisclosureUndefined: Self = StObject.set(x, "setOnItemDisclosure", js.undefined)
      
      inline def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
      
      inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
      
      inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setToolbar", js.Any.fromFunction1(value))
      
      inline def setSetToolbarUndefined: Self = StObject.set(x, "setToolbar", js.undefined)
      
      inline def setSetUi(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUi", js.Any.fromFunction1(value))
      
      inline def setSetUiUndefined: Self = StObject.set(x, "setUi", js.undefined)
      
      inline def setSetUpdateTitleText(value: /* updateTitleText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUpdateTitleText", js.Any.fromFunction1(value))
      
      inline def setSetUpdateTitleTextUndefined: Self = StObject.set(x, "setUpdateTitleText", js.undefined)
      
      inline def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleItems", js.Any.fromFunction1(value))
      
      inline def setSetUseSimpleItemsUndefined: Self = StObject.set(x, "setUseSimpleItems", js.undefined)
      
      inline def setSetUseTitleAsBackText(value: /* useTitleAsBackText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseTitleAsBackText", js.Any.fromFunction1(value))
      
      inline def setSetUseTitleAsBackTextUndefined: Self = StObject.set(x, "setUseTitleAsBackText", js.undefined)
      
      inline def setSetUseToolbar(value: /* useToolbar */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseToolbar", js.Any.fromFunction1(value))
      
      inline def setSetUseToolbarUndefined: Self = StObject.set(x, "setUseToolbar", js.undefined)
      
      inline def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setVariableHeights", js.Any.fromFunction1(value))
      
      inline def setSetVariableHeightsUndefined: Self = StObject.set(x, "setVariableHeights", js.undefined)
      
      inline def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbar(value: js.Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setUpdateTitleText(value: Boolean): Self = StObject.set(x, "updateTitleText", value.asInstanceOf[js.Any])
      
      inline def setUpdateTitleTextUndefined: Self = StObject.set(x, "updateTitleText", js.undefined)
      
      inline def setUseSimpleItems(value: Boolean): Self = StObject.set(x, "useSimpleItems", value.asInstanceOf[js.Any])
      
      inline def setUseSimpleItemsUndefined: Self = StObject.set(x, "useSimpleItems", js.undefined)
      
      inline def setUseTitleAsBackText(value: Boolean): Self = StObject.set(x, "useTitleAsBackText", value.asInstanceOf[js.Any])
      
      inline def setUseTitleAsBackTextUndefined: Self = StObject.set(x, "useTitleAsBackText", js.undefined)
      
      inline def setUseToolbar(value: Boolean): Self = StObject.set(x, "useToolbar", value.asInstanceOf[js.Any])
      
      inline def setUseToolbarUndefined: Self = StObject.set(x, "useToolbar", js.undefined)
      
      inline def setVariableHeights(value: Boolean): Self = StObject.set(x, "variableHeights", value.asInstanceOf[js.Any])
      
      inline def setVariableHeightsUndefined: Self = StObject.set(x, "variableHeights", js.undefined)
    }
  }
  
  object component {
    
    trait IContainer
      extends StObject
         with typings.senchaTouch.Ext.IContainer
    object IContainer {
      
      inline def apply(): typings.senchaTouch.Ext.dataview.component.IContainer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.component.IContainer]
      }
    }
    
    trait IDataItem
      extends StObject
         with typings.senchaTouch.Ext.IContainer {
      
      /** [Config Option] (Object) */
      var dataMap: js.UndefOr[js.Any] = js.undefined
      
      /** [Method] Returns the value of dataMap
        * @returns Object
        */
      var getDataMap: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Returns the value of itemCls
        * @returns String
        */
      var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of items
        * @returns Array
        */
      @JSName("getItems")
      var getItems_IDataItem: js.UndefOr[js.Function0[Array]] = js.undefined
      
      /** [Config Option] (String) */
      var itemCls: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Method] Sets the value of dataMap
        * @param dataMap Object The new value.
        */
      var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of itemCls
        * @param itemCls String The new value.
        */
      var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of items
        * @param items Array The new value.
        */
      @JSName("setItems")
      var setItems_IDataItem: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.undefined
      
      /** [Method] Sets the value of width
        * @param width String The new value.
        */
      @JSName("setWidth")
      var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object IDataItem {
      
      inline def apply(): IDataItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDataItem]
      }
      
      extension [Self <: IDataItem](x: Self) {
        
        inline def setDataMap(value: js.Any): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
        
        inline def setDataMapUndefined: Self = StObject.set(x, "dataMap", js.undefined)
        
        inline def setGetDataMap(value: () => js.Any): Self = StObject.set(x, "getDataMap", js.Any.fromFunction0(value))
        
        inline def setGetDataMapUndefined: Self = StObject.set(x, "getDataMap", js.undefined)
        
        inline def setGetItemCls(value: () => java.lang.String): Self = StObject.set(x, "getItemCls", js.Any.fromFunction0(value))
        
        inline def setGetItemClsUndefined: Self = StObject.set(x, "getItemCls", js.undefined)
        
        inline def setGetItems(value: () => Array): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
        
        inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
        
        inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
        
        inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
        
        inline def setSetDataMap(value: /* dataMap */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDataMap", js.Any.fromFunction1(value))
        
        inline def setSetDataMapUndefined: Self = StObject.set(x, "setDataMap", js.undefined)
        
        inline def setSetItemCls(value: /* itemCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemCls", js.Any.fromFunction1(value))
        
        inline def setSetItemClsUndefined: Self = StObject.set(x, "setItemCls", js.undefined)
        
        inline def setSetItems(value: /* items */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
        
        inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
        
        inline def setSetWidth(value: /* width */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
        
        inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      }
    }
    
    trait IListItem
      extends StObject
         with IDataItem {
      
      /** [Method] Returns the value of body
        * @returns Object
        */
      var getBody: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Returns the value of disclosure
        * @returns Object
        */
      var getDisclosure: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Returns the value of header
        * @returns Object
        */
      var getHeader: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Sets the value of body
        * @param body Object The new value.
        */
      var setBody: js.UndefOr[js.Function1[/* body */ js.UndefOr[js.Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of disclosure
        * @param disclosure Object The new value.
        */
      var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of header
        * @param header Object The new value.
        */
      var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
    }
    object IListItem {
      
      inline def apply(): IListItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IListItem]
      }
      
      extension [Self <: IListItem](x: Self) {
        
        inline def setGetBody(value: () => js.Any): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
        
        inline def setGetBodyUndefined: Self = StObject.set(x, "getBody", js.undefined)
        
        inline def setGetDisclosure(value: () => js.Any): Self = StObject.set(x, "getDisclosure", js.Any.fromFunction0(value))
        
        inline def setGetDisclosureUndefined: Self = StObject.set(x, "getDisclosure", js.undefined)
        
        inline def setGetHeader(value: () => js.Any): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
        
        inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
        
        inline def setSetBody(value: /* body */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBody", js.Any.fromFunction1(value))
        
        inline def setSetBodyUndefined: Self = StObject.set(x, "setBody", js.undefined)
        
        inline def setSetDisclosure(value: /* disclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDisclosure", js.Any.fromFunction1(value))
        
        inline def setSetDisclosureUndefined: Self = StObject.set(x, "setDisclosure", js.undefined)
        
        inline def setSetHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
        
        inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      }
    }
    
    trait ISimpleListItem
      extends StObject
         with IComponent {
      
      /** [Method] Returns the value of disclosure
        * @returns Object
        */
      var getDisclosure: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Returns the value of header
        * @returns Object
        */
      var getHeader: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Sets the value of disclosure
        * @param disclosure Object The new value.
        */
      var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of header
        * @param header Object The new value.
        */
      var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
    }
    object ISimpleListItem {
      
      inline def apply(): ISimpleListItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISimpleListItem]
      }
      
      extension [Self <: ISimpleListItem](x: Self) {
        
        inline def setGetDisclosure(value: () => js.Any): Self = StObject.set(x, "getDisclosure", js.Any.fromFunction0(value))
        
        inline def setGetDisclosureUndefined: Self = StObject.set(x, "getDisclosure", js.undefined)
        
        inline def setGetHeader(value: () => js.Any): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
        
        inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
        
        inline def setSetDisclosure(value: /* disclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDisclosure", js.Any.fromFunction1(value))
        
        inline def setSetDisclosureUndefined: Self = StObject.set(x, "setDisclosure", js.undefined)
        
        inline def setSetHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
        
        inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      }
    }
  }
  
  object element {
    
    trait IContainer
      extends StObject
         with IComponent
    object IContainer {
      
      inline def apply(): typings.senchaTouch.Ext.dataview.element.IContainer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.element.IContainer]
      }
    }
    
    trait IList
      extends StObject
         with typings.senchaTouch.Ext.dataview.element.IContainer
    object IList {
      
      inline def apply(): typings.senchaTouch.Ext.dataview.element.IList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.dataview.element.IList]
      }
    }
  }
}
