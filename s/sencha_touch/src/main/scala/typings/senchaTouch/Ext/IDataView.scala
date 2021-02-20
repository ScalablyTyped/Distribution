package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ @js.native
trait IDataView extends IContainer {
  
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.native
  
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.native
  
  /** [Method] Deselects the given record s
    * @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
    * @param suppressEvent Boolean If true the deselect event will not be fired.
    */
  var deselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Deselects all records
    * @param supress Object
    */
  var deselectAll: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  
  /** [Method] Deselects a record instance by record instance or index
    * @param records Ext.data.Model/Number An array of records or an index.
    * @param suppressEvent Boolean Set to false to not fire a deselect event.
    */
  var doDeselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Selects a record instance by record instance or index
    * @param records Ext.data.Model/Number An array of records or an index.
    * @param keepExisting Boolean
    * @param suppressEvent Boolean Set to false to not fire a select event.
    */
  var doSelect: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of allowDeselect
    * @returns Boolean
    */
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the number of selections
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object[]
    */
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of deferEmptyText
    * @returns Boolean
    */
  var getDeferEmptyText: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of deselectOnContainerClick
    * @returns Boolean
    */
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of disableSelection
    * @returns Boolean
    */
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of emptyText
    * @returns String
    */
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of inline
    * @returns Boolean/Object
    */
  var getInline: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns an item at the specified index
    * @param index Number Index of the item.
    * @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
    */
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Returns the value of itemCls
    * @returns String
    */
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of itemConfig
    * @returns Object
    */
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns an index for the specified item
    * @param item Number The item to locate.
    * @returns Number Index for the specified item.
    */
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[Double], Double]] = js.native
  
  /** [Method] Returns the value of itemTpl
    * @returns String/String[]/Ext.XTemplate
    */
  var getItemTpl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the array of previously selected items
    * @returns Array The previous selection.
    */
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of loadingText
    * @returns String/Boolean
    */
  var getLoadingText: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of maxItemCache
    * @returns Number
    */
  var getMaxItemCache: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of mode
    * @returns String
    */
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of pressedDelay
    * @returns Number
    */
  var getPressedDelay: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of scrollToTopOnRefresh
    * @returns Boolean
    */
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of selectedCls
    * @returns String
    */
  var getSelectedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns an array of the currently selected records
    * @returns Array An array of selected records.
    */
  var getSelection: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the number of selections
    * @returns Number
    */
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the selection mode currently used by this Selectable
    * @returns String The current mode.
    */
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of store
    * @returns Ext.data.Store/Object
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of triggerCtEvent
    * @returns String
    */
  var getTriggerCtEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of triggerEvent
    * @returns String
    */
  var getTriggerEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of useComponents
    * @returns Boolean
    */
  var getUseComponents: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns an array of the current items in the DataView
    * @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
    */
  var getViewItems: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true if there is a selected record
    * @returns Boolean
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns true if the Selectable is currently locked
    * @returns Boolean True if currently locked
    */
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the specified row is selected
    * @param record Ext.data.Model/Number The record or index of the record to check.
    * @returns Boolean
    */
  var isSelected: js.UndefOr[js.Function1[js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[Double] = js.native
  
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[Boolean] = js.native
  
  /** [Method] Adds the given records to the currently selected set
    * @param records Ext.data.Model/Array/Number The records to select.
    * @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
    * @param suppressEvent Boolean If true, the select event will not be fired.
    */
  var select: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Selects all records
    * @param silent Boolean true to suppress all select events.
    */
  var selectAll: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
    * @param startRecord Number The index of the first row in the range.
    * @param endRecord Number The index of the last row in the range.
    * @param keepExisting Boolean true to retain existing selections.
    */
  var selectRange: js.UndefOr[js.Function3[js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of allowDeselect
    * @param allowDeselect Boolean The new value.
    */
  var setAllowDeselect: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object[] The new value.
    */
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of deferEmptyText
    * @param deferEmptyText Boolean The new value.
    */
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of deselectOnContainerClick
    * @param deselectOnContainerClick Boolean The new value.
    */
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of disableSelection
    * @param disableSelection Boolean The new value.
    */
  var setDisableSelection: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of emptyText
    * @param emptyText String The new value.
    */
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of inline
    * @param inline Boolean/Object The new value.
    */
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of itemCls
    * @param itemCls String The new value.
    */
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of itemConfig
    * @param itemConfig Object The new value.
    */
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of itemTpl
    * @param itemTpl String/String[]/Ext.XTemplate The new value.
    */
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of loadingText
    * @param loadingText String/Boolean The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of maxItemCache
    * @param maxItemCache Number The new value.
    */
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of mode
    * @param mode String The new value.
    */
  var setMode: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of pressedDelay
    * @param pressedDelay Number The new value.
    */
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of scrollToTopOnRefresh
    * @param scrollToTopOnRefresh Boolean The new value.
    */
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of selectedCls
    * @param selectedCls String The new value.
    */
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of store
    * @param store Ext.data.Store/Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of triggerCtEvent
    * @param triggerCtEvent String The new value.
    */
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of triggerEvent
    * @param triggerEvent String The new value.
    */
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of useComponents
    * @param useComponents Boolean The new value.
    */
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets a record as the last focused record
    * @param newRecord Ext.data.Record
    * @param oldRecord Ext.data.Record
    */
  var updateLastFocused: js.UndefOr[js.Function2[js.UndefOr[IRecord], js.UndefOr[IRecord], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[Boolean] = js.native
}
object IDataView {
  
  @scala.inline
  def apply(): IDataView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataView]
  }
  
  @scala.inline
  implicit class IDataViewMutableBuilder[Self <: IDataView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
    
    @scala.inline
    def setBindStore(value: () => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setBlockRefresh(value: Boolean): Self = StObject.set(x, "blockRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockRefreshUndefined: Self = StObject.set(x, "blockRefresh", js.undefined)
    
    @scala.inline
    def setClearSelections(value: () => Unit): Self = StObject.set(x, "clearSelections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearSelectionsUndefined: Self = StObject.set(x, "clearSelections", js.undefined)
    
    @scala.inline
    def setCollectData(value: () => Unit): Self = StObject.set(x, "collectData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollectDataUndefined: Self = StObject.set(x, "collectData", js.undefined)
    
    @scala.inline
    def setData(value: Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeferEmptyText(value: Boolean): Self = StObject.set(x, "deferEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferEmptyTextUndefined: Self = StObject.set(x, "deferEmptyText", js.undefined)
    
    @scala.inline
    def setDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeselectAll(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeselectAllUndefined: Self = StObject.set(x, "deselectAll", js.undefined)
    
    @scala.inline
    def setDeselectOnContainerClick(value: Boolean): Self = StObject.set(x, "deselectOnContainerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectOnContainerClickUndefined: Self = StObject.set(x, "deselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
    
    @scala.inline
    def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
    
    @scala.inline
    def setDoDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "doDeselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoDeselectUndefined: Self = StObject.set(x, "doDeselect", js.undefined)
    
    @scala.inline
    def setDoSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "doSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoSelectUndefined: Self = StObject.set(x, "doSelect", js.undefined)
    
    @scala.inline
    def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    @scala.inline
    def setFindItemByChild(value: () => Unit): Self = StObject.set(x, "findItemByChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindItemByChildUndefined: Self = StObject.set(x, "findItemByChild", js.undefined)
    
    @scala.inline
    def setFindTargetByEvent(value: () => Unit): Self = StObject.set(x, "findTargetByEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindTargetByEventUndefined: Self = StObject.set(x, "findTargetByEvent", js.undefined)
    
    @scala.inline
    def setGetAllowDeselect(value: () => Boolean): Self = StObject.set(x, "getAllowDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowDeselectUndefined: Self = StObject.set(x, "getAllowDeselect", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetData(value: () => Array): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setGetDeferEmptyText(value: () => Boolean): Self = StObject.set(x, "getDeferEmptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeferEmptyTextUndefined: Self = StObject.set(x, "getDeferEmptyText", js.undefined)
    
    @scala.inline
    def setGetDeselectOnContainerClick(value: () => Boolean): Self = StObject.set(x, "getDeselectOnContainerClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeselectOnContainerClickUndefined: Self = StObject.set(x, "getDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setGetDisableSelection(value: () => Boolean): Self = StObject.set(x, "getDisableSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisableSelectionUndefined: Self = StObject.set(x, "getDisableSelection", js.undefined)
    
    @scala.inline
    def setGetEmptyText(value: () => java.lang.String): Self = StObject.set(x, "getEmptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEmptyTextUndefined: Self = StObject.set(x, "getEmptyText", js.undefined)
    
    @scala.inline
    def setGetInline(value: () => _): Self = StObject.set(x, "getInline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInlineUndefined: Self = StObject.set(x, "getInline", js.undefined)
    
    @scala.inline
    def setGetItemAt(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "getItemAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemAtUndefined: Self = StObject.set(x, "getItemAt", js.undefined)
    
    @scala.inline
    def setGetItemCls(value: () => java.lang.String): Self = StObject.set(x, "getItemCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemClsUndefined: Self = StObject.set(x, "getItemCls", js.undefined)
    
    @scala.inline
    def setGetItemConfig(value: () => _): Self = StObject.set(x, "getItemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemConfigUndefined: Self = StObject.set(x, "getItemConfig", js.undefined)
    
    @scala.inline
    def setGetItemIndex(value: /* item */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getItemIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemIndexUndefined: Self = StObject.set(x, "getItemIndex", js.undefined)
    
    @scala.inline
    def setGetItemTpl(value: () => _): Self = StObject.set(x, "getItemTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemTplUndefined: Self = StObject.set(x, "getItemTpl", js.undefined)
    
    @scala.inline
    def setGetLastSelected(value: () => Array): Self = StObject.set(x, "getLastSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastSelectedUndefined: Self = StObject.set(x, "getLastSelected", js.undefined)
    
    @scala.inline
    def setGetLoadingText(value: () => _): Self = StObject.set(x, "getLoadingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadingTextUndefined: Self = StObject.set(x, "getLoadingText", js.undefined)
    
    @scala.inline
    def setGetMaxItemCache(value: () => Double): Self = StObject.set(x, "getMaxItemCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxItemCacheUndefined: Self = StObject.set(x, "getMaxItemCache", js.undefined)
    
    @scala.inline
    def setGetMode(value: () => java.lang.String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModeUndefined: Self = StObject.set(x, "getMode", js.undefined)
    
    @scala.inline
    def setGetNode(value: () => Unit): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
    
    @scala.inline
    def setGetNodes(value: () => Unit): Self = StObject.set(x, "getNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodesUndefined: Self = StObject.set(x, "getNodes", js.undefined)
    
    @scala.inline
    def setGetPressedCls(value: () => java.lang.String): Self = StObject.set(x, "getPressedCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressedClsUndefined: Self = StObject.set(x, "getPressedCls", js.undefined)
    
    @scala.inline
    def setGetPressedDelay(value: () => Double): Self = StObject.set(x, "getPressedDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressedDelayUndefined: Self = StObject.set(x, "getPressedDelay", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => Unit): Self = StObject.set(x, "getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    @scala.inline
    def setGetScrollToTopOnRefresh(value: () => Boolean): Self = StObject.set(x, "getScrollToTopOnRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollToTopOnRefreshUndefined: Self = StObject.set(x, "getScrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setGetSelectedCls(value: () => java.lang.String): Self = StObject.set(x, "getSelectedCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedClsUndefined: Self = StObject.set(x, "getSelectedCls", js.undefined)
    
    @scala.inline
    def setGetSelectedNodes(value: () => Unit): Self = StObject.set(x, "getSelectedNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedNodesUndefined: Self = StObject.set(x, "getSelectedNodes", js.undefined)
    
    @scala.inline
    def setGetSelectedRecords(value: () => Unit): Self = StObject.set(x, "getSelectedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedRecordsUndefined: Self = StObject.set(x, "getSelectedRecords", js.undefined)
    
    @scala.inline
    def setGetSelection(value: () => Array): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionCount(value: () => Double): Self = StObject.set(x, "getSelectionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionCountUndefined: Self = StObject.set(x, "getSelectionCount", js.undefined)
    
    @scala.inline
    def setGetSelectionMode(value: () => java.lang.String): Self = StObject.set(x, "getSelectionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionModeUndefined: Self = StObject.set(x, "getSelectionMode", js.undefined)
    
    @scala.inline
    def setGetSelectionUndefined: Self = StObject.set(x, "getSelection", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setGetTriggerCtEvent(value: () => java.lang.String): Self = StObject.set(x, "getTriggerCtEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriggerCtEventUndefined: Self = StObject.set(x, "getTriggerCtEvent", js.undefined)
    
    @scala.inline
    def setGetTriggerEvent(value: () => java.lang.String): Self = StObject.set(x, "getTriggerEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriggerEventUndefined: Self = StObject.set(x, "getTriggerEvent", js.undefined)
    
    @scala.inline
    def setGetUseComponents(value: () => Boolean): Self = StObject.set(x, "getUseComponents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseComponentsUndefined: Self = StObject.set(x, "getUseComponents", js.undefined)
    
    @scala.inline
    def setGetViewItems(value: () => _): Self = StObject.set(x, "getViewItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewItemsUndefined: Self = StObject.set(x, "getViewItems", js.undefined)
    
    @scala.inline
    def setHandleException(value: () => Unit): Self = StObject.set(x, "handleException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleExceptionUndefined: Self = StObject.set(x, "handleException", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
    
    @scala.inline
    def setIndexOf(value: () => Unit): Self = StObject.set(x, "indexOf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setInline(value: js.Any): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    @scala.inline
    def setIsSelected(value: js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    @scala.inline
    def setItemConfig(value: js.Any): Self = StObject.set(x, "itemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemConfigUndefined: Self = StObject.set(x, "itemConfig", js.undefined)
    
    @scala.inline
    def setItemSelector(value: Boolean): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    @scala.inline
    def setItemTpl(value: js.Any): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setLoadingText(value: js.Any): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setMaxItemCache(value: Double): Self = StObject.set(x, "maxItemCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemCacheUndefined: Self = StObject.set(x, "maxItemCache", js.undefined)
    
    @scala.inline
    def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    @scala.inline
    def setOverItemCls(value: Boolean): Self = StObject.set(x, "overItemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverItemClsUndefined: Self = StObject.set(x, "overItemCls", js.undefined)
    
    @scala.inline
    def setPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _
    ): Self = StObject.set(x, "prepareData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrepareDataUndefined: Self = StObject.set(x, "prepareData", js.undefined)
    
    @scala.inline
    def setPressedCls(value: java.lang.String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    @scala.inline
    def setPressedDelay(value: Double): Self = StObject.set(x, "pressedDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedDelayUndefined: Self = StObject.set(x, "pressedDelay", js.undefined)
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshNode(value: () => Unit): Self = StObject.set(x, "refreshNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshNodeUndefined: Self = StObject.set(x, "refreshNode", js.undefined)
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setScrollToTopOnRefresh(value: Boolean): Self = StObject.set(x, "scrollToTopOnRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToTopOnRefreshUndefined: Self = StObject.set(x, "scrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectAll(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    @scala.inline
    def setSelectRange(value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "selectRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
    
    @scala.inline
    def setSelectedItemCls(value: Boolean): Self = StObject.set(x, "selectedItemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemClsUndefined: Self = StObject.set(x, "selectedItemCls", js.undefined)
    
    @scala.inline
    def setSetAllowDeselect(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowDeselectUndefined: Self = StObject.set(x, "setAllowDeselect", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    @scala.inline
    def setSetDeferEmptyText(value: /* deferEmptyText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDeferEmptyText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDeferEmptyTextUndefined: Self = StObject.set(x, "setDeferEmptyText", js.undefined)
    
    @scala.inline
    def setSetDeselectOnContainerClick(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDeselectOnContainerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDeselectOnContainerClickUndefined: Self = StObject.set(x, "setDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setSetDisableSelection(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisableSelectionUndefined: Self = StObject.set(x, "setDisableSelection", js.undefined)
    
    @scala.inline
    def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEmptyText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEmptyTextUndefined: Self = StObject.set(x, "setEmptyText", js.undefined)
    
    @scala.inline
    def setSetInline(value: /* inline */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInlineUndefined: Self = StObject.set(x, "setInline", js.undefined)
    
    @scala.inline
    def setSetItemCls(value: /* itemCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemClsUndefined: Self = StObject.set(x, "setItemCls", js.undefined)
    
    @scala.inline
    def setSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemConfigUndefined: Self = StObject.set(x, "setItemConfig", js.undefined)
    
    @scala.inline
    def setSetItemTpl(value: /* itemTpl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemTplUndefined: Self = StObject.set(x, "setItemTpl", js.undefined)
    
    @scala.inline
    def setSetLastFocused(value: () => Unit): Self = StObject.set(x, "setLastFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLastFocusedUndefined: Self = StObject.set(x, "setLastFocused", js.undefined)
    
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
    
    @scala.inline
    def setSetMaxItemCache(value: /* maxItemCache */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxItemCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxItemCacheUndefined: Self = StObject.set(x, "setMaxItemCache", js.undefined)
    
    @scala.inline
    def setSetMode(value: js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModeUndefined: Self = StObject.set(x, "setMode", js.undefined)
    
    @scala.inline
    def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPressedCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPressedClsUndefined: Self = StObject.set(x, "setPressedCls", js.undefined)
    
    @scala.inline
    def setSetPressedDelay(value: /* pressedDelay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPressedDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPressedDelayUndefined: Self = StObject.set(x, "setPressedDelay", js.undefined)
    
    @scala.inline
    def setSetScrollToTopOnRefresh(value: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setScrollToTopOnRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollToTopOnRefreshUndefined: Self = StObject.set(x, "setScrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setSetSelectedCls(value: /* selectedCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSelectedCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedClsUndefined: Self = StObject.set(x, "setSelectedCls", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    @scala.inline
    def setSetTriggerCtEvent(value: /* triggerCtEvent */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTriggerCtEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTriggerCtEventUndefined: Self = StObject.set(x, "setTriggerCtEvent", js.undefined)
    
    @scala.inline
    def setSetTriggerEvent(value: /* triggerEvent */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTriggerEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTriggerEventUndefined: Self = StObject.set(x, "setTriggerEvent", js.undefined)
    
    @scala.inline
    def setSetUseComponents(value: /* useComponents */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseComponents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseComponentsUndefined: Self = StObject.set(x, "setUseComponents", js.undefined)
    
    @scala.inline
    def setSimpleSelect(value: Boolean): Self = StObject.set(x, "simpleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleSelectUndefined: Self = StObject.set(x, "simpleSelect", js.undefined)
    
    @scala.inline
    def setSingleSelect(value: Boolean): Self = StObject.set(x, "singleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSelectUndefined: Self = StObject.set(x, "singleSelect", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setTrackOver(value: Boolean): Self = StObject.set(x, "trackOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackOverUndefined: Self = StObject.set(x, "trackOver", js.undefined)
    
    @scala.inline
    def setTriggerCtEvent(value: java.lang.String): Self = StObject.set(x, "triggerCtEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCtEventUndefined: Self = StObject.set(x, "triggerCtEvent", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: java.lang.String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    @scala.inline
    def setUpdateLastFocused(value: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Unit): Self = StObject.set(x, "updateLastFocused", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateLastFocusedUndefined: Self = StObject.set(x, "updateLastFocused", js.undefined)
    
    @scala.inline
    def setUseComponents(value: Boolean): Self = StObject.set(x, "useComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseComponentsUndefined: Self = StObject.set(x, "useComponents", js.undefined)
  }
}
