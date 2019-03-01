package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IList extends IDataView {
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of disclosureProperty
  		* @returns String
  		*/
  var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of grouped
  		* @returns Boolean
  		*/
  var getGrouped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of icon
  		* @returns Object
  		*/
  var getIcon: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of indexBar
  		* @returns Boolean/Object
  		*/
  var getIndexBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of infinite
  		* @returns Boolean
  		*/
  var getInfinite: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minimumBufferDistance
  		* @returns Number
  		*/
  var getMinimumBufferDistance: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function/Object
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of pinHeaders
  		* @returns Boolean
  		*/
  var getPinHeaders: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of preventSelectionOnDisclose
  		* @returns Boolean
  		*/
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of refreshHeightOnUpdate
  		* @returns Boolean
  		*/
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns all the items that are docked in the scroller in this list
  		* @returns Array An array of the scrollDock items
  		*/
  var getScrollDockedItems: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of striped
  		* @returns Boolean
  		*/
  var getStriped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useHeaders
  		* @returns Boolean
  		*/
  var getUseHeaders: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[scala.Boolean] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of disclosureProperty
  		* @param disclosureProperty String The new value.
  		*/
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of grouped
  		* @param grouped Boolean The new value.
  		*/
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of icon
  		* @param icon Object The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of indexBar
  		* @param indexBar Boolean/Object The new value.
  		*/
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of infinite
  		* @param infinite Boolean The new value.
  		*/
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minimumBufferDistance
  		* @param minimumBufferDistance Number The new value.
  		*/
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function/Object The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pinHeaders
  		* @param pinHeaders Boolean The new value.
  		*/
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preventSelectionOnDisclose
  		* @param preventSelectionOnDisclose Boolean The new value.
  		*/
  var setPreventSelectionOnDisclose: js.UndefOr[
    js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of refreshHeightOnUpdate
  		* @param refreshHeightOnUpdate Boolean The new value.
  		*/
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of striped
  		* @param striped Boolean The new value.
  		*/
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useHeaders
  		* @param useHeaders Boolean The new value.
  		*/
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[scala.Boolean] = js.undefined
}

object IList {
  @scala.inline
  def apply(
    IDataView: IDataView = null,
    baseCls: java.lang.String = null,
    bufferSize: scala.Int | scala.Double = null,
    defaultType: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    disclosureProperty: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDefaultType: js.Function0[java.lang.String] = null,
    getDisclosureProperty: js.Function0[java.lang.String] = null,
    getGrouped: js.Function0[scala.Boolean] = null,
    getIcon: js.Function0[_] = null,
    getIndexBar: js.Function0[_] = null,
    getInfinite: js.Function0[scala.Boolean] = null,
    getItemAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getItemHeight: js.Function0[scala.Double] = null,
    getItemIndex: js.Function1[/* item */ js.UndefOr[scala.Double], scala.Double] = null,
    getMinimumBufferDistance: js.Function0[scala.Double] = null,
    getOnItemDisclosure: js.Function0[_] = null,
    getPinHeaders: js.Function0[scala.Boolean] = null,
    getPreventSelectionOnDisclose: js.Function0[scala.Boolean] = null,
    getRefreshHeightOnUpdate: js.Function0[scala.Boolean] = null,
    getScrollDockedItems: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getStriped: js.Function0[scala.Boolean] = null,
    getUi: js.Function0[java.lang.String] = null,
    getUseHeaders: js.Function0[scala.Boolean] = null,
    getUseSimpleItems: js.Function0[scala.Boolean] = null,
    getVariableHeights: js.Function0[scala.Boolean] = null,
    getViewItems: js.Function0[_] = null,
    grouped: js.UndefOr[scala.Boolean] = js.undefined,
    indexBar: js.Any = null,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialize: js.Function0[scala.Unit] = null,
    itemHeight: scala.Int | scala.Double = null,
    onItemDisclosure: js.Any = null,
    pinHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    preventSelectionOnDisclose: js.UndefOr[scala.Boolean] = js.undefined,
    refreshHeightOnUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToRecord: js.Function3[
      /* record */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* overscroll */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDefaultType: js.Function1[/* defaultType */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisclosureProperty: js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGrouped: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setIcon: js.Function1[/* icon */ js.UndefOr[js.Any], scala.Unit] = null,
    setIndexBar: js.Function1[/* indexBar */ js.UndefOr[js.Any], scala.Unit] = null,
    setInfinite: js.Function1[/* infinite */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setItemHeight: js.Function1[/* itemHeight */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinimumBufferDistance: js.Function1[/* minimumBufferDistance */ js.UndefOr[scala.Double], scala.Unit] = null,
    setOnItemDisclosure: js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], scala.Unit] = null,
    setPinHeaders: js.Function1[/* pinHeaders */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPreventSelectionOnDisclose: js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setRefreshHeightOnUpdate: js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setStriped: js.Function1[/* striped */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUseHeaders: js.Function1[/* useHeaders */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseSimpleItems: js.Function1[/* useSimpleItems */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setVariableHeights: js.Function1[/* variableHeights */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    ui: java.lang.String = null,
    useSimpleItems: js.UndefOr[scala.Boolean] = js.undefined,
    variableHeights: js.UndefOr[scala.Boolean] = js.undefined
  ): IList = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataView)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disclosureProperty != null) __obj.updateDynamic("disclosureProperty")(disclosureProperty)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(getDefaultType)
    if (getDisclosureProperty != null) __obj.updateDynamic("getDisclosureProperty")(getDisclosureProperty)
    if (getGrouped != null) __obj.updateDynamic("getGrouped")(getGrouped)
    if (getIcon != null) __obj.updateDynamic("getIcon")(getIcon)
    if (getIndexBar != null) __obj.updateDynamic("getIndexBar")(getIndexBar)
    if (getInfinite != null) __obj.updateDynamic("getInfinite")(getInfinite)
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(getItemAt)
    if (getItemHeight != null) __obj.updateDynamic("getItemHeight")(getItemHeight)
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(getItemIndex)
    if (getMinimumBufferDistance != null) __obj.updateDynamic("getMinimumBufferDistance")(getMinimumBufferDistance)
    if (getOnItemDisclosure != null) __obj.updateDynamic("getOnItemDisclosure")(getOnItemDisclosure)
    if (getPinHeaders != null) __obj.updateDynamic("getPinHeaders")(getPinHeaders)
    if (getPreventSelectionOnDisclose != null) __obj.updateDynamic("getPreventSelectionOnDisclose")(getPreventSelectionOnDisclose)
    if (getRefreshHeightOnUpdate != null) __obj.updateDynamic("getRefreshHeightOnUpdate")(getRefreshHeightOnUpdate)
    if (getScrollDockedItems != null) __obj.updateDynamic("getScrollDockedItems")(getScrollDockedItems)
    if (getStriped != null) __obj.updateDynamic("getStriped")(getStriped)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getUseHeaders != null) __obj.updateDynamic("getUseHeaders")(getUseHeaders)
    if (getUseSimpleItems != null) __obj.updateDynamic("getUseSimpleItems")(getUseSimpleItems)
    if (getVariableHeights != null) __obj.updateDynamic("getVariableHeights")(getVariableHeights)
    if (getViewItems != null) __obj.updateDynamic("getViewItems")(getViewItems)
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (indexBar != null) __obj.updateDynamic("indexBar")(indexBar)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure)
    if (!js.isUndefined(pinHeaders)) __obj.updateDynamic("pinHeaders")(pinHeaders)
    if (!js.isUndefined(preventSelectionOnDisclose)) __obj.updateDynamic("preventSelectionOnDisclose")(preventSelectionOnDisclose)
    if (!js.isUndefined(refreshHeightOnUpdate)) __obj.updateDynamic("refreshHeightOnUpdate")(refreshHeightOnUpdate)
    if (scrollToRecord != null) __obj.updateDynamic("scrollToRecord")(scrollToRecord)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(setDefaultType)
    if (setDisclosureProperty != null) __obj.updateDynamic("setDisclosureProperty")(setDisclosureProperty)
    if (setGrouped != null) __obj.updateDynamic("setGrouped")(setGrouped)
    if (setIcon != null) __obj.updateDynamic("setIcon")(setIcon)
    if (setIndexBar != null) __obj.updateDynamic("setIndexBar")(setIndexBar)
    if (setInfinite != null) __obj.updateDynamic("setInfinite")(setInfinite)
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(setItemHeight)
    if (setMinimumBufferDistance != null) __obj.updateDynamic("setMinimumBufferDistance")(setMinimumBufferDistance)
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(setOnItemDisclosure)
    if (setPinHeaders != null) __obj.updateDynamic("setPinHeaders")(setPinHeaders)
    if (setPreventSelectionOnDisclose != null) __obj.updateDynamic("setPreventSelectionOnDisclose")(setPreventSelectionOnDisclose)
    if (setRefreshHeightOnUpdate != null) __obj.updateDynamic("setRefreshHeightOnUpdate")(setRefreshHeightOnUpdate)
    if (setStriped != null) __obj.updateDynamic("setStriped")(setStriped)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setUseHeaders != null) __obj.updateDynamic("setUseHeaders")(setUseHeaders)
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(setUseSimpleItems)
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(setVariableHeights)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (!js.isUndefined(useSimpleItems)) __obj.updateDynamic("useSimpleItems")(useSimpleItems)
    if (!js.isUndefined(variableHeights)) __obj.updateDynamic("variableHeights")(variableHeights)
    __obj.asInstanceOf[IList]
  }
}

