package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IRecord
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
  implicit class IDataViewOps[Self <: IDataView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    
    @scala.inline
    def setBindStore(value: () => Unit): Self = this.set("bindStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    
    @scala.inline
    def setBlockRefresh(value: Boolean): Self = this.set("blockRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockRefresh: Self = this.set("blockRefresh", js.undefined)
    
    @scala.inline
    def setClearSelections(value: () => Unit): Self = this.set("clearSelections", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearSelections: Self = this.set("clearSelections", js.undefined)
    
    @scala.inline
    def setCollectData(value: () => Unit): Self = this.set("collectData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCollectData: Self = this.set("collectData", js.undefined)
    
    @scala.inline
    def setData(value: Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDeferEmptyText(value: Boolean): Self = this.set("deferEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferEmptyText: Self = this.set("deferEmptyText", js.undefined)
    
    @scala.inline
    def setDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = this.set("deselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
    
    @scala.inline
    def setDeselectAll(value: js.UndefOr[js.Any] => Unit): Self = this.set("deselectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeselectAll: Self = this.set("deselectAll", js.undefined)
    
    @scala.inline
    def setDeselectOnContainerClick(value: Boolean): Self = this.set("deselectOnContainerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeselectOnContainerClick: Self = this.set("deselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setDisableSelection(value: Boolean): Self = this.set("disableSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSelection: Self = this.set("disableSelection", js.undefined)
    
    @scala.inline
    def setDoDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = this.set("doDeselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoDeselect: Self = this.set("doDeselect", js.undefined)
    
    @scala.inline
    def setDoSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = this.set("doSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoSelect: Self = this.set("doSelect", js.undefined)
    
    @scala.inline
    def setEmptyText(value: java.lang.String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setFindItemByChild(value: () => Unit): Self = this.set("findItemByChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFindItemByChild: Self = this.set("findItemByChild", js.undefined)
    
    @scala.inline
    def setFindTargetByEvent(value: () => Unit): Self = this.set("findTargetByEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFindTargetByEvent: Self = this.set("findTargetByEvent", js.undefined)
    
    @scala.inline
    def setGetAllowDeselect(value: () => Boolean): Self = this.set("getAllowDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllowDeselect: Self = this.set("getAllowDeselect", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setGetData(value: () => Array): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetDeferEmptyText(value: () => Boolean): Self = this.set("getDeferEmptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDeferEmptyText: Self = this.set("getDeferEmptyText", js.undefined)
    
    @scala.inline
    def setGetDeselectOnContainerClick(value: () => Boolean): Self = this.set("getDeselectOnContainerClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDeselectOnContainerClick: Self = this.set("getDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setGetDisableSelection(value: () => Boolean): Self = this.set("getDisableSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableSelection: Self = this.set("getDisableSelection", js.undefined)
    
    @scala.inline
    def setGetEmptyText(value: () => java.lang.String): Self = this.set("getEmptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEmptyText: Self = this.set("getEmptyText", js.undefined)
    
    @scala.inline
    def setGetInline(value: () => _): Self = this.set("getInline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInline: Self = this.set("getInline", js.undefined)
    
    @scala.inline
    def setGetItemAt(value: /* index */ js.UndefOr[Double] => _): Self = this.set("getItemAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemAt: Self = this.set("getItemAt", js.undefined)
    
    @scala.inline
    def setGetItemCls(value: () => java.lang.String): Self = this.set("getItemCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemCls: Self = this.set("getItemCls", js.undefined)
    
    @scala.inline
    def setGetItemConfig(value: () => _): Self = this.set("getItemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemConfig: Self = this.set("getItemConfig", js.undefined)
    
    @scala.inline
    def setGetItemIndex(value: /* item */ js.UndefOr[Double] => Double): Self = this.set("getItemIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemIndex: Self = this.set("getItemIndex", js.undefined)
    
    @scala.inline
    def setGetItemTpl(value: () => _): Self = this.set("getItemTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemTpl: Self = this.set("getItemTpl", js.undefined)
    
    @scala.inline
    def setGetLastSelected(value: () => Array): Self = this.set("getLastSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLastSelected: Self = this.set("getLastSelected", js.undefined)
    
    @scala.inline
    def setGetLoadingText(value: () => _): Self = this.set("getLoadingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLoadingText: Self = this.set("getLoadingText", js.undefined)
    
    @scala.inline
    def setGetMaxItemCache(value: () => Double): Self = this.set("getMaxItemCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxItemCache: Self = this.set("getMaxItemCache", js.undefined)
    
    @scala.inline
    def setGetMode(value: () => java.lang.String): Self = this.set("getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMode: Self = this.set("getMode", js.undefined)
    
    @scala.inline
    def setGetNode(value: () => Unit): Self = this.set("getNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNode: Self = this.set("getNode", js.undefined)
    
    @scala.inline
    def setGetNodes(value: () => Unit): Self = this.set("getNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNodes: Self = this.set("getNodes", js.undefined)
    
    @scala.inline
    def setGetPressedCls(value: () => java.lang.String): Self = this.set("getPressedCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPressedCls: Self = this.set("getPressedCls", js.undefined)
    
    @scala.inline
    def setGetPressedDelay(value: () => Double): Self = this.set("getPressedDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPressedDelay: Self = this.set("getPressedDelay", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => Unit): Self = this.set("getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRecords: Self = this.set("getRecords", js.undefined)
    
    @scala.inline
    def setGetScrollToTopOnRefresh(value: () => Boolean): Self = this.set("getScrollToTopOnRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollToTopOnRefresh: Self = this.set("getScrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setGetSelectedCls(value: () => java.lang.String): Self = this.set("getSelectedCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectedCls: Self = this.set("getSelectedCls", js.undefined)
    
    @scala.inline
    def setGetSelectedNodes(value: () => Unit): Self = this.set("getSelectedNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectedNodes: Self = this.set("getSelectedNodes", js.undefined)
    
    @scala.inline
    def setGetSelectedRecords(value: () => Unit): Self = this.set("getSelectedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectedRecords: Self = this.set("getSelectedRecords", js.undefined)
    
    @scala.inline
    def setGetSelection(value: () => Array): Self = this.set("getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelection: Self = this.set("getSelection", js.undefined)
    
    @scala.inline
    def setGetSelectionCount(value: () => Double): Self = this.set("getSelectionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionCount: Self = this.set("getSelectionCount", js.undefined)
    
    @scala.inline
    def setGetSelectionMode(value: () => java.lang.String): Self = this.set("getSelectionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionMode: Self = this.set("getSelectionMode", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = this.set("getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    
    @scala.inline
    def setGetTriggerCtEvent(value: () => java.lang.String): Self = this.set("getTriggerCtEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTriggerCtEvent: Self = this.set("getTriggerCtEvent", js.undefined)
    
    @scala.inline
    def setGetTriggerEvent(value: () => java.lang.String): Self = this.set("getTriggerEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTriggerEvent: Self = this.set("getTriggerEvent", js.undefined)
    
    @scala.inline
    def setGetUseComponents(value: () => Boolean): Self = this.set("getUseComponents", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseComponents: Self = this.set("getUseComponents", js.undefined)
    
    @scala.inline
    def setGetViewItems(value: () => _): Self = this.set("getViewItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetViewItems: Self = this.set("getViewItems", js.undefined)
    
    @scala.inline
    def setHandleException(value: () => Unit): Self = this.set("handleException", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHandleException: Self = this.set("handleException", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = this.set("hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasSelection: Self = this.set("hasSelection", js.undefined)
    
    @scala.inline
    def setIndexOf(value: () => Unit): Self = this.set("indexOf", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setInline(value: js.Any): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = this.set("isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setIsSelected(value: js.UndefOr[js.Any] => Boolean): Self = this.set("isSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setItemCls(value: java.lang.String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    
    @scala.inline
    def setItemConfig(value: js.Any): Self = this.set("itemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemConfig: Self = this.set("itemConfig", js.undefined)
    
    @scala.inline
    def setItemSelector(value: Boolean): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    
    @scala.inline
    def setItemTpl(value: js.Any): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    
    @scala.inline
    def setLoadingText(value: js.Any): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setMaxItemCache(value: Double): Self = this.set("maxItemCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemCache: Self = this.set("maxItemCache", js.undefined)
    
    @scala.inline
    def setMode(value: java.lang.String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setOverItemCls(value: Boolean): Self = this.set("overItemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverItemCls: Self = this.set("overItemCls", js.undefined)
    
    @scala.inline
    def setPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _
    ): Self = this.set("prepareData", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePrepareData: Self = this.set("prepareData", js.undefined)
    
    @scala.inline
    def setPressedCls(value: java.lang.String): Self = this.set("pressedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressedCls: Self = this.set("pressedCls", js.undefined)
    
    @scala.inline
    def setPressedDelay(value: Double): Self = this.set("pressedDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressedDelay: Self = this.set("pressedDelay", js.undefined)
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRefreshNode(value: () => Unit): Self = this.set("refreshNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRefreshNode: Self = this.set("refreshNode", js.undefined)
    
    @scala.inline
    def setScrollToTopOnRefresh(value: Boolean): Self = this.set("scrollToTopOnRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToTopOnRefresh: Self = this.set("scrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = this.set("select", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectAll(value: js.UndefOr[Boolean] => Unit): Self = this.set("selectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setSelectRange(value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit): Self = this.set("selectRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectRange: Self = this.set("selectRange", js.undefined)
    
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = this.set("selectedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCls: Self = this.set("selectedCls", js.undefined)
    
    @scala.inline
    def setSelectedItemCls(value: Boolean): Self = this.set("selectedItemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemCls: Self = this.set("selectedItemCls", js.undefined)
    
    @scala.inline
    def setSetAllowDeselect(value: js.UndefOr[Boolean] => Unit): Self = this.set("setAllowDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAllowDeselect: Self = this.set("setAllowDeselect", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[Array] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetDeferEmptyText(value: /* deferEmptyText */ js.UndefOr[Boolean] => Unit): Self = this.set("setDeferEmptyText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDeferEmptyText: Self = this.set("setDeferEmptyText", js.undefined)
    
    @scala.inline
    def setSetDeselectOnContainerClick(value: js.UndefOr[Boolean] => Unit): Self = this.set("setDeselectOnContainerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDeselectOnContainerClick: Self = this.set("setDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setSetDisableSelection(value: js.UndefOr[Boolean] => Unit): Self = this.set("setDisableSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableSelection: Self = this.set("setDisableSelection", js.undefined)
    
    @scala.inline
    def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setEmptyText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEmptyText: Self = this.set("setEmptyText", js.undefined)
    
    @scala.inline
    def setSetInline(value: /* inline */ js.UndefOr[js.Any] => Unit): Self = this.set("setInline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInline: Self = this.set("setInline", js.undefined)
    
    @scala.inline
    def setSetItemCls(value: /* itemCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setItemCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemCls: Self = this.set("setItemCls", js.undefined)
    
    @scala.inline
    def setSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemConfig: Self = this.set("setItemConfig", js.undefined)
    
    @scala.inline
    def setSetItemTpl(value: /* itemTpl */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemTpl: Self = this.set("setItemTpl", js.undefined)
    
    @scala.inline
    def setSetLastFocused(value: () => Unit): Self = this.set("setLastFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetLastFocused: Self = this.set("setLastFocused", js.undefined)
    
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = this.set("setLoadingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLoadingText: Self = this.set("setLoadingText", js.undefined)
    
    @scala.inline
    def setSetMaxItemCache(value: /* maxItemCache */ js.UndefOr[Double] => Unit): Self = this.set("setMaxItemCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxItemCache: Self = this.set("setMaxItemCache", js.undefined)
    
    @scala.inline
    def setSetMode(value: js.UndefOr[java.lang.String] => Unit): Self = this.set("setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMode: Self = this.set("setMode", js.undefined)
    
    @scala.inline
    def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setPressedCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPressedCls: Self = this.set("setPressedCls", js.undefined)
    
    @scala.inline
    def setSetPressedDelay(value: /* pressedDelay */ js.UndefOr[Double] => Unit): Self = this.set("setPressedDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPressedDelay: Self = this.set("setPressedDelay", js.undefined)
    
    @scala.inline
    def setSetScrollToTopOnRefresh(value: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Unit): Self = this.set("setScrollToTopOnRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScrollToTopOnRefresh: Self = this.set("setScrollToTopOnRefresh", js.undefined)
    
    @scala.inline
    def setSetSelectedCls(value: /* selectedCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setSelectedCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSelectedCls: Self = this.set("setSelectedCls", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    
    @scala.inline
    def setSetTriggerCtEvent(value: /* triggerCtEvent */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTriggerCtEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTriggerCtEvent: Self = this.set("setTriggerCtEvent", js.undefined)
    
    @scala.inline
    def setSetTriggerEvent(value: /* triggerEvent */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTriggerEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTriggerEvent: Self = this.set("setTriggerEvent", js.undefined)
    
    @scala.inline
    def setSetUseComponents(value: /* useComponents */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseComponents", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseComponents: Self = this.set("setUseComponents", js.undefined)
    
    @scala.inline
    def setSimpleSelect(value: Boolean): Self = this.set("simpleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleSelect: Self = this.set("simpleSelect", js.undefined)
    
    @scala.inline
    def setSingleSelect(value: Boolean): Self = this.set("singleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleSelect: Self = this.set("singleSelect", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTrackOver(value: Boolean): Self = this.set("trackOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackOver: Self = this.set("trackOver", js.undefined)
    
    @scala.inline
    def setTriggerCtEvent(value: java.lang.String): Self = this.set("triggerCtEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerCtEvent: Self = this.set("triggerCtEvent", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: java.lang.String): Self = this.set("triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
    
    @scala.inline
    def setUpdateLastFocused(value: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Unit): Self = this.set("updateLastFocused", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateLastFocused: Self = this.set("updateLastFocused", js.undefined)
    
    @scala.inline
    def setUseComponents(value: Boolean): Self = this.set("useComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseComponents: Self = this.set("useComponents", js.undefined)
  }
}
