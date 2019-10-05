package typings.senchaUnderscoreTouch.Ext.mixin

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectable extends IBase {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
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
  ] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
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
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
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
  ] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
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
  ] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[/* deselectOnContainerClick */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[
    js.Function2[/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord], Unit]
  ] = js.undefined
}

object ISelectable {
  @scala.inline
  def apply(
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearSelections: () => Unit = null,
    config: js.Any = null,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    deselectAll: /* supress */ js.UndefOr[js.Any] => Unit = null,
    deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined,
    destroy: () => Unit = null,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    doDeselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    doSelect: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    extend: java.lang.String = null,
    getAllowDeselect: () => Boolean = null,
    getCount: () => Double = null,
    getDeselectOnContainerClick: () => Boolean = null,
    getDisableSelection: () => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLastSelected: () => Array = null,
    getMode: () => java.lang.String = null,
    getSelection: () => Array = null,
    getSelectionCount: () => Double = null,
    getSelectionMode: () => java.lang.String = null,
    hasSelection: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isLocked: () => Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => Boolean = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    mode: java.lang.String = null,
    platformConfig: js.Any = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    selectAll: /* silent */ js.UndefOr[Boolean] => Unit = null,
    selectRange: (/* startRecord */ js.UndefOr[Double], /* endRecord */ js.UndefOr[Double], /* keepExisting */ js.UndefOr[Boolean]) => Unit = null,
    self: IClass = null,
    setAllowDeselect: /* allowDeselect */ js.UndefOr[Boolean] => Unit = null,
    setDeselectOnContainerClick: /* deselectOnContainerClick */ js.UndefOr[Boolean] => Unit = null,
    setDisableSelection: /* disableSelection */ js.UndefOr[Boolean] => Unit = null,
    setLastFocused: () => Unit = null,
    setMode: /* mode */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    updateLastFocused: (/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord]) => Unit = null,
    uses: Array = null
  ): ISelectable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(js.Any.fromFunction0(clearSelections))
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(js.Any.fromFunction2(doDeselect))
    if (doSelect != null) __obj.updateDynamic("doSelect")(js.Any.fromFunction3(doSelect))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(js.Any.fromFunction0(getAllowDeselect))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getDeselectOnContainerClick != null) __obj.updateDynamic("getDeselectOnContainerClick")(js.Any.fromFunction0(getDeselectOnContainerClick))
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(js.Any.fromFunction0(getDisableSelection))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getMode != null) __obj.updateDynamic("getMode")(js.Any.fromFunction0(getMode))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(js.Any.fromFunction0(getSelectionCount))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1(setAllowDeselect))
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1(setDeselectOnContainerClick))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1(setDisableSelection))
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction0(setLastFocused))
    if (setMode != null) __obj.updateDynamic("setMode")(js.Any.fromFunction1(setMode))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(js.Any.fromFunction2(updateLastFocused))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISelectable]
  }
}

