package typings
package senchaUnderscoreTouchLib.ExtNs.mixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectable
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
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
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
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
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
}

object ISelectable {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    allowDeselect: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearSelections: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    deselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    deselectAll: js.Function1[/* supress */ js.UndefOr[js.Any], scala.Unit] = null,
    deselectOnContainerClick: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.Function0[scala.Unit] = null,
    disableSelection: js.UndefOr[scala.Boolean] = js.undefined,
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
    extend: java.lang.String = null,
    getAllowDeselect: js.Function0[scala.Boolean] = null,
    getCount: js.Function0[scala.Double] = null,
    getDeselectOnContainerClick: js.Function0[scala.Boolean] = null,
    getDisableSelection: js.Function0[scala.Boolean] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLastSelected: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getMode: js.Function0[java.lang.String] = null,
    getSelection: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getSelectionCount: js.Function0[scala.Double] = null,
    getSelectionMode: js.Function0[java.lang.String] = null,
    hasSelection: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isLocked: js.Function0[scala.Boolean] = null,
    isSelected: js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean] = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    mode: java.lang.String = null,
    platformConfig: js.Any = null,
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
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAllowDeselect: js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDeselectOnContainerClick: js.Function1[/* deselectOnContainerClick */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDisableSelection: js.Function1[/* disableSelection */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLastFocused: js.Function0[scala.Unit] = null,
    setMode: js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    updateLastFocused: js.Function2[
      /* newRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      /* oldRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISelectable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(clearSelections)
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(deselectAll)
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(doDeselect)
    if (doSelect != null) __obj.updateDynamic("doSelect")(doSelect)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(getAllowDeselect)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getDeselectOnContainerClick != null) __obj.updateDynamic("getDeselectOnContainerClick")(getDeselectOnContainerClick)
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(getDisableSelection)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(getLastSelected)
    if (getMode != null) __obj.updateDynamic("getMode")(getMode)
    if (getSelection != null) __obj.updateDynamic("getSelection")(getSelection)
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(getSelectionCount)
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(getSelectionMode)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(hasSelection)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isLocked != null) __obj.updateDynamic("isLocked")(isLocked)
    if (isSelected != null) __obj.updateDynamic("isSelected")(isSelected)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll)
    if (selectRange != null) __obj.updateDynamic("selectRange")(selectRange)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(setAllowDeselect)
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(setDeselectOnContainerClick)
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(setDisableSelection)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(setLastFocused)
    if (setMode != null) __obj.updateDynamic("setMode")(setMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(updateLastFocused)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISelectable]
  }
}

