package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectable extends IBase {
  
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Deselects the given record s
    * @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
    * @param suppressEvent Boolean If true the deselect event will not be fired.
    */
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Deselects all records
    * @param supress Object
    */
  var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  
  /** [Method] Deselects a record instance by record instance or index
    * @param records Ext.data.Model/Number An array of records or an index.
    * @param suppressEvent Boolean Set to false to not fire a deselect event.
    */
  var doDeselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Selects a record instance by record instance or index
    * @param records Ext.data.Model/Number An array of records or an index.
    * @param keepExisting Boolean
    * @param suppressEvent Boolean Set to false to not fire a select event.
    */
  var doSelect: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Returns the value of allowDeselect
    * @returns Boolean
    */
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the number of selections
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of deselectOnContainerClick
    * @returns Boolean
    */
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of disableSelection
    * @returns Boolean
    */
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the array of previously selected items
    * @returns Array The previous selection.
    */
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of mode
    * @returns String
    */
  var getMode: js.UndefOr[js.Function0[String]] = js.native
  
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
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns true if there is a selected record
    * @returns Boolean
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the Selectable is currently locked
    * @returns Boolean True if currently locked
    */
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the specified row is selected
    * @param record Ext.data.Model/Number The record or index of the record to check.
    * @returns Boolean
    */
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var mode: js.UndefOr[String] = js.native
  
  /** [Method] Adds the given records to the currently selected set
    * @param records Ext.data.Model/Array/Number The records to select.
    * @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
    * @param suppressEvent Boolean If true, the select event will not be fired.
    */
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Selects all records
    * @param silent Boolean true to suppress all select events.
    */
  var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
    * @param startRecord Number The index of the first row in the range.
    * @param endRecord Number The index of the last row in the range.
    * @param keepExisting Boolean true to retain existing selections.
    */
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRecord */ js.UndefOr[Double], 
      /* endRecord */ js.UndefOr[Double], 
      /* keepExisting */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the value of allowDeselect
    * @param allowDeselect Boolean The new value.
    */
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of deselectOnContainerClick
    * @param deselectOnContainerClick Boolean The new value.
    */
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[/* deselectOnContainerClick */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of disableSelection
    * @param disableSelection Boolean The new value.
    */
  var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of mode
    * @param mode String The new value.
    */
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets a record as the last focused record
    * @param newRecord Ext.data.Record
    * @param oldRecord Ext.data.Record
    */
  var updateLastFocused: js.UndefOr[
    js.Function2[/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord], Unit]
  ] = js.native
}
object ISelectable {
  
  @scala.inline
  def apply(): ISelectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectable]
  }
  
  @scala.inline
  implicit class ISelectableOps[Self <: ISelectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    
    @scala.inline
    def setClearSelections(value: () => Unit): Self = this.set("clearSelections", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearSelections: Self = this.set("clearSelections", js.undefined)
    
    @scala.inline
    def setDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("deselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
    
    @scala.inline
    def setDeselectAll(value: /* supress */ js.UndefOr[js.Any] => Unit): Self = this.set("deselectAll", js.Any.fromFunction1(value))
    
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
    def setDoDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("doDeselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoDeselect: Self = this.set("doDeselect", js.undefined)
    
    @scala.inline
    def setDoSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("doSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoSelect: Self = this.set("doSelect", js.undefined)
    
    @scala.inline
    def setGetAllowDeselect(value: () => Boolean): Self = this.set("getAllowDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllowDeselect: Self = this.set("getAllowDeselect", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setGetDeselectOnContainerClick(value: () => Boolean): Self = this.set("getDeselectOnContainerClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDeselectOnContainerClick: Self = this.set("getDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setGetDisableSelection(value: () => Boolean): Self = this.set("getDisableSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableSelection: Self = this.set("getDisableSelection", js.undefined)
    
    @scala.inline
    def setGetLastSelected(value: () => Array): Self = this.set("getLastSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLastSelected: Self = this.set("getLastSelected", js.undefined)
    
    @scala.inline
    def setGetMode(value: () => String): Self = this.set("getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMode: Self = this.set("getMode", js.undefined)
    
    @scala.inline
    def setGetSelection(value: () => Array): Self = this.set("getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelection: Self = this.set("getSelection", js.undefined)
    
    @scala.inline
    def setGetSelectionCount(value: () => Double): Self = this.set("getSelectionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionCount: Self = this.set("getSelectionCount", js.undefined)
    
    @scala.inline
    def setGetSelectionMode(value: () => String): Self = this.set("getSelectionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionMode: Self = this.set("getSelectionMode", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = this.set("hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasSelection: Self = this.set("hasSelection", js.undefined)
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = this.set("isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = this.set("isSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("select", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("selectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setSelectRange(
      value: (/* startRecord */ js.UndefOr[Double], /* endRecord */ js.UndefOr[Double], /* keepExisting */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("selectRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectRange: Self = this.set("selectRange", js.undefined)
    
    @scala.inline
    def setSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAllowDeselect: Self = this.set("setAllowDeselect", js.undefined)
    
    @scala.inline
    def setSetDeselectOnContainerClick(value: /* deselectOnContainerClick */ js.UndefOr[Boolean] => Unit): Self = this.set("setDeselectOnContainerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDeselectOnContainerClick: Self = this.set("setDeselectOnContainerClick", js.undefined)
    
    @scala.inline
    def setSetDisableSelection(value: /* disableSelection */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisableSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableSelection: Self = this.set("setDisableSelection", js.undefined)
    
    @scala.inline
    def setSetLastFocused(value: () => Unit): Self = this.set("setLastFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetLastFocused: Self = this.set("setLastFocused", js.undefined)
    
    @scala.inline
    def setSetMode(value: /* mode */ js.UndefOr[String] => Unit): Self = this.set("setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMode: Self = this.set("setMode", js.undefined)
    
    @scala.inline
    def setUpdateLastFocused(value: (/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord]) => Unit): Self = this.set("updateLastFocused", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateLastFocused: Self = this.set("updateLastFocused", js.undefined)
  }
}
